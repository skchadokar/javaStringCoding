package com.satish.string.code;

public class DecodeString {

	
	public static void main(String[] args) {
		String s = "aaaabbbbcddeeee";
		int count =0;
		
		StringBuilder sb = new StringBuilder();
		
		if(s==null || s.isEmpty()) {
			return;//true/false as per interviewer
		}
		char curr = s.charAt(0);
		for(char c: s.toCharArray()) {
			if(c==curr) {
					count++;
				}else {
					sb.append(curr).append(count);
					count =1;
					curr=c;
		  }
		}
		sb.append(curr).append(count);
		System.out.println(sb);
	}
}
