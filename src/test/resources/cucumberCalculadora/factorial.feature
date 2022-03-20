#Author: Nerea Martin Serrano

@test_factorial
Feature: Test factorial

  @factorial_failure
  Scenario: factorialFailure
    Given quiero calcular el factorial de un numero negativo
    When calculo el factorial de un numero menor a cero
    Then no se puede calcular el factorial de un numero negativo
    
  @factorial_exception
  Scenario: factorialException
    Given quiero calcular el factorial de un numero grande
    When caclulo el factorial de un numero mayor a quince
    Then no se puede calcular el factorial de numeros grandes
    

  @funcinamiento_correcto_factorial
  Scenario Outline: factorialOk
    Given quiero calcular el fatorial
    When calculo el factorial de <a>
    Then la calculadore devuelve <result>

    Examples: 
      | a 	| result|
      |120	|	 	5		|
      | 0 	|  	1 	|
