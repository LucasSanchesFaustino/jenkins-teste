package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import calculator.Calculator;

class CalculatorTest {

	@Test
	void sumTest() {
		Calculator calculator = new Calculator();

		assertEquals(4, calculator.sum(2, 2));
	}

	@Test
	void subtractTest() {
		Calculator calculator = new Calculator();

		assertEquals(0, calculator.subtract(2, 2));
	}
	
	@Test
	void sumTestFail() {
		Calculator calculator = new Calculator();

		assertNotEquals(3, calculator.sum(1, 1));
	}
	
	@Test
	void subtractTestFail() {
		Calculator calculator = new Calculator();

		assertNotEquals(0, calculator.subtract(2, 4));
	}
}