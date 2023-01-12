package com.sneha;

public class PalindromeString {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("SAFAR"));

	}
	
	public static boolean isPalindrome(String str) {
		
		char[] chars = str.toCharArray();
		int lastIndex = chars.length - 1;
		for(int i =0; i < chars.length / 2; i++) {
			if(chars[i] != chars[lastIndex--]) {
				return false;
			}
		}
		
		return true;
	}

}
