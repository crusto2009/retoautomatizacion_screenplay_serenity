package com.exito.interactions.Compra;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickInteraction;

import static com.exito.ui.Compra.ListaProductosPage.LINK_CELULAR;
import static com.exito.ui.Home.HomePage.BTN_MICUENTA;

public class InteractionListaProducto {

    public static ClickInteraction hacerClicCelular(){
        return Click.on(LINK_CELULAR);
    }
}
