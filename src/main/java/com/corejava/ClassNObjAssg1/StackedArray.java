package com.corejava.ClassNObjAssg1;

public class StackedArray {
	int array[];
	int top =-1;
	int size;
	
	
	
	public StackedArray(int size) {
		super();
		this.size = size;
		
		this.array = new int[size];
		
	}
	
	void push(int x) {
		
		if(top+1 == size) {
			//array is full
			
			System.out.println("Stack Overflow");
		}else {
			
			array[++top] = x;
			System.out.println(x + " pushed into stack");
		}
	}
	
	 int pop() {
		
		if(top<0) {
			System.out.println("Stack Underflow");
			return 0;
		}else {
			int x =array[top--];
			System.out.println(x + " popped out of stack");
			return x;
			
		}
		
	}
	 
	    void print(){
	  	  
	    for(int i = top;i>-1;i--){
	    	
		System.out.println("Latest elements in array are:"+ array[i]);

	    }
	}
	    
	    public static void main(String[] args) {
			StackedArray stack = new StackedArray(4);
			stack.push(80);
			stack.push(70);
			stack.push(60);
			stack.push(50);
			stack.pop();
			stack.print();	
		}
}
