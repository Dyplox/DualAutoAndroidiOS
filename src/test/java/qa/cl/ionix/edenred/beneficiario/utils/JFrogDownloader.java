package qa.cl.ionix.edenred.beneficiario.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.MalformedJsonException;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static qa.cl.ionix.edenred.beneficiario.utils.Constants.*;

public class JFrogDownloader {

    private OkHttpClient client;
    private String nameApp = null;
    private String version = null;
    private static final Logger logger = LoggerFactory.getLogger(JFrogDownloader.class);


    public JFrogDownloader() {
        this.client = new OkHttpClient();
    }

    public void getAppArtifactory(String platform, String app) throws IOException {
        String filtroApp = "";
        String linkApp = "";
        switch (platform.toLowerCase()) {
            case "ios":
                if (app.equalsIgnoreCase(TRJ)) {
                    filtroApp = BASE_URL + URI_BUSQUEDA + IOS_TRJ;
                    nameApp = IOS_TRJ;
                } else if (app.equalsIgnoreCase(Constants.TRT)) {
                    filtroApp = BASE_URL + URI_BUSQUEDA + IOS_TRT;
                    nameApp = IOS_TRT;
                }
                break;
            case "android":
                if (app.equalsIgnoreCase(TRJ)) {
                    filtroApp = BASE_URL + URI_BUSQUEDA + ANDROID_TRJ;
                    nameApp = ANDROID_TRJ;
                } else if (app.equalsIgnoreCase(Constants.TRT)) {
                    filtroApp = BASE_URL + URI_BUSQUEDA + ANDROID_TRT;
                    nameApp = ANDROID_TRT;
                }
                break;
            default:
                throw new IllegalStateException("Invalid platform o system operative: " + filtroApp);
        }
        linkApp = getLatestVersion(filtroApp).replace(URI_BUSQUEDA, URI_DESCARGA);
        downloadApk(linkApp, nameApp);
    }

    public String getLatestVersion(String url) throws IOException {
        String urlFinal = "";
        String credentials = Credentials.basic("gitlabrelease", "gitlabrelease");
        Request request = new Request.Builder()
                .url(url)
                .header("Authorization", credentials)
                .build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Failed to download file: " + response);
            String responseBody = response.body().string();
            logger.info(responseBody);
            JsonElement jsonElement = JsonParser.parseString(responseBody).getAsJsonObject();
            JsonArray children = jsonElement.getAsJsonObject().getAsJsonArray("children");
            JsonObject latestVersion = null;

            for (JsonElement element : children) {
                JsonObject versionObj = element.getAsJsonObject();
                String uri = versionObj.get("uri").getAsString();
                // Obtener el número de versión
                String versionNumberStr = uri.substring(1);
                String[] parts = versionNumberStr.split("\\.");
                if (parts.length == 3) {
                    int major = Integer.parseInt(parts[0]);
                    int minor = Integer.parseInt(parts[1]);
                    int patch = Integer.parseInt(parts[2]);
                    int versionNumber = major * 10000 + minor * 100 + patch;

                    if (latestVersion == null || versionNumber > getVersionNumber(latestVersion)) {
                        latestVersion = versionObj;
                    }
                }
            }
            logger.info("Ultima Version = {}", latestVersion.get("uri").getAsString());
            nameApp = nameApp + latestVersion.get("uri").getAsString().replace("/", "-");
            urlFinal = url + latestVersion.get("uri").getAsString();
            return urlFinal;
        } catch (Exception e) {
            logger.error("Error al obtener la ultima version: {}", e.getMessage());
            return e.getMessage();
        }
    }

    public static int getVersionNumber(JsonObject versionObj) {
        String uri = versionObj.get("uri").getAsString();
        String versionNumberStr = uri.substring(1);
        String[] parts = versionNumberStr.split("\\.");
        if (parts.length == 3) {
            int major = Integer.parseInt(parts[0]);
            int minor = Integer.parseInt(parts[1]);
            int patch = Integer.parseInt(parts[2]);
            return major * 10000 + minor * 100 + patch;
        }
        return 0;
    }

    public void downloadApk(String url, String outputFileName) throws IOException {
        url = url + nameApp + SNAPSHOT;

        if (nameApp.contains(ANDROID.toLowerCase())) {
            url = url + ".apk";
            outputFileName = outputFileName + ".apk";
        } else {
            url = url + ".ipa";
            outputFileName = outputFileName + ".ipa";
        }

        logger.info("URL descargas: {}", url);
        String credentials = Credentials.basic("gitlabrelease", "gitlabrelease");
        String detino = System.getProperty("user.dir") + "/src/test/resources/apps" + outputFileName;
        Request request = new Request.Builder()
                .url(url)
                .header("Authorization", credentials)
                .build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new RuntimeException("Failed to download file: " + response);

            try (InputStream inputStream = response.body().byteStream();
                 OutputStream outputStream = new FileOutputStream(detino)) {
                byte[] buffer = new byte[4 * 1024];
                int read;
                while ((read = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, read);
                }
                logger.info("Archivo descargado en: {}", detino);
            }
        }
    }
}