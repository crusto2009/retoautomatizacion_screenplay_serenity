package com.exito.ui.Home;


import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target BTN_MICUENTA = Target.the("Boton mi cuenta").locatedBy("//*[@id='__next']/header/section/div/div[2]/div[2]/a");

    public static final Target BTN_LOGINEMAILCONTRASENA= Target.the("Boton inicio email y contraseña").locatedBy("//div[contains(@class,'vtex-login-2-x-emailPasswordOptionBtn')]");

    public static final Target TXT_EMAIL = Target.the("Input email").locatedBy("//*[@placeholder='Ingresa tu email']");

    public static final Target TXT_CONTRASENA = Target.the("Input contraseña").locatedBy("//*[@placeholder='Ingresa tu contraseña']");

    public static final Target BTN_ENTRAR = Target.the("Boton entrar").locatedBy("//span[text()='Entrar']");
    public static final Target TXT_TITULO = Target.the("Titulo usuario logueado").locatedBy("//span[text()='Hola  ']");



}
