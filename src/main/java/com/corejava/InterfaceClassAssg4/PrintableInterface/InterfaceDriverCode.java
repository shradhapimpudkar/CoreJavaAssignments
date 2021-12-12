package com.corejava.InterfaceClassAssg4.PrintableInterface;

/**
 * 
 * @author SP64673
 * 
 * Printable and Sortable interfaces implemented in circle and 
 * employee class i.e question 1 and 2 both done here
 *
 */
public class InterfaceDriverCode {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.printAll();
		emp.sortAll();

		Circle circle = new Circle();
		circle.printAll();
		circle.sortAll();
	}
}
