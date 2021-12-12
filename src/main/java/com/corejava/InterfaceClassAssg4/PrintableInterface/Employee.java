package com.corejava.InterfaceClassAssg4.PrintableInterface;

public class Employee implements Printable,Sortable,Cloneable{

	public void printAll() {
		System.out.println("Print Employee info implementing printable interface");
	}

	public void sortAll() {
		System.out.println("Print Employee info implementing sortable interface");
	}
}
