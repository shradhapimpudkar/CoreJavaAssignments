package com.corejava.Assg4.ShallowDeepCopy;

public class InterfaceDemo {
	
	public static void main(String[]ar) {
		
		CloneTest contact = new CloneTest("shradha.pimpudkar@zensar.com");
		
		
		EmployeeDeepCopy empDeep = new EmployeeDeepCopy(123,"Shradha",contact);
		
		EmployeeDeepCopy deepCopy = null;
		
		try {
			deepCopy = (EmployeeDeepCopy) empDeep.clone();
		} catch (CloneNotSupportedException e1) {
		
			e1.printStackTrace();
		}
		

		System.out.println("\n::::::::::Deep Copy Example::::::::::::\n");
		
		System.out.println("Email: "+empDeep.contact.email);
		
		deepCopy.contact.email ="xxxxxxxxxxx";
		      
        System.out.println("Email :"+empDeep.contact.email); 
        
	      
        System.out.println("Email Deep Copy:"+deepCopy.contact.email); 
		
		
		
		EmployeeShallowCopy emp = new EmployeeShallowCopy(64222,"Shradha",contact);
		
		EmployeeShallowCopy empCopy = null;
		
		try {
			empCopy = (EmployeeShallowCopy) emp.clone();
				
		}
		catch (Exception e) {
		System.out.println("Exception");
		}
		
		
		System.out.println("::::::::::ShalowCopy Example::::::::::::\n");
		
	
		System.out.println("Email: "+emp.contact.email);
		
		empCopy.contact.email ="xxxxxxxxxxx";
		      
        System.out.println("Email :"+emp.contact.email); 
		
		
		
	}
}
