package com.kg.java8;

@FunctionalInterface
public interface FuncInterface {
	
	void m1(int a,int b);
	
	default void m2() {
		System.out.println("This is default method");
	}
	
	static int add(int a , int b) {
		return a*b;
	}

}
