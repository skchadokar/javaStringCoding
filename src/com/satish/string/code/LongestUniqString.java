package com.satish.string.code;

import java.util.HashMap;
import java.util.Map;



public class LongestUniqString {

	public static void main(String[] args) {
		
		String s="satish";
		
		int fast =0,slow=0;
		Map<Character, Integer> visitedMap =  new HashMap<>();
		
		String longString = "";
		for(int i=0;i<s.length() ;i++) {
			
			char currentChar = s.charAt(i);
			if(visitedMap.containsKey(currentChar)) {
				
				slow = Math.max(visitedMap.get(currentChar), slow+1);
			}else {
				visitedMap.put(currentChar, fast);
	 		}
			String temp = s.substring(slow,fast+1);
			if(temp.length()>longString.length()) {
				longString=temp;
			}
			fast++;
			
		}
		
		System.out.println(longString);
	}
}
