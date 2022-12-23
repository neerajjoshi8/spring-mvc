package com.example.model;

public class Student {
	private String name;
	private String age;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
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
