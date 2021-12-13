package com.corejava.AbstractClassAssg3;
public class PersistanceFactoryPatten {
	
	
	public Persistence getInstance(String str) {
		    if(str.equals("File")) {
		       return new FilePersistence();
		    }else if(str.equals("Data")) {
		    	return new DatabasePersistence();
		    }
			return null;
	}

}


