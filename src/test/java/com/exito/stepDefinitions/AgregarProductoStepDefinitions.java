package com.exito.stepDefinitions;

import com.exito.questions.ValidarCarritoProductoCompra;
import com.exito.tasks.Compra.CarritoTask;
import com.exito.tasks.Compra.DetalleProductoTask;
import com.exito.tasks.Compra.ListaProductosTask;
import com.exito.tasks.Compra.PaginaInicialTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AgregarProductoStepDefinitions {



    /*@Before
    public void setStage(){
        //Configuracion Inicial del escenario de prueba
        // (preconfiguracion -  lo que va a hacer el actor(usuario))
        setTheStage(new OnlineCast());
    }*/




    @Dado("busca un producto en la pagina")
    public void buscaUnProductoEnLaPagina() {
        //wasAbleTo():Consultar que es.

        //theActorCalled(): Configurar y asignar un nombre a un actor en
        //el escenario de prueba.
        theActorCalled("Usuario");

        //theActorInTheSpotlight(): Obtener la referencia
        //al actor actual que esta realizando las interacciones
        //en el escenario o hacer referencia al ultimo actor activo conocido

        //attemptsTo(): Metodo que se utiliza para agrupar las acciones que el actor intentara realizar
        //'expresar la interaccion del usuario de una manera más natural'
        theActorInTheSpotlight().attemptsTo(
                Open.url("https://www.exito.com/"),
                PaginaInicialTask.on()
        );
    }

    @Cuando("el usuario seleccione un producto y lo agregue al carrito")
    public void elUsuarioSeleccioneUnProductoYLoAgregueAlCarrito() {
        //TODO buscar que es wasAbleTo.
        //theActorInTheSpotlight().wasAbleTo(); buscar que es  wasAbleTo

        theActorInTheSpotlight().attemptsTo(
                ListaProductosTask.on(),
                DetalleProductoTask.on()
                //CarritoTask.on()
        );
    }

    @Entonces("el usuario podrá visualizar el producto dentro del carrito de compras")
    public void elUsuarioPodráVisualizarElProductoDentroDelCarritoDeCompras() {
        //TODO buscar que es should.
        theActorInTheSpotlight().should(
                seeThat(
                        ValidarCarritoProductoCompra.validar(), Matchers.equalTo(true)
                )
        );
    }

}
