package com.exito.ui.Compra;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoPage {

    public static final Target TXT_EMAIL = Target.the("Input email").located(By.xpath("//input[@name='email']"));
    public static final Target BTN_CONFIRMAR = Target.the("Boton confirmar").located(By.xpath("//button[@class='exito-checkout-io-0-x-preLoginActiveButton']"));

    public static final Target TXT_TITULO_PRODUCTO = Target.the("Titulo producto").located(By.xpath("//div[@class='exito-checkout-io-0-x-listTitle']"));

}
