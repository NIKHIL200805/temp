package com.nikki.health.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity  // this annotation specifies the class and  map to the database table.
public class Food extends AbstractEntity{  // here we are extending the abstract class which is having the ID attribute.

//	private  User id;
	private  String mode; // it is an Attribute which is present in the table of cal in the data base.
	private  String fooditem;  // same of above attribute.
	private  String calforsingle; // same of above attribute.
	public String getCalforsingle() {      //  getting the data from database table in the form of string using this method which is a  constructor.
		return calforsingle;       
	}
	public void setCalforsingle(String calforsingle) {
		this.calforsingle = calforsingle;
	}
	public String getMode() { //  same of the above 
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getFooditem() {
		return fooditem;
	}
	public void setFooditem(String fooditem) {
		this.fooditem = fooditem;
	}
	
}
