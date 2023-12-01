package com.exito.stepDefinitions;

import com.exito.questions.ValidarHome;
import com.exito.tasks.Compra.PaginaInicialTask;
import com.exito.tasks.Home.HomeTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginStepDefinitions {
    @Before
    public void setStage(){
        //Configuracion Inicial del escenario de prueba
        // (preconfiguracion -  lo que va a hacer el actor(usuario))
        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario se encuentre en la pagina web")
    public void queElUsuarioSeEncuentreEnLaPaginaWeb() {

        theActorCalled("Usuario");

        theActorInTheSpotlight().attemptsTo(
                Open.url("https://www.exito.com/")

        );
    }
    @Cuando("el usuario ingresa email y contrasena")
    public void elUsuarioIngresaEmailYContrasena() {
        theActorInTheSpotlight().attemptsTo(
                HomeTask.on()
        );
    }
    @Cuando("de clic en el boton entrar")
    public void deClicEnElBotonEntrar() {

    }
    @Entonces("el usuario visualiza la pagina de inicio")
    public void elUsuarioVisualizaLaPaginaDeInicio() {
        theActorInTheSpotlight().should(
              seeThat(
                      ValidarHome.validar(), Matchers.equalTo(true)
              )
        );
    }
}
