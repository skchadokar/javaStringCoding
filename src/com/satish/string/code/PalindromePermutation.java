package com.satish.string.code;

public class PalindromePermutation {

	public static void main(String[] args) {
		
		String input = "Tact Coa";
		if(input==null) {
			return;//false
		}
		input = input.replaceAll(" ", "").toUpperCase();
		
		int count =0;
		
		for(char c : input.toCharArray()) {
			
			if(input.indexOf(c)==input.lastIndexOf(c)) {
				count++;
			}
		}
		System.out.println(count>1?false:true);
	}
}
