package com.satish.string.code;

import java.util.Arrays;
import java.util.Collections;

public class CoomonPrifix {

	public static void main(String[] args) {
		
		String s[] = {"satish","satt","satish","sat",""};
		
		String comStr="";
		if(s==null || s.length==0) {
			return;
		}
		
	//	Arrays.sort(s);
		int index=0;
		for(char c : s[0].toCharArray()) {//satish
			
			for(int i=1;i<s.length;i++) {
				
				String curr = s[i];//sattt
				
				if(index<curr.length() && curr.charAt(index)!=c) {
					System.out.println(comStr);
					return;
				}
				if(comStr.length()==curr.length()) {
					System.out.println(comStr);
					return;
				}
			}
			
			comStr = comStr+c;
			index++;
			
		}
		
		//System.out.println(comStr);
	}
}
