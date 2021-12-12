package com.corejava.ClassNObjAssg1;

import java.util.ArrayList;

//2. Write a class ComplexNumber having attributes real & imaginary. Add functions like add, subtract, multiply & swap.

class ComplexNumber {

	// variables to hold real and imaginary part of complex
	// number
	int real, image;

	public ComplexNumber() {

	}

	// Constructor which will be used while creating complex number
	public ComplexNumber(int real, int image) {
		this.real = real;
		this.image = image;
	}

	// function to print real number
	public void showC() {
		System.out.println(this.real + " + " + this.image + "i");
	}

	// function for addition
	public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {

		// creating blank complex number
		// to store result
		ComplexNumber res = new ComplexNumber(0, 0);

		// adding real parts of both complex numbers
		res.real = n1.real + n2.real;

		// adding imaginary parts
		res.image = n1.image + n2.image;

		// returning result
		return res;
	}

	// function for substraction
	public static ComplexNumber substract(ComplexNumber n1, ComplexNumber n2) {

		// creating blank complex number
		// to store result
		ComplexNumber res = new ComplexNumber(0, 0);

		// substract real parts of both complex numbers
		res.real = n1.real - n2.real;

		// substract imaginary parts
		res.image = n1.image - n2.image;

		// returning result
		return res;
	}

	// function for multiplication
	public static ComplexNumber multiply(ComplexNumber n1, ComplexNumber n2) {

		// creating blank complex number
		// to store result
		ComplexNumber res = new ComplexNumber(0, 0);

		// multiply real parts of both complex numbers
		res.real = n1.real * n2.real;

		// multiply imaginary parts
		res.image = n1.image * n2.image;

		// returning result
		return res;
	}

	// Function to swap two numbers using temporary variable
	public static ArrayList<ComplexNumber> swapComplexNo(ArrayList<ComplexNumber> complexSwapResult) {

		// creating blank complex number n1 to store result
		ComplexNumber temp = new ComplexNumber();

		temp = complexSwapResult.get(0);
		complexSwapResult.set(0, complexSwapResult.get(1));
		complexSwapResult.set(1, temp);

		return complexSwapResult;

	}

	public static void main(String arg[]) {

		// creating two complex numbers
		ComplexNumber c1 = new ComplexNumber(4, 1);
		ComplexNumber c2 = new ComplexNumber(10, 5);

		// printing complex numbers
		System.out.print("First Complex number: ");
		c1.showC();

		System.out.print("\nSecond Complex number: ");
		c2.showC();

		// calling add() to perform addition
		ComplexNumber addResult = add(c1, c2);

		// calling substract() to perform substraction
		ComplexNumber subResult = substract(c1, c2);

		// calling multiply() to perform multiplication
		ComplexNumber multiplyResult = multiply(c1, c2);

		// list initilzed
		ArrayList<ComplexNumber> al = new ArrayList<ComplexNumber>();
		al.add(c1);
		al.add(c2);

		// calling swap() to perform swapping
		ArrayList<ComplexNumber> swapResult = swapComplexNo(al);

		// displaying addition
		System.out.print("\nAddition is : ");
		addResult.showC();

		// displaying substraction
		System.out.print("\nSubstraction is : ");
		subResult.showC();

		// displaying multiplication
		System.out.print("\nMultiplication is : ");
		multiplyResult.showC();

		// displaying complex swap numbers
		System.out.print("\nSwapped Complex number is : ");
		for (ComplexNumber c : swapResult) {
			c.showC();
		}
	}
}