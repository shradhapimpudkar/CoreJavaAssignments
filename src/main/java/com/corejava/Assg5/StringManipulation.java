package com.corejava.Assg5;

public class StringManipulation {
	
	
    // Method 1
    // Concatenates to String
	public static void concatString()
	{        
		String stringConcat = "Shradha";
		String stringConcatDuplidate;
		
        stringConcatDuplidate = stringConcat;
        stringConcat = stringConcat + " Pimpudkar";
		if(stringConcat == stringConcatDuplidate) {
			System.out.println("The string passed is not changed, this is due to the fact that String is immutable."
					+ " Altering the value of string creates another object and stringConcat stores reference of the new string. References stringConcat and stringConcatDuplicate refer to different strings.When concatinated String will create new object "
					+ "because it is immutable");	
		}
    }
 
    // Method 2
    // Concatenates to StringBuilder
    public static void concatStringBuilder()
    {
    	 StringBuilder stringBuilder = new StringBuilder("Shradha");
    	 StringBuilder stringBuilderDuplidate;
    	 
    	 stringBuilderDuplidate = stringBuilder;
 		stringBuilder.append(" Pimpudkar");
 		if(stringBuilder == stringBuilderDuplidate) {
 			System.out.println("StringBuilder is similar and can be compatible at all places to StringBuffer except for the key difference of thread safety."
 					+ " StringBuffer is thread-safe while StringBuilder does not guarantee thread safety which means synchronized methods are present in StringBuffer making control of one thread access at a time while it is not seen in StringBuilder, hence thread-unsafe.");		
 		}
    }
 
    // Method 3
    // Concatenates to StringBuffer
    public static void concatStringBuffer()
    {
    	StringBuffer stringBuffer = new StringBuffer("Shradha");
    	StringBuffer stringBufferDuplidate;
    	
    	stringBufferDuplidate = stringBuffer;
		stringBuffer.append("Pimpudkar");
		if(stringBuffer == stringBufferDuplidate) {
			System.out.println("In this method, we pass a string “Shradha” and perform “stringBuffer.append(“Pimpudkar”)” which changes the actual value of the string to “ShradhaPimpudkar”. "
					+ "This is due to the simple fact that StringBuilder is mutable and hence changes its value.");	
		}
    }
 
    // Main driver method
    public static void main(String[] args)
    {
    	concatString();
    	concatStringBuilder();
    	concatStringBuffer();
    }
}