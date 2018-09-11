package com.tcs.certificacion.air.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MapeoCalendario {

	public static final Target CLR_FECHA_IDA = Target.the("Fecha ida").locatedBy("	");
	public static final Target CLR_FECHA_REGRESO = Target.the("Fecha regreso").locatedBy("//input[@id='ReturnDateForDisplay']");
	
	public static final Target AÑO_ACTIVO = Target.the("Año activo").locatedBy("//div[contains(@class,'first')]//span[@class='ui-datepicker-year']");
	public static final Target MES_ACTIVO = Target.the("Mes activo").locatedBy("//div[contains(@class,'first')]//span[@class='ui-datepicker-month']");
	public static final Target DIA = Target.the("Dia fecha").locatedBy("//div[contains(@class,'first')]//a[text()='{0}']");
	public static final Target DIA_MES_SIGUIENTE = Target.the("dia del mes siguiente").locatedBy("//div[contains(@class,'last')]//a[text()='{0}']");
	
	public static final Target FLECHA_NEXT = Target.the("Flecha a siguiente").locatedBy("//span[@class='ui-icon ui-icon-circle-triangle-e']");
	
}
