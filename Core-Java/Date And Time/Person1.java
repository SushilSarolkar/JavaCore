package com.techm.sushil;

public class Person1 {
	private String name;
	private int age;
	private String gender;
	public Person1() {
		
	}
	public Person1(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "person1 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	}
