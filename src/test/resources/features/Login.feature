#language: es

Característica: Inicio de sesion exitoso

  @loginPage
  Escenario: Inicio de sesion en la pagina web del exito
    Dado que el usuario se encuentre en la pagina web
    Cuando el usuario ingresa email y contrasena
    Y de clic en el boton entrar
    Entonces el usuario visualiza la pagina de inicio