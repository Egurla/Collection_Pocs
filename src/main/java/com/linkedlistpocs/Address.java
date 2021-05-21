package com.linkedlistpocs;

public class Address {
 int Hno;
 String city;
 String state;
 int pincode;
public int getHno() {
	return Hno;
}
public void setHno(int hno) {
	Hno = hno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Address(int hno, String city, String state, int pincode) {
	super();
	Hno = hno;
	this.city = city;
	this.state = state;
	this.pincode = pincode;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
 
 
 
}
