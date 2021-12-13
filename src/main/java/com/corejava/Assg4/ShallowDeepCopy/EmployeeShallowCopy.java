package com.corejava.Assg4.ShallowDeepCopy;

public class EmployeeShallowCopy implements Cloneable {

	 int id;
	 String empName;
	 CloneTest contact;
	
	 
	 public EmployeeShallowCopy(int id, String empName,CloneTest contact) {
		super();
		this.id = id;
		this.empName = empName;
		this.contact = contact;
	}
	 
	 
	 
	 
	 public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getEmpName() {
		return empName;
	}




	public void setEmpName(String empName) {
		this.empName = empName;
	}


      public void printEmail() {
    	  System.out.println("Email : "+contact.email);
      }

	// Default version of clone() method Creates Shallow Copy
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	 
	 
	
	
}
