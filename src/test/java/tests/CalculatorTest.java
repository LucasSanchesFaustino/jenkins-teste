package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import calculator.service.CalculatorService;

class CalculatorTest {

	@Test
	void sumTest() {
		CalculatorService calculatorService = new CalculatorService();

		assertEquals(4, calculatorService.sum(2, 2));
	}

	@Test
	void subtractTest() {
		CalculatorService calculatorService = new CalculatorService();

		assertEquals(0, calculatorService.subtract(2, 2));
	}
	
	@Test
	void multiplyTest() {
		CalculatorService calculatorService = new CalculatorService();

		assertEquals(4, calculatorService.multiply(2, 2));
	}
	
	@Test
	void divideTest() {
		CalculatorService calculatorService = new CalculatorService();

		assertEquals(1, calculatorService.divide(2, 2));
	}
}