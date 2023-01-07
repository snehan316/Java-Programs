package com.sneha;

public class PrimeNumber {

public static void main(String[] args) {
		
	   System.out.println(isPrimeNumber(12));
	}


  private static boolean isPrimeNumber(int num) {
	  
	  for(int i =2; i < Math.sqrt(num); i++) {
		  if(num % i ==0) {
			  return false;
		  }
	  }
	  
	  return true;
  }
}
