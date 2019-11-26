package com.nikki.health.entities;

import javax.persistence.Entity;

@Entity
public class User extends AbstractEntity {

private String username;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
private String password;
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
private String age;	
private String gender;	
private String mailid;


public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getMailid() {
	return mailid;
}
public void setMailid(String mailid) {
	this.mailid = mailid;
}
	

}
