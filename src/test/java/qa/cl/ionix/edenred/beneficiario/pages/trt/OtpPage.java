package qa.cl.ionix.edenred.beneficiario.pages.trt;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class OtpPage {

    private AppiumDriver driver;

    // Validar OTP
    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"código\"`]")
    private WebElement otpField;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Validar código\"`]")
    private WebElement validarCodigoButton;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"No lo he recibido, reenviar código\"`]")
    private WebElement reenviarOtpButton;

    // Para Comenzar ...
    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Te ayudamos a configurar tu aplicación de Pago Móvil Edenred.\"`]")
    private WebElement paraComenzarLbl;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"Continuar\"`]")
    private WebElement continuarButton;

    public OtpPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void validarOtp(String otp) {
        otpField.sendKeys(otp);
    }
}