package qa.cl.ionix.edenred.beneficiario.pages.trt.mas.pagomovil;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class TarjetasAsociadasPage {

    // Tarjetas Asociadas
    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == Tarjetas Asociadas`]")
    private WebElement tarjetasAsociadasBtn;

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == 'Si es que no tienes asociada tu tarjeta comunicate con Edenred']")
    private WebElement tarjetasAsociadasLbl;

    // No trae el ID para la lista de tarjetas asociadas
    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/" +
            "XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/" +
            "XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/" +
            "XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTable")
    private WebElement tarjetasAsociadasList;

    // falta agregar el boton para activar la tarjeta predeterminada.

    @AndroidFindBy(id = "com.example:id/username")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == Más`][1]")
    private WebElement volverMasBtn;

}