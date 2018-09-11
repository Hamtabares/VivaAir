package com.tcs.certificacion.air.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TarifasPasajerosPage {

	public static final Target LISTA_PRECIOS_IDA = Target.the("Lista de precios de ida").locatedBy("//div[@id='divAvailabilityOut']//span[@class='hidden-xs']");
	public static final Target LISTA_PRECIOS_REGRESO = Target.the("Lista de precios de regreso").locatedBy("//div[@id='divAvailabilityIn']//span[@class='hidden-xs']");
	public static final Target IFRAMEACEPTO =Target.the("Iframe").locatedBy("//div[@class ='fancybox-skin']");
	public static final Target BTNACEPTO =Target.the("AceptoCondiciones").locatedBy("//div[@id='fancyConfirm']/div[4]/a/span");
}
