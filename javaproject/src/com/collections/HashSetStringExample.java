package com.collections;

import java.util.HashSet;

public class HashSetStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> al = new HashSet<String>();
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