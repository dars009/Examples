package com.yash;

public class ExceptionTest {

	public int m1() {
		
		try {
			return 0;
		}catch (Exception e) {
			return 1;
		}
		finally {
			return 2; // this will return only two statement will not use
		}
	}
	public static void main(String[] args) {
	
		ExceptionTest e= new ExceptionTest();
		int a=e.m1();
		System.out.println(a);
}
}
