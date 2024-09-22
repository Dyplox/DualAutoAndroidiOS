package qa.cl.ionix.edenred.beneficiario.pages.trt;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class ComerciosPage {

    @AndroidFindBy(id = "")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == '“servicios.edenred.cl” would like to use your current location.'`]")
    private WebElement permisosLbl;

    @AndroidFindBy(id = "")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"Don’t Allow\"`]")
    private WebElement negarPermisoBtn;

    @AndroidFindBy(id = "")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"Allow\"`]")
    private WebElement darPermisoBtn;

}