package com.sneha;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] array = {1,2,2,3,4,4,5};
		
		System.out.println("with Duplicates "+Arrays.toString(array));
		Set<Integer> mySet = new HashSet<>();
		for(int i=0; i < array.length; i++) {
			mySet.add(array[i]);
		}
		
		System.out.println("Without Duplicates " + mySet);

	}

}
