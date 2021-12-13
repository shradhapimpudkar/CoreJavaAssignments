package com.corejava.Assg4.PersonComparableComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Person implements Comparable<Person> {

	double  height_in_inches;
	double weight;
	String name;
	
	
	public Person(double height_in_inches, double weight,String name) {
		super();
		this.height_in_inches = height_in_inches;
		this.weight = weight;
		this.name = name;
	}
	
	
	
	
	public int compareTo(Person p) {
		
		
		if(this.height_in_inches == p.height_in_inches)
			return 0;
		else if(this.height_in_inches > p.height_in_inches)
			return 1;
		
		else 
		return -1;		
		
	}
	
	public static void main(String []args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person(60.5, 90,"Neha"));
		list.add(new Person(70.5, 40,"Sid"));
		list.add(new Person(80.5, 84,"ajay"));
		
	//	Collections.sort(list);
		
		//SortByName sortByName = new SortByName();
		
		SortByWeight sortbyWeight = new SortByWeight();
		
		
	//	Collections.sort(list,sortByName);
		//Collections.sort(list,sortbyWeight);
		
		
		for(Person person:list){  
			System.out.println(person.name+" "+person.height_in_inches+" "+person.weight);  
			} 
		
		
	}


	

}
