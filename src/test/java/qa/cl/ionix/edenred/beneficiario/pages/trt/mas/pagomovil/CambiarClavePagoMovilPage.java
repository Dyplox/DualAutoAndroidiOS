package qa.cl.ionix.edenred.beneficiario.pages.trt.mas.pagomovil;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class CambiarClavePagoMovilPage {

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == 'Cambiar Clave Pago Móvil'`]")
    private WebElement cambiarClavePagoMovilBtn;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == 'Cambiar Clave'`]")
    private WebElement cambiarClaveBtn;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"fue cambiada exitosamente!\"`]")
    private WebElement cambiadaExitosamenteLbl;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"Cerrar\"`]")
    private WebElement cerrarBtn;

    //Reestablecer
    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"Restablecer\"`]")
    private WebElement ReestablecerBtn;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == 'Para reestablecer tu clave de pago, deberás volver a iniciar sesión'`]")
    private WebElement infoReestablecerLbl;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == 'Aceptar'`]")
    private WebElement aceptarBtn;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"Cancelar\"`]")
    private WebElement cancelarBtn;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"circle close\"`]")
    private WebElement cerrarPopUpBtn;
}