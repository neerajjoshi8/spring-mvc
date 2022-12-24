package com.example.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
	@NotNull(message = "Required field")
	@Size(min = 3, message = "It should be atleast 3 characters long")
	private String name;
	
	@NotNull(message = "Required field")
	@Min(value = 1, message = "The value should be greater than or equal to 1")
	@Max(value = 10, message = "The value should be less than or equal to 10")
	private Integer age;
	private String marks;
	private String subjects;

	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + ", subjects=" + subjects + "]";
	}

}
