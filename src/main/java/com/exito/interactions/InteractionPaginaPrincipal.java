package com.exito.interactions;


import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickInteraction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import org.openqa.selenium.Keys;

import static com.exito.ui.PaginaInicialPage.BTN_CERRARPOPUP;
import static com.exito.ui.PaginaInicialPage.TXT_BUSQUEDA;

public class InteractionPaginaPrincipal {

    public static ClickInteraction hacerClickBotonCerrarPopUp(){
        return Click.on(BTN_CERRARPOPUP);
    }

    public static EnterValue ingresarTextoBuscar(){
        return Enter.theValue("Celulares").into(TXT_BUSQUEDA).thenHit(Keys.RETURN);
    }

}
