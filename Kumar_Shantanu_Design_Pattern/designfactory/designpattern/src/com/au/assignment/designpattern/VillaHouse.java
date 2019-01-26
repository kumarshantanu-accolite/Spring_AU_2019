package com.au.assignment.designpattern;

public class VillaHouse extends House {
	 public VillaHouse(Location location)
	  {
	    super(HouseType.Mansion, location);
	    construct();
	  }
	 
	  @Override
	  protected void construct() {
	    System.out.println("Building Villa");
	    //add accessories
	  }
}
