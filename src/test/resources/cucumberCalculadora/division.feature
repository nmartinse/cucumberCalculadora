#Author: Nerea Martin Serrano

@test_division
Feature: Test division

  @division_failure
  Scenario: divisionFailure
    Given quiero usar la calculadora para dividir entre cero
    When yo divido entre cero
    Then no se puede dividir entre cero
 
  @funcinamiento_correcto_division
  Scenario Outline: divisionOk
    Given quiero usar la calculadora para dividir
    When yo divido <a> entre <b>
    Then el resutlado de la division es <result>
    And result * a = b

    Examples: 
      | a 	| b 	| result|
      | 4		|	 2 	|	 	2		|
      | -6 	|  3	| 	-2 	|
      | 0 	|  5	| 	0		|