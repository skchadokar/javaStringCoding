package com.satish.string.code;

public class ReplaceWith20StringSpace {

	public static void main(String[] args) {
		String s = "my name is Satish  ";
		StringBuilder sb = new StringBuilder();
		for(char c :s.toCharArray()) {
			
			if(c==32) {
				sb.append("%20");
			}else {
				sb.append(c+"");
			}
		}
		
		System.out.println(sb);
	}
}
