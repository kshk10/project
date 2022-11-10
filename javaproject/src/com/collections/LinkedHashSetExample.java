package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> as = new LinkedHashSet<Integer>();
		as.add(10);
		as.add(20);
		as.add(40);
		as.add(30);
		as.add(35);
		System.out.println(as.size());
		for (Integer integer : as) {
			System.out.println(integer);
		}
	}
}