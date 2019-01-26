package com.au.assignment.designpattern;

public class MainPart {
	public static void main(String[] args)
	  {
	    System.out.println(HouseBuilder.buildHouse(HouseType.Apartment,Location.Marathahalli));
	    System.out.println(HouseBuilder.buildHouse(HouseType.Villa,Location.Kengeri));
	    System.out.println(HouseBuilder.buildHouse(HouseType.Mansion,Location.Mysore));
	    System.out.println(HouseBuilder.buildHouse(HouseType.Mansion,Location.Marathahalli));
	    System.out.println(HouseBuilder.buildHouse(HouseType.Apartment,Location.Kengeri));
	    System.out.println(HouseBuilder.buildHouse(HouseType.Villa,Location.Mysore));
	    System.out.println(HouseBuilder.buildHouse(HouseType.Villa,Location.Marathahalli));
	    System.out.println(HouseBuilder.buildHouse(HouseType.Mansion,Location.Kengeri));
	    System.out.println(HouseBuilder.buildHouse(HouseType.Apartment,Location.Mysore));
	  }
}
