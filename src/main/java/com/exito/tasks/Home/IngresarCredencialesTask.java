package com.exito.tasks.Home;

import com.exito.interactions.Home.InteractionHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarCredencialesTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                InteractionHome.ingresarEmail(),
                InteractionHome.ingresarContrasena()
        );
    }

    //TODO preguntar
    public static Performable on(){
        return instrumented(IngresarCredencialesTask.class);
    }
}
