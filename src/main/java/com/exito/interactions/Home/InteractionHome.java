package com.exito.interactions.Home;

import com.exito.questions.PaginaInicialQuestion;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickInteraction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import static com.exito.ui.Home.HomePage.*;

public class InteractionHome {

    public static ClickInteraction hacerClickBotonMiCuenta(){
        return Click.on(BTN_MICUENTA);
    }

    public static ClickInteraction hacerClickBotonIngresarEmailContrasena(){
        return Click.on(BTN_LOGINEMAILCONTRASENA);
    }

    public static EnterValue ingresarEmail(){
        return Enter.theValue("cristianh98@yopmail.com").into(TXT_EMAIL);
    }

    public static EnterValue ingresarContrasena(){
        return Enter.theValue("Crusto2009$").into(TXT_CONTRASENA);
    }

    public static ClickInteraction hacerClickBotonEntrar(){
        return Click.on(BTN_ENTRAR);
    }

}
