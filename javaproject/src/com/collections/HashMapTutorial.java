package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> name = new HashMap<>();
		name.put(1, "Rajadhitha");
		name.put(2, "Karikalan");
		name.put(1, "Aditha");
		for (Map.Entry<Integer, String> e : name.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}