package com.in28minutes.exceptionhandling;

public class ExceptionHandlingRunner2 {

	public static void main(String[] args) {
		method1();
		System.out.println("main ended");
	}

	private static void method1() {
		method2();
		System.out.println("method1 ended");
	}

	private static void method2() {
		try {
		/*String str=null;
		str.length();*/
			int[] i= {1,2,3};
			int number=i[3];
		System.out.println("method2 ended");
	}catch (NullPointerException ex) {
		ex.printStackTrace();
		System.out.println("null pointer exception");
	}catch (ArrayIndexOutOfBoundsException ex) {
		ex.printStackTrace();
		System.out.println("Arrayindexoutofbound exception");
	}catch (Exception ex) {
		ex.printStackTrace();
		System.out.println("Matched exception");
		
	}
	
}
}
