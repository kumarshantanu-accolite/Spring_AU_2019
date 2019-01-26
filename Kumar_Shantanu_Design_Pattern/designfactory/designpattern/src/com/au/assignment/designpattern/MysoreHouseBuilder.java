package com.au.assignment.designpattern;

public class MysoreHouseBuilder {
	 public static House buildHouse(HouseType model) {
	 House house = null;
	    switch (model)
	    {
	      case  Apartment:
	      house = new ApartmentHouse(Location.Mysore);
	      break;
	 
	      case Mansion:
	      house = new MansionHouse(Location.Mysore);
	      break;
	 
	      case Villa:
	      house = new VillaHouse(Location.Mysore);
	      break;
	 
	      default:
	      //throw some exception
	      break;
	    }
	    return house;
	  }


}
