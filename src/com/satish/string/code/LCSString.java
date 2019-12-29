package com.satish.string.code;

public class LCSString {

	
	public static void main(String[] args) {
		
		String s[] = {"satish","sati","sat"};
		
		int index=0;
		
		String longString="";
		String first = s[0];
		
	   for(char c:first.toCharArray()) {
		   
		   for(int i=1;i<s.length;i++) {
			   
			   if(index>s[i].length()-1 || s[i].charAt(index)!=c) {
				 System.out.println(longString);
				 return;
			   }
			   
		   }
		   longString=longString+c;
		   index++;
	   }
		System.out.println(longString);
	}
}
