package com.corejava.Assg4.ShallowDeepCopy;

public class EmployeeDeepCopy implements Cloneable{

	 int id;
	 String empName;
	 CloneTest contact;
	
	 
	 public EmployeeDeepCopy(int id, String empName, CloneTest contact) {
		super();
		this.id = id;
		this.empName = empName;
		this.contact =contact;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		  EmployeeDeepCopy emp = (EmployeeDeepCopy) super.clone();
	      emp.contact = (CloneTest) contact.clone();
	      return emp;
	}
	
	
}
