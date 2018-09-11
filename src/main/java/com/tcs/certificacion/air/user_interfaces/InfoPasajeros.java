package com.tcs.certificacion.air.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class InfoPasajeros {

	public static final Target INGRESAR_NOMBRES = Target.the("Igresar Nombres").locatedBy("//input[@id='Adults[0].FirstName']");
	public static final Target INGRESAR_APELLIDOS = Target.the("Ingresar Apellidos").locatedBy("//input[@id='Adults[0].LastName']");
	public static final Target SELECCIONAR_GENERO = Target.the("SelGenero").locatedBy("//div[@class='input-wrapper col-xs-12 col-md-6 col-lg-6']//span[@class='select2-chosen']");
	public static final Target INGRESAR_GENERO = Target.the("Genero").locatedBy("//ul[@class='select2-results']//div[text()='{0}']");
	public static final Target INGRESAR_NUMDOC = Target.the("Documento").locatedBy("//input[@id='Adults[0].IdentificationNumber']");
	public static final Target SELASISTENCIA = Target.the("SelAsistencia").locatedBy("//*[@id=\"passengerDetailsForm-0\"]/fieldset[2]/div[1]/div/fieldset/label[1]/span");
	public static final Target CORREO = Target.the("Correo").locatedBy("//input[@id='Passengers[0].email']");
	public static final Target CONF_CORREO = Target.the("ConfirCorreo").locatedBy("//input[@id='Passengers[0].repeatemail']");	
	public static final Target CELULAR = Target.the("Celular").locatedBy("//input[@id='Passengers0_mobile']");
	public static final Target BTNCONTINUAR = Target.the("Continuar").locatedBy("//div//a[@id='btnContinuePassengerDetails']");
	
	
}
