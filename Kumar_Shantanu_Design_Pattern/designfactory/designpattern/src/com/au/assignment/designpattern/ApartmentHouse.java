package com.au.assignment.designpattern;

public class ApartmentHouse extends House {
	 public ApartmentHouse(Location location)
	  {
	    super(HouseType.Apartment, location);
	    construct();
	  }
	 
	  @Override
	  protected void construct() {
	    System.out.println("Building Apartment");
	    
	  }
}
