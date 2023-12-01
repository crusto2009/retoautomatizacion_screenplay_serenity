package com.exito.interactions.Home;

import com.exito.questions.PaginaInicialQuestion;
import com.exito.utils.DatosExcel;
import com.exito.utils.LeerExcel;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickInteraction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static com.exito.ui.Home.HomePage.*;

public class InteractionHome {

    public static LeerExcel leerexcel= new LeerExcel();


    public static ClickInteraction hacerClickBotonMiCuenta(){
        return Click.on(BTN_MICUENTA);
    }

    public static ClickInteraction hacerClickBotonIngresarEmailContrasena(){
        return Click.on(BTN_LOGINEMAILCONTRASENA);
    }

    public static EnterValue ingresarEmail() {
        return Enter.theValue(leerexcel.getEmail()).into(TXT_EMAIL);
    }

    public static EnterValue ingresarContrasena(){
        return Enter.theValue(leerexcel.getPassword()).into(TXT_CONTRASENA);
    }

    public static ClickInteraction hacerClickBotonEntrar(){
        return Click.on(BTN_ENTRAR);
    }

}
