package com.sneha;

public class BinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isBinary(10801100));
		System.out.println(isBinary(1011011));
	}
	
	
	private static boolean isBinary(int num) {
		
		while(num !=0) {
			
			if(num % 10 > 1) {
				return false;
			}
			
			num = num / 10;
		}
		
		return true;
	}

}
