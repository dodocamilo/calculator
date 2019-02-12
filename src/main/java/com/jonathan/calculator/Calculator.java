package com.jonathan.calculator;

import org.springframework.stereotype.Service;

/**
* Calculator service.
*/
@Service
public class Calculator {
	public int sum(int a, int b) {
		return a + b;
	}
}