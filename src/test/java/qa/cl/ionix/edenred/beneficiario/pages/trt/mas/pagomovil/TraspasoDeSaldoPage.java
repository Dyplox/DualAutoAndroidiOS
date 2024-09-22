package qa.cl.ionix.edenred.beneficiario.pages.trt.mas.pagomovil;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class TraspasoDeSaldoPage {

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"Siguiente\"`]")
    private WebElement siguienteBtn;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"Ingresar RUT\"`]")
    private WebElement rutField;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Traspaso de saldo\"`]")
    private WebElement volverTraspasoBtn;

}