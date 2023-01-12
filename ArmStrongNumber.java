package com.sneha;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isArmStrong(153));
	}
	
	//153
	
	public static boolean isArmStrong(long num) {
		
		long originalNum = num;
		long digit =0;
		long cube = 0;
		while(num > 0) {
			digit = num % 10; 
			cube += (digit * digit * digit); 
			num = num/10;
			
		}
		
		
		if(cube == originalNum) {
			return true;
		}else {
			return false;
		}
		
	}

}
