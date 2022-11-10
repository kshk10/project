package com.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> al = new LinkedHashSet<String>();
		al.add("India");
		al.add("Tamil Nadu");
		al.add("Dharmapuri");
		al.add("Karimangalam");
		al.add("India");
		System.out.println(al.size());
		for (String string : al) {
			System.out.println(string);
		}
	}
}