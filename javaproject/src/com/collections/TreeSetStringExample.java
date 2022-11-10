package com.collections;

import java.util.TreeSet;

public class TreeSetStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> al = new TreeSet<String>();
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