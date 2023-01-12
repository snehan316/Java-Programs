package com.sneha;

public class CountDigitInCube {

	public static void main(String[] args) {
		
		int count= occurence(1551,3);
		System.out.println(count);

	}
	
	public static int occurence(long number, int digit) {
		
		long cube = (number * number * number);
		System.out.println(cube);
		int count = 0;
		
		while(cube > 0) {
		  if(cube % 10 == digit) {
			  count++;
		  }
		  
		  cube = cube/10;
		}
		
		return count;
	}

}
