package com.corejava.ClassNObjAssg1;
//6. Write a single tone class. Confirm that single tone class cannot be inherited.
public class SingletonTest {

	private static SingletonTest singletonInstance;
	
	private SingletonTest()
	{
	}
	
	public static SingletonTest getInstance()
	{
		if(singletonInstance==null)
		{
			singletonInstance=new SingletonTest();
		}
		return singletonInstance;
	}
	
	public static void main(String[]arg){
		
		SingletonTest singleton = getInstance(); 
		SingletonTest singleton2 = getInstance();

		System.out.println(singleton==singleton2);
		
	}
}
