# language: es
# author: @AbelGuAr
# encoding: utf-8

Necesidad del negocio: Realizar las pruebas automatizadas al modulo Login de TRT

  Antecedentes: Ingresar a la vida de Login
    Dado que el QA desea ingrear a la APP para certificarla

  @Regression
  Esquema del escenario: Verificar si un usuario podra iniciar sesion con info valida
    Dado el ingresa "<RUT>", "<claveWeb>"
    E ingresa el OTP enviado a su email registrado
    Cuando se valida el codigo OTP
    Pero si el OTP es correcto
    Y Crear Clave Pago Movil
    Entonces valida el ingreso y carga del modulo Pagar

    Ejemplos:
      | RUT          | claveWeb   |
      | ionixtesters | Password#1 |