package com.corejava.InterfaceClassAssg4.Person;

public class PersonDriverCode {

	public static void main(String[] args) {
		Person p1=new Person("Shradha","5.9","50");
		Person p2=new Person("Vijay","5.9","60");
		Person p3=new Person();
		
		p3.compare(p1,p2);
		
	}
}
