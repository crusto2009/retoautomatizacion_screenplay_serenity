package com.exito.tasks.Compra;

import com.exito.interactions.Compra.InteractionDetallesProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DetalleProductoTask implements Task {

    @Step("{0} clic en el boton de agregar al carrito y en boton del carrito de compras")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                InteractionDetallesProducto.hacerClickBotonAgregarCarrito(),
                InteractionDetallesProducto.hacerClickBotonCarrito()
        );
    }

    public static Performable on(){
        return instrumented(DetalleProductoTask.class);
    }
}
