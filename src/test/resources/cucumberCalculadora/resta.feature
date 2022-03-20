#Author: Nerea Martin Serrano

@test_resta
Feature: Test resta

  @funcinamiento_correcto_resta
  Scenario Outline: restaOk
    Given I want to use the calculator to subtract
    When I subtract <a> minus <b> 
    Then the result of the subtract is <result>
    And result + b = a
    
    Examples: 
      | a 	| b 	| result|
      | 0 	| -10	|	 10 	|
      | 10 	|  10	| 	0 	|
      | 3		|		2	|		1		|
      | -3	|		2	|		-5	|
      | -3	|	-2	|		-1	|
      
  @resta_failure
  Scenario: restaFailure
  	Given I want to use the calculator to subtract big numbers
    When I try to subtract two numbers whose result is greater than Double.MAX_VALUE
    Then no se pueden restar numeros tan grandes