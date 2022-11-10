package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindingVowelsInASentence {
	public static Map<Character, Integer> countingVowels(String name) {
		Map<Character, Integer> vowels = new HashMap<>();
		vowels.put('a', 0);
		vowels.put('e', 0);
		vowels.put('i', 0);
		vowels.put('o', 0);
		vowels.put('u', 0);
		char[] array = name.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (vowels.containsKey(array[i])) {
				int count = vowels.get(array[i]);
				vowels.put(array[i], count + 1);
			}
		}
		return vowels;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character, Integer> values = countingVowels("India is my country");
		for (Map.Entry<Character, Integer> string : values.entrySet()) {
			System.out.println(string.getKey() + " " + string.getValue());
		}
	}
}