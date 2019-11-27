package com.satish.string.code;

import java.util.HashSet;
import java.util.Set;

public class AllUniqueInString {

	public static void main(String[] args) {
		String s = "satishsatislkcmlfm";
		Set<Character> sc=  new HashSet<>();
		
		for(char c : s.toCharArray()) {
			sc.add(c);
		}
		
		System.out.println(sc);
	}
}
