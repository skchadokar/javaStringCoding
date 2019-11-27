package com.satish.string.code;

public class CheckPermutationOfString {

	public static void main(String[] args) {
		
		String s="sat";
		String s1="astw";
		
		if(s==null && s1==null && s.isEmpty() && s1.isEmpty()) {
			System.out.println(true);
			return;//true
		}
		

		if(s==null || s1==null || s.isEmpty() || s1.isEmpty() || (s.length()!=s1.length())) {
			System.out.println(false);
			return;//false
		}
		
		for(char c : s.toCharArray()) {
			
			if(s1.indexOf(c)==-1) {
				System.out.println(false);
				return;// false;
			}
		}
		System.out.println(true);
		return ; //true;
	}
}
