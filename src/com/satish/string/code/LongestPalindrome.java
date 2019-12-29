package com.satish.string.code;

public class LongestPalindrome {

	
	private static void helper(String s) {
		if(s==null||s.length()==0) return;
		int mLen = s.length();
		int r =0,l=0;
		boolean table[][]=new boolean[mLen][mLen];
		for(int i=0;i<mLen;i++) {
			table[i][i] = true;
		}
		for(int j=1;j<mLen;j++) {
			for(int i=0;i<j;i++) {
			 boolean isAvlPalWord = table[i+1][j-1] || j-i<2;
			 if(s.charAt(i)==s.charAt(j) && isAvlPalWord) {
				 table[i][j] = true;
				 if(j-i>r-l) {
					 r=j;
					 l=i;
				 }
			 }
			}
		}
		System.out.println(s.substring(l, r+1));
 }
	
	public static void main(String[] args) {
		
		String s="abaab";
		helper(s);
		int left = 0,right=0;
		boolean dp[][]= new boolean[s.length()][s.length()];
			
		for(int i=0;i<s.length();i++) {
			dp[i][i] = true;
		}
		for(int j=1;j<s.length();j++) {
			
			for(int i=0;i<j;i++) {
				boolean isPalWordFound = dp[i+1][j-1]||j-i<2;
				
				if(isPalWordFound && s.charAt(i)==s.charAt(j)) {
					dp[i][j]=true;
					
					if(j-i>right-left) {
						
						right = j;
						left = i;
					}
					
				}
				
			}
			
			
		}
		
		System.out.println(s.substring(left,right+1));
			
	}
}
