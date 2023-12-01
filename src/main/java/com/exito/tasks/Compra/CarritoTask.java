package com.exito.tasks.Compra;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.exito.ui.Compra.CarritoPage.BTN_CONFIRMAR;
import static com.exito.ui.Compra.CarritoPage.TXT_EMAIL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CarritoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        /*actor.attemptsTo(
                Enter.theValue("mail@gmail.com").into(TXT_EMAIL),
                Click.on(BTN_CONFIRMAR)
        );*/
    }

    //TODO preguntar
    public static Performable on(){
        return instrumented(CarritoTask.class);
    }
}
