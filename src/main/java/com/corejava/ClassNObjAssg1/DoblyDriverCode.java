package com.corejava.ClassNObjAssg1;

public class DoblyDriverCode {
	private static void initDoublyLinkedList() {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insert(8);
		dll.insert(9);
		dll.insert(10);
		dll.insert(11);
		dll.insert(12);

		System.out.println("List count: " + dll.count());
		dll.printNodes();
		dll.delete();
		System.out.println("\nNew List count: " +dll.count());

		}
	public static void main(String[] args) {
		initDoublyLinkedList();
	}
}
