package com.corejava.InhertAndPolyAssg2;

public class DriverMain {
	 public static void main(String[] args)
     {
     	Employee emp1=new Labour();
     	emp1.setSalary(1000);

     	Employee emp2=new Manager();
     	emp2.setSalary(2000);
     	
     	Employee emp3=new Employee();
     	
     	System.out.println("Total salary: "+emp3.calculateSalary(emp1, emp2));
     }
}
