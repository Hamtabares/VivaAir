package com.tcs.certificacion.air.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AirHomeReservaPage {

	public static final Target PRESIONE_TIQUETES=Target.the("Dar Click En Tiquetes").locatedBy("//div[@class='icon-and-name current']");
	public static final Target ORIGEN=Target.the("seleccionar Origen").locatedBy("//span[@id='select2-chosen-20']");
	public static final Target TXTORIGEN=Target.the("Ingresar Origen").locatedBy("//input[@id='s2id_autogen20_search']");
	public static final Target DESTINO=Target.the("Seleccione Destino").locatedBy("//span[@id='select2-chosen-21']");
	public static final Target TXTDESTINO=Target.the("Ingresar Destino").locatedBy("//input[@id='s2id_autogen21_search']");
	public static final Target SELECCIONAR_FECHA_IDA=Target.the("Seleccionar Fecha Ida").locatedBy("//input[@id='DepartureDateForDisplay']");
	public static final Target BTN_RESERVAR= Target.the("BtnReservar").locatedBy("//a[@id='continueLink']");
	


}
