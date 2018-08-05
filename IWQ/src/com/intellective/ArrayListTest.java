package com.intellective;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		int i;
		for (i = 1; i <= 10; i++) {
			al.add(i);
		}
		
		for (i = 1; i <= al.size(); i++) {
			al.remove(i);
		}
		System.out.println("size of " + al.size());
	}
}

