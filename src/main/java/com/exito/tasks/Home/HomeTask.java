package com.exito.tasks.Home;

import com.exito.interactions.Home.InteractionHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                InteractionHome.hacerClickBotonMiCuenta(),
                InteractionHome.hacerClickBotonIngresarEmailContrasena()
        );
    }

    //TODO preguntar
    public static Performable on(){
        return instrumented(HomeTask.class);
    }
}
