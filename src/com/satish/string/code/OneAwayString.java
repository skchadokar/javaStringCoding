package com.satish.string.code;

public class OneAwayString {

	//pale ple-> true
	public static void main(String[] args) {
		
		String s1="pales";
		String s2="bake";
		
		if(s1==null && s2==null && s1.isEmpty() && s2.isEmpty()) {
			return ;//true
		}

		if(s1==null || s2==null || s1.isEmpty() || s2.isEmpty()) {
			return ;//false
		}
		
		if(Math.abs(s1.length()-s2.length())>1) {
			return;// false;
		}
		StringBuilder sb1= new StringBuilder(s1);
		StringBuilder sb2= new StringBuilder(s2);
		for(char c: s1.toCharArray()) {
			if(sb2.indexOf(c+"")>-1) {
				sb2 = sb2.deleteCharAt(sb2.indexOf(c+""));
				sb1 = sb1.deleteCharAt(sb1.indexOf(c+""));
			}
		}
		sb1 = sb1.append(sb2);
		System.out.println(sb1.length()>1?false:true);
	}
}
