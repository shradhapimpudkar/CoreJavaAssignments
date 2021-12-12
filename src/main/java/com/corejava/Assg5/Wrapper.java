package com.corejava.Assg5;

import java.util.Arrays;
import java.util.Scanner;

public class Wrapper {
	
	public static void main(String[] args)
	{
		System.out.println("Please enter size of array for sorting");
		
		Scanner scanObject = new Scanner(System.in);
		int n = Integer.parseInt(scanObject.nextLine());
		
		System.out.println("\n");
		
		int[] array = new int[n];
		
		for(int i=0;i<n;i++)
		{
			Scanner scanObject1 = new Scanner(System.in);
			int n1 = Integer.parseInt(scanObject.nextLine());
			array[i]=n1;
			
		}
		
		Arrays.sort(array);
		System.out.println("Sorted Entered numbers are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
		
	}
}
