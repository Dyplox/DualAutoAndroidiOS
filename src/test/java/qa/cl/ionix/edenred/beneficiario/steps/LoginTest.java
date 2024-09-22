package qa.cl.ionix.edenred.beneficiario.steps;

import qa.cl.ionix.edenred.beneficiario.base.AppFactory;
import qa.cl.ionix.edenred.beneficiario.pages.trt.LoginPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class LoginTest extends AppFactory {

    LoginPage loginPage = new LoginPage(driver);


    @Dado("el ingresa {string}, {string}")
    public void el_ingresa(String rut, String claveWeb) {
        loginPage.login(rut, claveWeb);
    }
    @Dado("ingresa el OTP enviado a su email registrado")
    public void ingresa_el_otp_enviado_a_su_email_registrado() {
    }
    @Cuando("se valida el codigo OTP")
    public void se_valida_el_codigo_otp() {
    }
    @Cuando("si el OTP es correcto")
    public void si_el_otp_es_correcto() {
    }
    @Cuando("Crear Clave Pago Movil")
    public void crear_clave_pago_movil() {
    }
    @Entonces("valida el ingreso y carga del modulo Pagar")
    public void valida_el_ingreso_y_carga_del_modulo_pagar() {
    }
}