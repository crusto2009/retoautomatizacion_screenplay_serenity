package com.exito.ui.Compra;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetalleProductoPage {

    public static final Target BTN_AGREGAR_CARRITO = Target.the("Boton agregar al carrito").located(By.xpath("//button//span[.='Agregar']"));

    public static final Target BTN_CARRITO = Target.the("Boton carrito compra").located(By.xpath("//a[@class='exito-header-3-x-minicartLink']"));

}
