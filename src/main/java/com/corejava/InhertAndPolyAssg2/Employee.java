package com.corejava.InhertAndPolyAssg2;

public class Employee{
		double salary;
	
        public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
        
        public Employee()
        {
        	
        }

		public double calculateSalary(Employee emp1,Employee emp2)
        {
        	return emp1.getSalary()+emp2.getSalary();
        }
		
}
	
	


