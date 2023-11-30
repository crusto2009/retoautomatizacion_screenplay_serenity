package com.exito.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static com.exito.ui.DetalleProductoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DetalleProductoTask implements Task {

    @Step("{0} clic en el boton de agregar al carrito y en boton del carrito de compras")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_AGREGAR_CARRITO),
                Click.on(BTN_CARRITO)
        );
    }

    public static Performable on(){
        return instrumented(DetalleProductoTask.class);
    }
}
