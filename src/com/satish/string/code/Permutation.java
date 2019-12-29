package com.satish.string.code;
public class Permutation {

	public static void main(String[] args) {
		helper("","sat");
	}

	private static void helper(String prefix, String givenString) {
		// TODO Auto-generated method stub
		if(givenString.length()==0) {
			
			System.out.println(prefix);
		}else {
			for(int i=0;i<givenString.length();i++) {
				helper(prefix+givenString.charAt(i), givenString.substring(0,i)+givenString.substring(i+1));
			}
		}
	}
}
