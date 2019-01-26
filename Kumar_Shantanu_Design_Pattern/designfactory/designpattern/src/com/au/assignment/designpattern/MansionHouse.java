package com.au.assignment.designpattern;

public class MansionHouse extends House {
	 public MansionHouse(Location location)
	  {
	    super(HouseType.Mansion, location);
	    construct();
	  }
	 
	  @Override
	  protected void construct() {
	    System.out.println("Building Mansion");
	    
	  }
}
