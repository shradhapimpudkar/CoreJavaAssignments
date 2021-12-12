package com.corejava.Assg5.fact;
public class Faculty {
/**
* Visible globally
* @param rollNo
*/
public void getStudentMarks_Public(int rollNo) {
System.out.println("Public modifier accessable " + rollNo);
}
/**
* Visible only within the class
* @param rollNo
*/
private void getStudentMarks_Private(int rollNo) {
System.out.println("Private modifier accessable " + rollNo);
}
/**
* Visible outside the package but only inheriting the parent class
* @param rollNo
*/
protected void getStudentMarks_Protected(int rollNo) {
System.out.println("Protected modifier accessable " + rollNo);
}
/**
* Visible only inside the package
* @param rollNo
*/
void getStudentMarks_Default(int rollNo) {
System.out.println("Default modifier accessable " + rollNo);
}
}

