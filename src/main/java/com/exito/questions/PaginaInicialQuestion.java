package com.exito.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import java.lang.annotation.Target;

import static com.exito.ui.Compra.PaginaInicialPage.BTN_CERRARPOPUP;

public class PaginaInicialQuestion implements Question<Question<Boolean>> {

    @Override
    public Question<Boolean> answeredBy(Actor actor) {
        return Visibility.of(BTN_CERRARPOPUP).asBoolean();
    }

    public static PaginaInicialQuestion validateModal(){
        return new PaginaInicialQuestion();
    }
}
