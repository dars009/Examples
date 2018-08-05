package com.java8;

import java.util.ArrayList;
import java.util.List;

public class StramsTest {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(30);
		al.add(30);
		al.add(90);
		al.add(90);
		
		
		System.out.println(al);
		int aa=al.stream().filter(i -> i > 30).mapToInt(i -> i).sum();
		System.out.println(aa);
	}
}
