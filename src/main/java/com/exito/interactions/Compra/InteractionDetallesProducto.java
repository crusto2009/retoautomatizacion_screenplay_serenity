package com.exito.interactions.Compra;

import com.exito.questions.PaginaInicialQuestion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickInteraction;
import static com.exito.ui.Compra.DetalleProductoPage.BTN_AGREGAR_CARRITO;
import static com.exito.ui.Compra.DetalleProductoPage.BTN_CARRITO;

public class InteractionDetallesProducto {
    public static ClickInteraction hacerClickBotonAgregarCarrito(){
        return Click.on(BTN_AGREGAR_CARRITO);
    }

    public static ClickInteraction hacerClickBotonCarrito() {

        return  Click.on(BTN_CARRITO);
    }

}
