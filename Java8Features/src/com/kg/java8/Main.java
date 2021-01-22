package com.kg.java8;

import java.util.ArrayList;

public class Main {

public static void main(String[] args) {
	FuncInterface f1 = (a,b)->System.out.println("This is Lambda expression>> "+(a+b));
	f1.m1(10, 20);
	FuncInterface f2 = new Test();
	f2.m2();
	System.out.println("This is static method " +FuncInterface.add(5, 6));
}
}
