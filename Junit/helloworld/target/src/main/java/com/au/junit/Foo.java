package com.au.junit;


public class Foo {
	
	public String foobar(int i) throws IllegalArgumentException {
		if(i==0)
			throw new  IllegalArgumentException("Exception");
	else if(i%6==0)
			return"Bar";
		else if(i%2==0)
			return "Foo";
		else if(i%3==0)
			return "public";
		else
			return null;
			
		
	}
	
		
}
