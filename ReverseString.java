package com.sneha;

public class ReverseString {

	public static void main(String[] args) {
		
		reverseString("Hello World");

	}
	
	public static void reverseString(String inputString) {
		
		char[] charArray = inputString.toCharArray();
		char temp;
		int halfIndex = charArray.length/2;
		int maxIndex = charArray.length -1;
		for(int i =0; i < halfIndex; i++) {
			temp = charArray[i];
			charArray[i] = charArray[maxIndex -i];
			charArray[maxIndex -i] = temp;
		}
		
		
		System.out.println(new String(charArray));
	}

}
