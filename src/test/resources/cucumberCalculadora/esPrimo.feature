#Author: Nerea Martin Serrano

@test_esPrimo
Feature: Test esPrimo

  @correcto_funcionamiento_esPrimo
  Scenario Outline: esPrimoOk
    Given quiero usar la calculadora para ver si un nuermo es primo
    When calculo si <a> es primo
    Then la cacluladora devuelve el <result>

    Examples: 
      | a 	| result	|
      | 1		|	 	false	|
      | -3 	|  	false 	|
      | 0 	|  	false 	|
      | 23 	|  	true 	|

    
