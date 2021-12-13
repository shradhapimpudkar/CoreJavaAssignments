package com.corejava.InterfaceClassAssg4.Person;

import java.util.Comparator;

public class Person implements Comparable<Person>,Comparator<Person>{

	Person()
	{
		
	}
	
	public Person(String name, String height_in_inches, String weight) {
		super();
		this.name = name;
		this.height_in_inches = height_in_inches;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeight_in_inches() {
		return height_in_inches;
	}

	public void setHeight_in_inches(String height_in_inches) {
		this.height_in_inches = height_in_inches;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	private String name;
	private String height_in_inches;
	private String weight;
	
	public int compare(Person o1, Person o2) {
		if(o1.getName().compareTo(o2.getName()) == -1)
		{
			System.out.println("-1");
			return -1;
		}else if(o1.getName().compareTo(o2.getName()) == 1) {
			System.out.println("1");
			return 1;
		}
		return 0;
	}

	public int compareTo(Person o) {
		return -1;
	}

}
