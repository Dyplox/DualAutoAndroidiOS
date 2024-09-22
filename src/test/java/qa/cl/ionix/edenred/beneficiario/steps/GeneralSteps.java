package qa.cl.ionix.edenred.beneficiario.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Dado;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import qa.cl.ionix.edenred.beneficiario.base.AppFactory;
import qa.cl.ionix.edenred.beneficiario.utils.JFrogDownloader;

public class GeneralSteps {

    JFrogDownloader jFrogDownloader = new JFrogDownloader();
    static String platform = System.getenv("os");
    static String appToTest = System.getenv("app");
    private Scenario scenario;

    private static final Logger logger =  LoggerFactory.getLogger(GeneralSteps.class);

    @Before
    public void beforeHook(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("que el QA desea ingrear a la APP para certificarla")
    public void que_el_qa_desea_ingrear_a_la_app_para_certificarla() throws Exception {
        jFrogDownloader.getAppArtifactory(platform, appToTest);

        AppFactory.setUp(scenario);
    }

    @After
    public void endTest() {
        logger.info("Se cierra la Session de appium");
        // closeSessionApp(scenario);
    }
}