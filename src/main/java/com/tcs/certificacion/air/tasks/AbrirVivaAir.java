package com.tcs.certificacion.air.tasks;

import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirVivaAir implements Task{

	private WebDriver hisBrowser;
	private String url;
	public AbrirVivaAir(WebDriver hisBrowser) {
		this.hisBrowser=hisBrowser;
	}
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.can(BrowseTheWeb.with(hisBrowser));
		actor.wasAbleTo(Open.url(url));
		// en otra clase task---actor.wasAbleTo(Click.on(AirHomeReservaPage.PRESIONE_TIQUETES));
	}
	
	public static AbrirVivaAir conElNavegador(WebDriver hisBrowser) {
		return Tasks.instrumented(AbrirVivaAir.class,hisBrowser);
	}
		
	public AbrirVivaAir enLaUrl(String url) {
		this.url=url;
		return this;
	}

}
