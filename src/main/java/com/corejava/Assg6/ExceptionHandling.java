package com.corejava.Assg6;

import java.util.Scanner;
import java.util.*;

public class ExceptionHandling {
	public static void main(String[] args) {
		initTryWithMultipleCatch();
		initNestedTryCatch();
		initTryCatchFinally();
		initTryFinally();
	}

	/**
	 * Try with multiple catch block
	 */
	private static void initTryWithMultipleCatch() {
		try {
			Scanner scanObject = new Scanner(System.in);
			int n = Integer.parseInt(scanObject.nextLine());
			int result = 10 % n;
			System.out.println("No Exception, result " + result);
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("Exception " + e);
		}
	}
	
	/**
	 * Nested try catch blocks 
	 */
	private static void initNestedTryCatch() {
		try {
			Scanner scanner = new Scanner(System.in);
			int n = Integer.parseInt(scanner.nextLine());
			try {
				int[] ary = {1,2,3,4};
				System.out.println(ary[n]);				
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException " + e);
			}
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException " + e);
		}
	}
	

	/**
	 * Try, catch & finally block
	 */
	private static void initTryCatchFinally() {
		Scanner scanner = new Scanner(System.in);
		try {
			int n = Integer.parseInt(scanner.nextLine());
			int result = 10 % n;
			System.out.println("No Exception, result " + result);
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("Exception " + e);
		} finally {
			scanner.close();
		}
	}
	
	/**
	 * Try with finally block
	 */
	private static void initTryFinally() {
		Scanner scanner = new Scanner(System.in);
		try {
			int n = Integer.parseInt(scanner.nextLine());
			int result = 10 % n;
			System.out.println("No Exception, result " + result);
		} finally {
			scanner.close();
		}
	}
}