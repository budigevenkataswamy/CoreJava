package com.in28minutes.exceptionhandling;

import java.util.Scanner;

public class FinnallyRunner {

	public static void main(String[] args) {
		Scanner scanner=null;
		try {
			 scanner = new Scanner(System.in);

			int[] numbers = { 12, 13, 14 };

			int number = numbers[5];

			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("before scanner closed....");
			if(scanner!=null) {
			scanner.close();
			}
		}
		
		System.out.println("just before closing out main ....");
	}

}
