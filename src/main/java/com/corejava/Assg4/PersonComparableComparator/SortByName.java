package com.corejava.Assg4.PersonComparableComparator;

import java.util.Comparator;

import com.corejava.InterfaceClassAssg4.Person.Person;

class SortByName implements Comparator<Person> {

	public int compare(Person p1, Person p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
}
