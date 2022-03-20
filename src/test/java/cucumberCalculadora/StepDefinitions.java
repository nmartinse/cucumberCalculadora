package cucumberCalculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	double a;
	double b;
	double resultD;
	int n;
	boolean resultB;
	Calculadora c;
	int resultI;
	
	@Given("quiero usar la calculadora para dividir entre cero")
	public void quiero_usar_la_calculadora_para_dividir_fallo() {
		c = new Calculadora();
	}
	
	@When("yo divido entre cero")
	public void yo_divido_entre() {
	    b = 0;
	}
	@Then("no se puede dividir entre cero")
	public void dividir_exception() {
		assertThrows(ArithmeticException.class, () -> {
			c.divide(1, b);
		});
	}

	@Given("quiero usar la calculadora para dividir")
	public void quiero_usar_la_calculadora_para_dividir() {	
		c = new Calculadora();
	}
	
	@When("yo divido {double} entre {double}")
	public void yo_divido_entre1(Double d1, Double d2) {
	    a = d1;
	    b = d2;
	    resultD = c.divide(a, b);
	}
	@Then("el resutlado de la division es {double}")
	public void el_resutlado_de_la_division_es1(Double d1) {
		assertEquals(d1, resultD);
	   
	}
	@Then("result * a = b")
	public void prueba_division_b() {
	    assertEquals(resultD * b, a);
	}


	@Given("quiero usar la calculadora para ver si un nuermo es primo")
	public void quiero_usar_la_calculadora_para_ver_si_un_nuermo_es_primo() {
		c = new Calculadora();
	}
	
	@When("calculo si {int} es primo")
	public void calculo_si_es_primo(Integer int1) {
	    n = int1;
	    resultB = c.esPrimo(n);
	}
	@Then("la cacluladora devuelve el false")
	public void la_cacluladora_devuelve_el_false() {
	    assertFalse(resultB);
	}
	@Then("la cacluladora devuelve el true")
	public void la_cacluladora_devuelve_el_true() {
		assertTrue(resultB);
	}


	@Given("quiero calcular el factorial de un numero negativo")
	public void quiero_calcular_el_factorial_de_un_numero_negativo() {
		c = new Calculadora();
	}
	
	@When("calculo el factorial de un numero menor a cero")
	public void calculo_el_factorial_de_un_numero_menor_a() {
	    n = -3;
	}
	@Then("no se puede calcular el factorial de un numero negativo")
	public void factorial_negativo() {
		assertThrows(IllegalArgumentException.class, () -> {
			c.fact(n);
		});
	}


	@Given("quiero calcular el factorial de un numero grande")
	public void quiero_calcular_el_factorial_de_un_numero_grande() {
		c = new Calculadora();
	}
	@When("caclulo el factorial de un numero mayor a quince")
	public void caclulo_el_factorial_de_un_numero_mayor_a() {
	    n = 16;
	}
	@Then("no se puede calcular el factorial de numeros grandes")
	public void factorial_numero_grande() {
		assertThrows(IllegalArgumentException.class, () -> {
			c.fact(n);
		});
	}


	@Given("quiero calcular el fatorial")
	public void quiero_calcular_el_fatorial() {
		c = new Calculadora();
	}
	@When("calculo el factorial de {int}")
	public void calculo_el_factorial_de(Integer int1) {
	    n = int1;
	    resultI = c.fact(n);
	}
	@Then("la calculadore devuelve {int}")
	public void la_calculadore_devuelve(Integer answer) {
		assertEquals(answer, resultI);
	}

	@Given("Quiero usar la calculadora para multiplicar")
	public void quiero_usar_la_calculadora_para_multiplicar() {
		c = new Calculadora();
	}
	@When("yo multiplico el numero {double} por el numero {double}")
	public void yo_multiplico_el_numero_por_el_numero(Double d1, Double d2) {
	    a = d1;
	    b = d2;
	    resultD = c.mult(a, b);
	}
	@Then("el resultado sera {double}")
	public void el_resultado_sera(Double answer) {
		assertEquals(answer, resultD);
	}
	@Then("b * a = result")
	public void prueba_conmutativa() {
		assertEquals(b * a, resultD);
	}
	@Then("result\\/a = b")
	public void comprobar_resultado_a() {
		assertEquals(resultD/a, b);
	}
	@Then("result\\/b = a")
	public void comprobar_resultado_b() {
		assertEquals(resultD/b, a);
	}


	@Given("I want to use the calculator to multiply big numbers")
	public void i_want_to_use_the_calculator_to_multiply_big_numbers() {
		c = new Calculadora();
	}
	@When("I try to multiply two numbers whose result is greater than Double.MAX_VALUE")
	public void i_try_to_multiply_two_numbers_whose_result_is_greater_than_e308() {
	    a = Double.MAX_VALUE;
	    b = 2;
	}
	@Then("no se pueden multiplicar numeros grandes")
	public void multiplica_grandes_numeros() {
		assertThrows(ArithmeticException.class, () -> {
			c.mult(a,b);
		});
	}


	@Given("I want to use the calculator to subtract")
	public void i_want_to_use_the_calculator_to_subtract() {
		c = new Calculadora();
	}
	@When("I subtract {double} minus {double}")
	public void i_subtract_minus(Double d1, Double d2) {
	    a = d1;
	    b = d2;
	    resultD = c.resta(a, b);
	}
	@Then("the result of the subtract is {double}")
	public void the_result_of_the_subtract_is(Double answer) {
		assertEquals(answer, resultD);
	}
	@Then("result + b = a")
	public void prueba_resta_a() {
		assertEquals(resultD + b, a);
	}
	

	@Given("I want to use the calculator to subtract big numbers")
	public void i_want_to_use_the_calculator_to_subtract_big_numbers() {
		c = new Calculadora();
	}
	@When("I try to subtract two numbers whose result is greater than Double.MAX_VALUE")
	public void i_try_to_subtract_two_numbers_whose_result_is_greater_than_e308() {
		 a = 2;
		 b = -Double.MAX_VALUE;
	}
	@Then("no se pueden restar numeros tan grandes")
	public void resta_numero_grandes() {
		assertThrows(ArithmeticException.class, () -> {
			c.resta(a,b);
		});
	}



	@Given("I want to use the calculator to add")
	public void i_want_to_use_the_calculator_to_add() {
	    c = new Calculadora();
	}
	@When("I add {double} and {double}")
	public void i_add_and(Double d1, Double d2) {
	    a = d1;
	    b = d2;
	    resultD = c.suma(a, b);
	}
	@Then("the result is {double}")
	public void the_result_is(Double answer) {
		assertEquals(answer, resultD);
	}
	@Then("result - a = b")
	public void prueba_suma_a() {
		assertEquals(resultD - a, b);
	}
	@Then("result - b = a")
	public void prueba_suma_b() {
		assertEquals(resultD - b, a);
	}


	@Given("I want to use the calculator to add big numbers")
	public void i_want_to_use_the_calculator_to_add_big_numbers() {
	   c = new Calculadora();
	}
	@When("I try to add two numbers whose result is greater than Double.MAX_VALUE")
	public void i_try_to_add_two_numbers_whose_result_is_greater_than_e308() {
		a = 2;
		b = Double.MAX_VALUE;
	}
	@Then("no se pueden sumar numeros tan grandes")
	public void suma_numeros_grandes() {
		assertThrows(ArithmeticException.class, () -> {
			c.suma(a,b);
		});
	}

}