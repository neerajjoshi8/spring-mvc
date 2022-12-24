package com.example.controller;

import java.util.Arrays;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DivisionConstraintValidator implements ConstraintValidator<Division, String> {

	private String[] divisionValue;

	@Override
	public void initialize(Division constraintAnnotation) {
		divisionValue = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return Arrays.stream(divisionValue).anyMatch(x -> x.equals(value));
	}

}
