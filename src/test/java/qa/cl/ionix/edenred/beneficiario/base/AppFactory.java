package qa.cl.ionix.edenred.beneficiario.base;

import io.cucumber.java.Scenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.net.URL;

public class AppFactory {

    static String platform = System.getenv("os");
    protected static AppiumDriver driver;
    private static String username = System.getenv("USER_NAME");
    private static String accessKey = System.getenv("USER_KEY");
    private static final Logger logger = LoggerFactory.getLogger(AppFactory.class);

    public static void setUp(Scenario scenario) throws Exception {
        String app = System.getenv("BROWSERSTACK_APP_ID"); // BrowserStack App URL
        DesiredCapabilities capabilities = new DesiredCapabilities();

        // BrowserStack capabilities
        capabilities.setCapability("browserstack.user", username);
        capabilities.setCapability("browserstack.key", accessKey);
        capabilities.setCapability("app", app);

        // General capabilities
        capabilities.setCapability("project", "Edenred Beneficiario");
        capabilities.setCapability("platformName", platform.equals("ios") ? "iOS" : "Android");

        // Test Management specific capabilities
        capabilities.setCapability("browserstack.debug", "true");
        capabilities.setCapability("browserstack.networkLogs", "true");
        capabilities.setCapability("browserstack.video", "true");

        logger.info("Setting up Appium driver for platform: " + platform);
        switch (platform.toLowerCase()) {
            case "ios":
                capabilities.setCapability("automationName", "XCUITest");
                capabilities.setCapability("platformName", "iOS");
                capabilities.setCapability("device", "iPhone Developer");
                capabilities.setCapability("os_version", "18.0");
                capabilities.setCapability("bundleId", "com.ionixqa.WebDriverAgentRunner");
                //driver = new IOSDriver(new URL("http://hub.browserstack.com/wd/hub"), capabilities);
                driver = new IOSDriver(new URL("127.0.0.1/4723/wd/hub"), capabilities);
                break;
            case "android":
                capabilities.setCapability("device", "Google Pixel 3");
                capabilities.setCapability("os_version", "9.0");
                //driver = new AndroidDriver(new URL("http://hub.browserstack.com/wd/hub"), capabilities);
                driver = new AndroidDriver(new URL("127.0.0.1/4723/wd/hub"), capabilities);
                break;
            default:
                throw new IllegalStateException("Invalid platform: " + platform);
        }
    }
}