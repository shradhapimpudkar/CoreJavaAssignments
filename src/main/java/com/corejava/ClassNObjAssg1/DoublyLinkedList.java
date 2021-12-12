package com.corejava.ClassNObjAssg1;
//7. Write java classes to build doubly linked list. Add functionalities like add new node, insert node, delete node, count nodes & print linked list.
	public class DoublyLinkedList {

		Node head, tail = null;

		/* Insert new item*/
		public void insert(int item) {
		Node newNode = new Node(item);
		if (head == null) {
		head = tail = newNode;
		head.previous = null;
		tail.next = null;
		} else {
		tail.next = newNode;
		newNode.previous = tail;
		tail = newNode;
		tail.next = null;
		}
		}

		/* Delete item*/
		public void delete() {
		Node temp = head;
		this.head = temp.getNext();
		this.head.setPrevious(null);
		}

		/*Return node size @return*/
		public int count() {
		int size = 0;
		Node current = head;
		while (current != null) {
		size++;
		current = current.next;
		}
		return size;
		}

		/*Print nodes*/
		public void printNodes() {
		Node current = head;
		if (head == null) {
		System.out.println("Doubly linked list is empty");
		return;
		}
		System.out.print("Nodes of doubly linked list: ");
		while (current != null) {
		System.out.print(current.data + " ");
		current = current.next;
		}
		}

		public class Node {
		private Node previous;
		private Node next;
		private int data;

		public Node() {
		}

		public Node(int data) {
		this.data = data;
		}

		public Node getPrevious() {
		return previous;
		}

		public void setPrevious(Node previous) {
		this.previous = previous;
		}

		public Node getNext() {
		return next;
		}

		public void setNext(Node next) {
		this.next = next;
		}

		public int getData() {
		return data;
		}

		public void setData(int data) {
		this.data = data;
		}
		}
		}