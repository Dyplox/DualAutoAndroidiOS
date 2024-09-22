package qa.cl.ionix.edenred.beneficiario.pages.trt.mas;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class MasPage {

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"Más\"`]")
    private WebElement masBtn;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Pago Móvil\"`]")
    private WebElement pagoMovilLbl;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Mi Tarjeta Edenred\"`]")
    private WebElement miTarjetaEdenredLbl;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Configuración\"`]")
    private WebElement configuracionLbl;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Información\"`]")
    private WebElement informacionLbl;

    //Redes sociales
    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Redes Sociales\"`]")
    private WebElement redesSocialesLbl;

    @AndroidFindBy(id = "")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"facebook\"`]")
    private WebElement facebookBtn;

    @AndroidFindBy(id = "")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"twitter\"`]")
    private WebElement twitterBtn;

    @AndroidFindBy(id = "")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"linkedin\"`]")
    private WebElement linkedinBtn;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == 'CERRAR SESIÓN'`]")
    private WebElement cerrarSesionBtn;
}
