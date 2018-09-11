package com.tcs.certificacion.air.tasks;

import java.util.List;
import static com.tcs.certificacion.air.user_interfaces.TarifasPasajerosPage.*;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class VueloIda implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		List<WebElementFacade> PreciosIda = LISTA_PRECIOS_IDA.resolveAllFor(actor); //Lista de los precios de ida
		int posMenor=0;
		double Menor = Double.parseDouble(PreciosIda.get(0).getText().substring(3));
		
		for (int i = 0; i < PreciosIda.size(); i++) {
			double valor = Double.parseDouble(PreciosIda.get(i).getText().substring(3));
			if (valor < Menor) {
				Menor = valor;
				posMenor = i;
			}
		}
    	actor.attemptsTo(Click.on(PreciosIda.get(posMenor)));
	}
	
	public static VueloIda Menor() {
		return new VueloIda();
	}

}
