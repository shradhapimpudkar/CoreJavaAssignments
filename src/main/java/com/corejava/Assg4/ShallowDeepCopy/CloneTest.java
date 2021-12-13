package com.corejava.Assg4.ShallowDeepCopy;

public class CloneTest implements Cloneable {
	
	String email;

	public CloneTest(String email) {
		super();
		this.email = email;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

}
