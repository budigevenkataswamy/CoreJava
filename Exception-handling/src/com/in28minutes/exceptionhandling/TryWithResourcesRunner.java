package com.in28minutes.exceptionhandling;

import java.util.Scanner;

public class TryWithResourcesRunner {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){

		int[] numbers = { 12, 13, 14, 55 };

		int number = numbers[5];
	} 
	}

}
