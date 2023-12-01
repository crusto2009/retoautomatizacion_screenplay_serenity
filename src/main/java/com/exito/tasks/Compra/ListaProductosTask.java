package com.exito.tasks.Compra;

import com.exito.interactions.Compra.InteractionListaProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ListaProductosTask implements Task {

    @Step("{0} clic en el celular de la lista mostrada")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                InteractionListaProducto.hacerClicCelular()
        );
    }

    public static Performable on(){
        return instrumented(ListaProductosTask.class);
    }
}
