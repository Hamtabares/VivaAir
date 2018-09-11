package com.tcs.certificacion.air.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.tcs.certificacion.air.models.infofactura;
import com.tcs.certificacion.air.tasks.AbrirVivaAir;
import com.tcs.certificacion.air.tasks.IngresarDatos;
import com.tcs.certificacion.air.tasks.IngresarInfoPasajeros;
import com.tcs.certificacion.air.tasks.VueloIda;
import com.tcs.certificacion.air.tasks.VueloRegreso;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class AirVuelosStepDefinitions {
	
	@Managed(driver ="chrome", options= "--start-maximized --incognito")
	private WebDriver hisBrowser;
	private Actor fulano = Actor.named("fulano");
	
	@Before 
	public void configuracionInicial() {
		fulano.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^que fulano este en la web principal ingresar origen y destino$")
	public void queFulanoEsteEnLaWebPrincipalIngresarOrigenYDestino() {
		fulano.wasAbleTo(AbrirVivaAir.conElNavegador(hisBrowser).enLaUrl("https://vivaair.com/co"));
	}

	@When("^seleccione el tiquete origen mas economico$")
	public void seleccioneElTiqueteOrigenMasEconomico(List<List<String>> datosvuelo) {
		fulano.attemptsTo(IngresarDatos.Vuelo(datosvuelo));
	}

	@When("^el tiquete mas alto de regreso$")
	public void elTiqueteMasAltoDeRegreso(List<List<String>> datosusuario) {
		fulano.attemptsTo(VueloIda.Menor());
		fulano.attemptsTo(VueloRegreso.Mayor());
		fulano.attemptsTo(IngresarInfoPasajeros.Usuario(datosusuario));
	}

	@Then("^imprimir la informacion del viaje$")
	public void imprimirLaInformacionDelViaje() {
		infofactura.delVuelo(fulano);
	}
}
