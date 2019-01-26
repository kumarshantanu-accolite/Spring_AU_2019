package com.au.assignment.designpattern;

public class HouseBuilder {
	
	 private HouseBuilder() {
		 
	 }
	  public static House buildHouse(HouseType type,Location location)
	  {
	    House house = null;
	   
	    switch(location)
	    {
	      case Kengeri:
	        house = KengeriHouseBuilder.buildHouse(type);
	        break;
	      case Marathahalli:
	        house = MarathahalliHouseBulider.buildHouse(type);
	        break;
	      case Mysore:
	        house = MysoreHouseBuilder.buildHouse(type);
	        break;
	    }
	  return house;
	  }

}
