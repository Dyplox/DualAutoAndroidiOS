package qa.cl.ionix.edenred.beneficiario.pages.trt.mas.informacion;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class ComoPagarPage {
    @AndroidFindBy(id = "")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"¡Bienvenido!\"`]")
    private WebElement bievendioLbl;

    @AndroidFindBy(id = "")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"Siguiente\"`]")
    private WebElement siguienteBtn;

    @AndroidFindBy(id = "")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Omitir\"`]")
    private WebElement omitirBtn;

    @AndroidFindBy(id = "")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Volver\"`]")
    private WebElement volverBtn;

    @AndroidFindBy(id = "")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"FINALIZAR\"`]")
    private WebElement finalizarBtn;

}