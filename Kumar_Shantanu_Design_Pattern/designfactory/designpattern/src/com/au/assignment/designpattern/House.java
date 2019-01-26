package com.au.assignment.designpattern;

public abstract class House {
	public House(HouseType style, Location location){
	    this.style = style;
	    this.location = location;
	  }
	 
	  protected abstract void construct();
	 
	  private HouseType style = null;
	  private Location location = null;
	 
	  //getters and setters
	 
	  @Override
	  public String toString() {
	    return "Style- "+style + " built in "+location;
	  }

}
