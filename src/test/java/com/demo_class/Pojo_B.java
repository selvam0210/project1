package com.demo_class;

public class Pojo_B {
	
	static int fun() {
		return 20;
		

	}

	public static void main(String[] args) {
		
		Pojo_A a = new Pojo_A();
		
		int age = a.getAge();
		System.out.println("Age :" +age);
		
		a.setAge(23);
		
		int value = a.getAge();
		
		
	}
}
