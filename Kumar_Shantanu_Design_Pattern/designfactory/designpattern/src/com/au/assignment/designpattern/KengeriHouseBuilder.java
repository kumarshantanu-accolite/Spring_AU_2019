package com.au.assignment.designpattern;

public class KengeriHouseBuilder {
	 public static House buildHouse(HouseType model)
	  {
	    House house = null;
	    switch (model)
	    {
	      case  Apartment:
	      house = new ApartmentHouse(Location.Kengeri);
	      break;
	 
	      case Mansion:
	      house = new MansionHouse(Location.Kengeri);
	      break;
	 
	      case Villa:
	      house = new VillaHouse(Location.Kengeri);
	      break;
	 
	      default:
	      //throw some exception
	      break;
	    }
	    return house;
	  }
}
