package com.nadan.java.polymorphism;

public class Son extends Father {
	
	public void goSchool(){
		System.out.println("�б��� ���ϴ�");
	}
	
	@Override
	public void goWork(){
		super.goWork();
		System.out.println("�б��� ���ϴ�");
	}
	
	@Override
	public void setName(String name){
		super.setName("s"+name);
	}

}
