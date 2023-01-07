package com.sneha;

public class ReverseNumber {

	public static void main(String[] args) {
	
      int reversedNum = reverseNum(123);
      System.out.println(reversedNum);
	}
	
	private static int reverseNum(int num) {
		
		int reverse = 0;
		System.out.println("Input num = " + num);
		while(num > 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		
		return reverse;
		
	}

}
