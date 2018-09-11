package com.tcs.certificacion.air.tasks;

import java.util.List;

import org.apache.tools.ant.taskdefs.WaitFor;

import static com.tcs.certificacion.air.user_interfaces.TarifasPasajerosPage.*;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class VueloRegreso implements Task{
	  
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		List<WebElementFacade> PreciosRegreso = LISTA_PRECIOS_REGRESO.resolveAllFor(actor);
		int posMayor=0;
		double Mayor = Double.parseDouble(PreciosRegreso.get(0).getText().substring(3));
		for (int i = 0; i < PreciosRegreso.size(); i++) {
			double valor = Double.parseDouble(PreciosRegreso.get(i).getText().substring(3));
			if (valor > Mayor) {
				Mayor = valor;
				posMayor = i;
			}
		}
		actor.attemptsTo(Click.on(PreciosRegreso.get(posMayor)));
		IFRAMEACEPTO.resolveFor(actor).waitUntilClickable();
		actor.attemptsTo(Click.on(BTNACEPTO));
			//	Click.on(IFRAMEACEPTO),
			//	Click.on(BTNACEPTO));
		
	}
	public static VueloRegreso Mayor() {
		return new VueloRegreso();
		
	}
}


