package com.exito.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static com.exito.ui.ListaProductosPage.LINK_CELULAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ListaProductosTask implements Task {

    @Step("{0} clic en el celular de la lista mostrada")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_CELULAR)
        );
    }

    public static Performable on(){
        return instrumented(ListaProductosTask.class);
    }
}
