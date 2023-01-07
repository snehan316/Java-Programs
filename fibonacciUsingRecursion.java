package com.sneha;

public class fibonacciUsingRecursion {

public static void main(String[] args) {
		
	    int terms = 10;
	    for(int i =0; i < terms; i++ ) {
	    	System.out.println(fibonacciSeries(i) + " ");
	    }
		
	}

   private static int fibonacciSeries(int terms) {
	   
	   if(terms == 0) {
		   return 0;
	   }
	   
	   if(terms == 1 || terms ==2) {
		   return 1;
	   }
	   
	   return fibonacciSeries(terms -1) + fibonacciSeries(terms - 2);
   }
}
