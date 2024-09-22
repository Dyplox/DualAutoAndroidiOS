package qa.cl.ionix.edenred.beneficiario.pages.trt.mas.configuracion;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class CambiarClaveWebPage {

    // Se debe realizar la validacion de la clave movil de pago

    // Carga de rut
    @AndroidFindBy(id = "")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"RUT\"`]")
    private WebElement rutfld;

    @AndroidFindBy(id = "")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"Recuperar clave web\"`]")
    private WebElement recuperarClaveWebBtn;
}