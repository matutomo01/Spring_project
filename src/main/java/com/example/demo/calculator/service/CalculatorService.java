package com.example.demo.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public int calculator(int num1, String operator, int num2) {

		int result = 1;

		switch (operator) {

		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		}

		return result;

	}

}