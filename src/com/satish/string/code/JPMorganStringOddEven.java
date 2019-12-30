package com.satish.string.code;

public class JPMorganStringOddEven {

	public static void main(String[] args) {
		int num=233948322;//if odd * if even even -
		
		int f=-1,s=1;
		
		StringBuilder sb = new StringBuilder();
		s=num%10;
		sb.append(s);
		while(num>0) {
			s=num%10;
			 num = num/10;
			 if(num==0) {
				 break;
			 }
			f=num%10;
			
			if(s%2==0 && f%2==0) {
				sb.append("*");
			}
            if(s%2!=0 && f%2!=0) {
            	sb.append("-");
			}
            sb.append(f);
            
           
		}
		System.out.println(sb.reverse());
	}
}
