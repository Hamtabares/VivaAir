package com.tcs.certificacion.air.user_interfaces;

import org.apache.tools.ant.taskdefs.Tar;

import net.serenitybdd.screenplay.targets.Target;

public class InfoFactura {

	public static final Target FACTURA_COMPRA = Target.the("//div[@id='bookingBasket']").locatedBy("//div[@id='bookingBasket']");
	
}
