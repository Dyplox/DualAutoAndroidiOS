package qa.cl.ionix.edenred.beneficiario.pages.trt;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginPage {

    private AppiumDriver driver;

    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(15)), this);
    }
    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"RUT\"`]")
    private WebElement rutField;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSecureTextField[`value == \"Clave Web\"`]")
    private WebElement claveWebField;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"visible\"`]")
    private WebElement claveVisible;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"Ingresar\"`]")
    private WebElement ingresarButton;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Recuperar Clave\"`]")
    private WebElement recuperarClaveButton;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Registrarse \"`]")
    private WebElement registrarseButton;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Tarjeta No Personalizada\"`]")
    private WebElement tNPButton;

    // Vista Login TNP
    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"xxxx-xxxx-xxxx-xxxx\"`]")
    private WebElement numeroTarjetaField;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"Código Verificador\"`]")
    private WebElement codigoVerificadorField;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSecureTextField[`value == \"PIN\"`]")
    private WebElement pinField;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSecureTextField[`value == \"Repetir PIN\"`]")
    private WebElement repetirPinField;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Iniciar Sesión\"`]")
    private WebElement iniciarSesionButton;

    public void login(String rut, String claveWeb) {
        rutField.sendKeys(rut);
        claveWebField.sendKeys(claveWeb);
    }
}