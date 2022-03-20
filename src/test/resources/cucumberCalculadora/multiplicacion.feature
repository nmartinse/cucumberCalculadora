#Author: Nerea Martin Serrano

@test_multiplicacion
Feature: Test multiplicacion

  @funcinamiento_correcto_multiplicacion
  Scenario Outline: multiplicacionOk
    Given Quiero usar la calculadora para multiplicar
    When yo multiplico el numero <a> por el numero <b> 
    Then el resultado sera <result>
    And b * a = result
    And result/a = b
    And result/b = a

    Examples: 
      | a 	| b 	| result|
      | 0 	| -10	|	 0	|
      | 1 	|  10	| 	10 	|

  @multiplicaion_failure
  Scenario: multiplicacionFailure
    Given I want to use the calculator to multiply big numbers
    When I try to multiply two numbers whose result is greater than Double.MAX_VALUE
    Then no se pueden multiplicar numeros grandes