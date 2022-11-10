package com.collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10, 30);
		al.add(20);
		al.add(25);
		al.add(30);
		al.add(35);
		System.out.println(al.size());
		for (Integer integer : al) {
			System.out.println(integer);
		}
	}
}