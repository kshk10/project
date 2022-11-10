package com.collections;

import java.util.ArrayList;

public class ArrayListStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("India");
		al.add("Tamil Nadu");
		al.add("Dharmapuri");
		al.add("Karimangalam");
		al.add("Green");
		al.remove(0);
		System.out.println(al.size());
		for (String string : al) {
			System.out.println(string);
		}

	
	}
}