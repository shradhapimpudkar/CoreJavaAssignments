package com.corejava.Assg5.stud;

import com.corejava.Assg5.fact.Faculty;

public class Student extends Faculty {

	public static void main(String[] args) {
		Student student = new Student();
		student.getStudentMarks_Public(64673);
		student.getStudentMarks_Protected(64673);
		/*
		 * these below 2 methods can't be accessed becoz they are declared private
		 */		
		//student.getStudentMarks_Default(64673);
		//student.getStudentMarks_Private(64673);
	}
}
