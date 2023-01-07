package com.sneha;

public class SumOfDigits {

	public static void main(String[] args) {
		
		System.out.println(sumOfDigits(8975));

	}
	
	private static int sumOfDigits(int num) {
		
		int remainder = 0;
		while(num > 0) {
			
			remainder += num %10;
			num = num/10;
			
		}
		
		return remainder;
	}

}
