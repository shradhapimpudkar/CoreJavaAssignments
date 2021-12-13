package com.corejava.Assg4.PersonComparableComparator;

import java.util.Comparator;

import com.corejava.InterfaceClassAssg4.Person.Person;

class SortByWeight implements Comparator<Person> {

	public int compare(com.corejava.Assg4.PersonComparableComparator.Person p1,
			com.corejava.Assg4.PersonComparableComparator.Person p2) {
		
		if(p1.weight == p2.weight)
			return 0;
		else if(p1.weight > p2.weight)
			return 1;
		
		else 
		return -1;
	}

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
