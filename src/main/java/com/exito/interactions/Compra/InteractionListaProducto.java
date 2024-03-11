package com.exito.interactions.Compra;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickInteraction;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.exito.ui.Compra.ListaProductosPage.LINK_CELULAR;
import static com.exito.ui.Home.HomePage.BTN_MICUENTA;

public class InteractionListaProducto {

    public static ClickInteraction hacerClicCelular(){
        Scroll.to(LINK_CELULAR);

        return Click.on(LINK_CELULAR);
    }
}
