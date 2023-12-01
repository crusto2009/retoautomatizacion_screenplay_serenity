package com.exito.ui.Compra;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListaProductosPage {
    public static final Target LINK_CELULAR = Target.the("LINK celular").located(By.xpath("(//*[@id='gallery-layout-container']//section)[1]/a"));
}
