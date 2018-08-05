package com.yash;

import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		int i;
		for(i=1;i<=10;i++) {
			al.add(i);
			System.out.println("loop val :"+i);
			System.out.println(al);
		}
		for(i=1;i<=5;i++) {
			al.remove(i);
		}
		System.out.println("loop val for remove"+i);
		System.out.println(al);
	}

}
