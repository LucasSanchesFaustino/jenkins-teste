package calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	
	public float sum (float number1, float number2) {
		
		return (number1 + number2);
	}
	
 	public float subtract (float number1, float number2) {
 		
 		return (number1 - number2);
 	}
 	
	public float multiply(float number1, float number2) {

		return (number1 * number2);
	}
	
	public float divide(float number1, float number2) {

		return (number1 / number2);
	}
	
}