package qa.cl.ionix.edenred.beneficiario.pages.trt;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class SaldoPage {

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"Saldo\"`]")
    private WebElement saldoBtn;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Saldo disponible\"`]")
    private WebElement saldoDisponibleLbl;

    //  Problema para realizar la lectura del saldo actual, no contiene ID
    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"$000.000\"`]")
    private WebElement saldoActualLbl;

    //  Problema para realizar la lectura de numero de cuenta actual, no contiene ID
    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"605082******7670\"`]")
    private WebElement numeroTarjetaLbl;


    //  Problema para realizar la lectura del historial de pagos, no contienen ID
    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeImage[`name == \"circle_pay\"`][2]")
    private WebElement pagoClaveDinamicaBtn;

}