package com.tcs.certificacion.air.interactions;

import net.serenitybdd.screenplay.Actor;
import static com.tcs.certificacion.air.user_interfaces.MapeoCalendario.*;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Calendario implements Interaction{

	private String año,mes,dia;
	
	public Calendario(String año, String mes, String dia) {
		this.año = año;
		switch (mes) {
		case "01":
			this.mes = "Enero";
			break;
		case "02":
			this.mes = "Febrero";
			break;
		case "03":
			this.mes = "Marzo";
			break;
		case "04":
			this.mes = "Abril";
			break;
		case "05":
			this.mes = "Mayo";
			break;
		case "06":
			this.mes = "Junio";
			break;
		case "07":
			this.mes = "Julio";
			break;
		case "08":
			this.mes = "Agosto";
			break;
		case "09":
			this.mes = "Septiembre";
			break;
		case "10":
			this.mes = "Octubre";
			break;
		case "11":
			this.mes = "Noviembre";
			break;
		case "12":
			this.mes = "Diciembre";
			break;
		default:
			break;
		}
		this.dia = String.valueOf(Integer.parseInt(dia));
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		String mesActivo,diaMes="actual";
		while(!AÑO_ACTIVO.resolveFor(actor).getText().equals(año) || !MES_ACTIVO.resolveFor(actor).getText().equals(mes)) {
			mesActivo = MES_ACTIVO.resolveFor(actor).getText();
			actor.attemptsTo(Click.on(FLECHA_NEXT));
			if(MES_ACTIVO.resolveFor(actor).getText().equals(mesActivo)){
				diaMes="siguiente";
				break;
			}
			
		}
		if(diaMes.equals("actual")) {
			actor.attemptsTo(Click.on(DIA.of(dia)));
		}else if(diaMes.equals("siguiente")) {
			actor.attemptsTo(Click.on(DIA_MES_SIGUIENTE.of(dia)));
		}
	}
		
	public static Calendario fecha(String año, String mes, String dia) {
		return Tasks.instrumented(Calendario.class, año,mes,dia);
	}

}