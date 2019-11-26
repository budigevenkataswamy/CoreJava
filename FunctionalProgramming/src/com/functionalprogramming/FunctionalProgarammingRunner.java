package com.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class FunctionalProgarammingRunner {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Banana","cat","dog");
		
		printWithFP(list);
	}

	private static void printBasic(List<String> list) {
		for(String values:list) {
			System.out.println(values);
			
		}
	}
	
	private static void printWithFP(List<String> list) {
		list.stream().forEach(elements -> System.out.println(elements));
		 
	}

}
