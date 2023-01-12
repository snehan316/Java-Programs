package com.sneha;

public class SwapWithoutTemp {

	public static void main(String[] args) {

		swap(10,5);
	}
	
	public static void swap(int a, int b) {
		System.out.println("Before Swap : " + a + " " + b);
		a = a + b;
		b = a- b;
		a = a-b;
		System.out.println("After Swap : " + a + " " + b);
		
	}

}
