package com.corejava.AbstractClassAssg3;

/*private final*/ abstract class AbstractClass {// abstract class cannot
	// be private else it gives error and also private and final keyword cant be
	// used for abstract class
	public abstract void abstractMethod1();

	public abstract void abstractMethod2();// Make class abstract else it gives error bcz if at least one
	// method is abstract entire class has to be declared as abstract

	/* Abstract class can have non abstract methods also like below method */
	public void notAbstractMethod() {

	}

	public static void main(String[] args) {
		// AbstractClass abs=new AbstractClass();//this error is bcz we canot
		// createobject of it or instantiate it

	}
}
