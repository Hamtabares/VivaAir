#Author: hamtont@gmail.com
#Keywords Summary :
@tag
Feature: Ingresar a la web Orange con usuario y contrasena
  I want to use this template for my feature file

  @Escenario1
  Scenario: ingresar a la web vivaair para comprar tiquetes
    Given que fulano este en la web principal ingresar origen y destino
    When seleccione el tiquete origen mas economico
      | origen		| destino		| fecha ida |fecha regreso |moneda|adultos|niños|infantes|
      | Medellin	| Bogota		|24/10/2018 |26/11/2018    |COP   |1	  |0	|0		 | 
    And el tiquete mas alto de regreso
    |nombre	|apellidos|genero	|numerodoc|correo 			|confirmarcorreo|celular|
    |Pedro  |Infante  |Masculino|972626262|pedro@gmail.com  |pedro@gmail.com|9876545|
    Then imprimir la informacion del viaje