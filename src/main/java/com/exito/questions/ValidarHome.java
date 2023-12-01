package com.exito.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.exito.ui.Home.HomePage.TXT_TITULO;

public class ValidarHome implements Question {
    @Override
    public Object answeredBy(Actor actor) {

        WebElementFacade tituloHome = TXT_TITULO.resolveFor(actor);

        return tituloHome.isVisible();
    }

    public static ValidarHome validar(){
        return  new ValidarHome();
    }
}
