package com.collections;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatedWordsUsingMap {
	public static Map<Character, Integer> countRepeatedWords(String line) {
		Map<Character, Integer> sentence = new HashMap<>();
		char[] array = line.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (sentence.containsKey(array[i])) {
				int value = sentence.get(array[i]);
				sentence.put(array[i], value + 1);
			} else {
				sentence.put(array[i], 1);
			}
		}
		return sentence;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character, Integer> sentence = countRepeatedWords("selenium");
		for (Map.Entry<Character, Integer> e : sentence.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}
}