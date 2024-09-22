package qa.cl.ionix.edenred.beneficiario.pages.trt;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ClavePagoMobilPage {

    private AppiumDriver driver;

    public ClavePagoMobilPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Clave Pago Movil
    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"Crear Clave\"`]")
    private WebElement crearClaveButton;

    // Ingresar numeros, borrar y enter
    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"1\"`]")
    private WebElement numerosButton;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"erase\"`]")
    private WebElement borrarButton;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"enter\"`]")
    private WebElement enterButton;

    // Envio de la clave en el sistema de forma existosa - realizar una espera
    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"fue creada exitosamente!\"`]")
    private WebElement creadaExitosamenteLbl;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"Continuar\"`]")
    private WebElement continuarButton;

    // Vista Bienvenida para el usuario comensar a usar la APP
    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"¡Todo Listo!\"`]")
    private WebElement todoListoLbl;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"¡Comenzar!\"`]")
    private WebElement comerzarButton;

    public void crearClave() {
        crearClaveButton.click();
    }

    public void digitarNumeroClave(int numero) {
        numerosButton.sendKeys(String.valueOf(numero));
    }

    public void borrarNumeroClave() {
        borrarButton.click();
    }

    public void enterNumeroClave() {
        enterButton.click();
    }
}