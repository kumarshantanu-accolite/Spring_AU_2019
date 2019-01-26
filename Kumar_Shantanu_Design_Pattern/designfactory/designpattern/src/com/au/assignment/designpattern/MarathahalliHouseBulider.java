package com.au.assignment.designpattern;

public class MarathahalliHouseBulider {
	public static House buildHouse(HouseType model) {
		 House house = null;
		    switch (model)
		    {
		      case  Apartment:
		      house = new ApartmentHouse(Location.Marathahalli);
		      break;
		 
		      case Mansion:
		      house = new MansionHouse(Location.Marathahalli);
		      break;
		 
		      case Villa:
		      house = new VillaHouse(Location.Marathahalli);
		      break;
		 
		      default:
		      //throw some exception
		      break;
		    }
		    return house;
		  }
}
