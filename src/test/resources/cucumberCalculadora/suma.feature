#Author: Nerea Martin

Feature: suma

  @tag1
  Scenario Outline: sumaOk
    Given I want to use the calculator to add
    When I add <a> and <b> 
    Then the result is <result>
    And result - a = b
    And result - b = a
    
    Examples: 
      | a 	| b 	| result 	|
      | -10 |  0	|	 -10 		|
      | -10 |  10	| 	0 		|

  @tag2
  Scenario: sumaFailure
  	Given I want to use the calculator to add big numbers
    When I try to add two numbers whose result is greater than Double.MAX_VALUE
    Then no se pueden sumar numeros tan grandes