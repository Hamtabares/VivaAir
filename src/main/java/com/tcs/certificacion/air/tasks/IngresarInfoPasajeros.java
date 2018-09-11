package com.tcs.certificacion.air.tasks;

import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.tcs.certificacion.air.user_interfaces.InfoPasajeros.*;

public class IngresarInfoPasajeros implements Task {

	private String nombre,apellido,genero,numerodocumento,correo,confirmarcorreo,celular;
	
	public IngresarInfoPasajeros (List<List<String>>datosusuario) {
		
		this.nombre=datosusuario.get(1).get(0);
		this.apellido=datosusuario.get(1).get(1);
		this.genero=datosusuario.get(1).get(2);
		this.numerodocumento=datosusuario.get(1).get(3);
		this.correo=datosusuario.get(1).get(4);
		this.confirmarcorreo=datosusuario.get(1).get(5);
		this.celular=datosusuario.get(1).get(6);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo (Enter.theValue(nombre).into(INGRESAR_NOMBRES),
						Enter.theValue(apellido).into(INGRESAR_APELLIDOS),
						Click.on(SELECCIONAR_GENERO),
						Click.on(INGRESAR_GENERO.of(genero)),
						Enter.theValue(numerodocumento).into(INGRESAR_NUMDOC),
						Click.on(SELASISTENCIA),
						Enter.theValue(correo).into(CORREO),
						Enter.theValue(confirmarcorreo).into(CONF_CORREO),
						Enter.theValue(celular).into(CELULAR),
						Click.on(BTNCONTINUAR)
						);
	}			
				
		
		public static IngresarInfoPasajeros Usuario(List<List<String>> datosusuario) {
			return Tasks.instrumented(IngresarInfoPasajeros.class, datosusuario);
		
		
			}
		
	}


