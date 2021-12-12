package com.corejava.Assg5;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = new String("ABC");

		if (s1.equals(s2)) {//here it will check for equal strings if they are same
			System.out.println("Result of s1 equals s2:" + s1 + "-" + s2);
		} else if (s1 == s2) {//here it will check for two objects rather than strings
			System.out.println("Result of s1 == s2:" + s1 + "-" + s2);
		}
	}

}
