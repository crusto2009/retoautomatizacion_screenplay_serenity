package com.exito.ui.Compra;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicialPage {

    public static final Target TXT_BUSQUEDA = Target.the("Input busqueda").located(By.xpath("//input[@placeholder='Buscar en exito.com']"));

    public static final Target BTN_CERRARPOPUP = Target.the("Boton cerrar popup").locatedBy("//*[@id='wps-overlay-close-button']");


}
