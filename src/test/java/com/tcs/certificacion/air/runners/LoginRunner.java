package com.tcs.certificacion.air.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/vuelosAir.feature",
					glue="com.tcs.certificacion.air.stepdefinitions",
					snippets=SnippetType.CAMELCASE)



public class LoginRunner {}