package com.sneha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(4);

		printDupes(list);  // using Set
		printDuplicates(list); // Using map
		printDupesUsingList(list); // Using list

	}

	public static void printDupesUsingList(List<Integer> list) {

		List<Integer> dupesList = new ArrayList<>();
		List<Integer> resultList = new ArrayList<>();
		for (Integer number : list) {
			if(!dupesList.contains(number)) {
				dupesList.add(number);
			}else {
				resultList.add(number);
				
			}
		}
		
		System.out.println("Duplicates list" + resultList);
	}
	
	
	
	public static void printDuplicates(List<Integer> list) {

		List<Integer> dupesList = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		int count =0;
		for (Integer number : list) {
			if(!map.containsKey(number)) {
				map.put(number, count);
			}else {
				dupesList.add(number);
				
			}
		}
		
		System.out.println("Duplicates " + dupesList);
	}

	public static void printDupes(List<Integer> list) {

		List<Integer> dupesList = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		

		for (Integer num : list) {
			if (set.contains(num)) {
				dupesList.add(num);
			} else {
				set.add(num);
			}
		}

		System.out.println("Duplicates : " + dupesList);

	}
}
