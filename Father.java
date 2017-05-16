package com.nadan.java.polymorphism;

public class Father {
	
	private String name;
	private int age;
	
	public void goWork(){
		System.out.println("일하러 갑니다");
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
	
	
	

}
