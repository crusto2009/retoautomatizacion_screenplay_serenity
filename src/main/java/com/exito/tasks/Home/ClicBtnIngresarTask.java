package com.exito.tasks.Home;

import com.exito.interactions.Home.InteractionHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicBtnIngresarTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                InteractionHome.hacerClickBotonEntrar()
        );
    }

    public static Performable on(){
        return instrumented(ClicBtnIngresarTask.class);
    }
}
