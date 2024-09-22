package qa.cl.ionix.edenred.beneficiario.pages.trt;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class PagarPage {

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"Pagar\"`]")
    private WebElement pagarBtn;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeImage[`name == \"logo_banner\"`]")
    private WebElement logoBannerTrt;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Realiza tu pago con:\"`]")
    private WebElement realizarPagoLbl;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Código de comercio\"`]")
    private WebElement pagoCodigoComercioBtn;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeImage[`name == \"circle_pay\"`][2]")
    private WebElement pagoClaveDinamicaBtn;

}