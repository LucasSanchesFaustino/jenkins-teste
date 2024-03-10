package calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
	
	@Autowired
	private CalculatorService calculatorService;
	
	@GetMapping("/sum")
	public float sum(float number1, float number2) {

       return calculatorService.sum(number1, number2);
    }
	
	@GetMapping("/subtract")
	public float subtract(float number1, float number2) {

		return calculatorService.subtract(number1, number2);
	}
	
	@GetMapping("/multiply")
	public float multiply(float number1, float number2) {

		return calculatorService.multiply(number1, number2);
	}
	
	@GetMapping("/divide")
	public float divide(float number1, float number2) {

		return calculatorService.divide(number1, number2);
	}
	
}