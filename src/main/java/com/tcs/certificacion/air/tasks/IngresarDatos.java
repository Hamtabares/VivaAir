package com.tcs.certificacion.air.tasks;

import static com.tcs.certificacion.air.user_interfaces.AirHomeReservaPage.*;
import java.util.List;
import org.openqa.selenium.Keys;
import com.tcs.certificacion.air.interactions.Calendario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class IngresarDatos implements Task {

	private String origen,destino,fecha_ida,anoida,mesida,diaida,fecha_regreso,anoregreso,mesregreso,diaregreso,moneda,adulto,nino,infantes;
	
	public IngresarDatos(List<List<String>> datosvuelo) {
		this.origen=datosvuelo.get(1).get(0);
		this.destino=datosvuelo.get(1).get(1);
		this.fecha_ida=datosvuelo.get(1).get(2);
		this.diaida=fecha_ida.substring(0,2);
		this.mesida=fecha_ida.substring(3,5);
		this.anoida=fecha_ida.substring(6);
		
		this.fecha_regreso=datosvuelo.get(1).get(3);
		this.diaregreso=fecha_regreso.substring(0,2);
		this.mesregreso=fecha_regreso.substring(3,5);
		this.anoregreso=fecha_regreso.substring(6);
		
		this.moneda=datosvuelo.get(1).get(4);
		this.adulto=datosvuelo.get(1).get(5);
		this.nino=datosvuelo.get(1).get(6);
		this.infantes=datosvuelo.get(1).get(7);
		
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(PRESIONE_TIQUETES),
				Click.on(ORIGEN),
				Enter.theValue(origen).into(TXTORIGEN).thenHit(Keys.ENTER),
				Click.on(DESTINO),
				Enter.theValue(destino).into(TXTDESTINO).thenHit(Keys.ENTER),
				Calendario.fecha(anoida, mesida, diaida),
				Calendario.fecha(anoregreso, mesregreso, diaregreso),
				Click.on(BTN_RESERVAR)
				);
		}

	public static IngresarDatos Vuelo(List<List<String>> datosvuelo) {
		return Tasks.instrumented(IngresarDatos.class, datosvuelo);
	}
	
	
	
}
