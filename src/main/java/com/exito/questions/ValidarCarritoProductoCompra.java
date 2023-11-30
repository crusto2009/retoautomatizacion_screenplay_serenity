package com.exito.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.exito.ui.CarritoPage.TXT_TITULO_PRODUCTO;

public class ValidarCarritoProductoCompra implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        WebElementFacade tituloProducto = TXT_TITULO_PRODUCTO.resolveFor(actor);

        return tituloProducto.isVisible();
    }

    public static ValidarCarritoProductoCompra validar(){
        return  new ValidarCarritoProductoCompra();
    }
}
