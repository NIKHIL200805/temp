package com.nikki.health.entities; // this is a  entities package of model class.

import javax.persistence.Entity;

@Entity // this annotation specifies the class and  map to the database table
public class Cal extends AbstractEntity{  // here we are extending the abstract class which is having the ID attribute.


private String fooditem; // it is an Attribute which is present in the table of cal in the data base.
private String totalcal; // same of above attribute. 

public String getTotalcal() {
	return totalcal;  //  getting the data from database table in the form of string using this method which is a  constructor. 
}
public void setTotalcal(String totalcal) {
	this.totalcal = totalcal;
}
public String getNitems() {
	return nitems;
}
public void setNitems(String nitems) {
	this.nitems = nitems;
}
private String nitems; // it is also a attribute which  is present in the database table
public String getFooditem() {
	return fooditem;
}
public void setFooditem(String fooditem) {
	this.fooditem = fooditem;
}
	
	
}
