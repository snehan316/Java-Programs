package com.sneha;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		
		fibonacciSeries(10);
	}
	
	private static void fibonacciSeries(int terms) {
		
		int first = 0;
		int second = 1;
		
		int[ ] fibArray = new int[terms];
		fibArray[0] = 0;
		fibArray[1] = 1;
		
		for(int i = 2; i < terms; i++ ) {
			fibArray [i] = fibArray[i-1] + fibArray[i-2];
		}
		
		System.out.println(Arrays.toString(fibArray));
		
		
	}
}
