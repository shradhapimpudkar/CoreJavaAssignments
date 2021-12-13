package com.corejava.AbstractClassAssg3;
public abstract class Persistence {
	
	public abstract void persist();
	
	
	public static void main(String args[]) {
		
	    PersistanceFactoryPatten fp = new PersistanceFactoryPatten();
//		Persistence ps = fp.getInstance("Data");//this will call Database persistance class method
		Persistence ps = fp.getInstance("File");//this will call File persistance class method
		ps.persist();
	}

}



