package com.corejava.ClassNObjAssg1;

public class QueuedArray {

	private int front, rear, capacity;
	private int queue[];

	QueuedArray(int capacity) {

		front = rear = 0;
		this.capacity = capacity;
		this.queue = new int[capacity];

	}

	void enque(int data) {
		// add data in queue

		if (capacity == rear) {
			System.out.println("Queue is full\n");
			return;
		} else {
			// we can insert at rear

			queue[rear] = data;
			rear++;

		}
		return;

	}

	void dequeue() {
		// if queue is empty
		if (front == rear) {
		System.out.println("Queue is empty\n");
		return;
		} else {

		// shift all elements to left by 1
		for (int i = 0; i < rear-1; i++) {

		queue[i] = queue[i + 1];

		// storing 0 at rear
		if (rear < capacity) {
		queue[rear] = 0;

		}
		}
		rear--;
		}
		}

	void queueDisplay() {
		int i;
		if (front == rear) {
			System.out.println("Queue is Empty\n");
			return;
		}

		// print elements
		for (i = front; i < rear; i++) {
			System.out.printf(" %d <-- ", queue[i]);
		}
		System.out.println("\n");
		return;
	}

	public static void main(String[] args)
	{
		QueuedArray queue = new QueuedArray(4);

		queue.enque(10);
		queue.enque(20);
		queue.enque(30);
		queue.enque(40);
//		queue.enque(50);
//		queue.enque(60);
//		queue.enque(30);
//		queue.enque(30);
//		queue.enque(30);


		queue.queueDisplay();

		queue.dequeue();
		queue.queueDisplay();
		}
}

