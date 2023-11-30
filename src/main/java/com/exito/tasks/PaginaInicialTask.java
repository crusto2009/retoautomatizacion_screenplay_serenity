package com.exito.tasks;

import com.exito.interactions.InteractionPaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaginaInicialTask implements Task {

    @Step("{0} clic en el boton cerrar popup")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                //Click.on(BTN_CERRARPOPUP),
                InteractionPaginaPrincipal.hacerClickBotonCerrarPopUp(),
                InteractionPaginaPrincipal.ingresarTextoBuscar()
        );
    }


    //TODO preguntar
    public static Performable on(){
        return instrumented(PaginaInicialTask.class);
    }
}
