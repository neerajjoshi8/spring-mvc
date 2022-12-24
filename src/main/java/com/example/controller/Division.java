package com.example.controller;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = DivisionConstraintValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface Division {
	public String[] value() default { "DIV I" };

	public String message() default "It should belong to DIV I";

	public Class<?>[] groups() default {};

	public Class<? extends Payload>[] payload() default {};

}
