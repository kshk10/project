package com.collections;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Integer> as = new HashSet<Integer>();
		as.add(10);
		as.add(20);
		as.add(10);
		as.add(30);
		as.add(35);
		System.out.println(as.size());
		for (Integer integer : as) {
			System.out.println(integer);
		}
	}
}