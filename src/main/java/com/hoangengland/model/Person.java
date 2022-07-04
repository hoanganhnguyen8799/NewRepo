package com.hoangengland.model;

import java.io.Serializable;

public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6580506857012617507L;
	private int age;
	private String name,phone;
	public Person() {
		
	}
	public Person(int age, String name, String phone) {
		super();
		this.age = age;
		this.name = name;
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		System.out.println("Hello person: ");
		return "Person [age=" + age + ", name=" + name + ", phone=" + phone + "]";
	}
	
}
