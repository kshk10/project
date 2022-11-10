package com.collections;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> as = new TreeSet<Integer>();
		as.add(10);
		as.add(20);
		as.add(25);
		as.add(30);
		as.add(35);
		System.out.println(as.size());
		for (Integer integer : as) {
			System.out.println(integer);
		}
	}
}