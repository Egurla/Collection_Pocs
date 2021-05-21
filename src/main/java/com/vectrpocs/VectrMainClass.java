package com.vectrpocs;

import java.util.Enumeration;
import java.util.Vector;

import com.linkedlistpocs.Address;
import com.linkedlistpocs.Employee;

public class VectrMainClass {

	public static void main(String[] args) {
		Vector<Employee> v = new Vector<Employee>();

		Address address1 = new Address(11, "jagtial", "Telangana", 505529);
		Address address2 = new Address(12, "KNR", "Telangana", 440011);
		Address address3 = new Address(112, "Mumbai", "MH", 505555);
		Address address4 = new Address(14, "Chennai", "TM", 500);

		// Creating the employee objects
		v.add(new Employee(101, "kumar", address1));
		v.add(new Employee(102, "Rakesh", address2));
		v.add(new Employee(103, "Raju", address3));
		v.add(new Employee(104, "kiran", address4));

		// Get Enumeration of Vector elements 
		Enumeration<Employee> en = v.elements();
		/*
		 * Display Vector elements using hashMoreElements() and nextElement() methods.
		 */
		System.out.println("Vector elements are: ");
		while (en.hasMoreElements()) {
			
			  Employee e = (Employee) en.nextElement();
			  System.out.println(e.getEid()+" "+e.getName()+" "+e.getAddress().getCity()+" "+
			                              e.getAddress().getHno()+" "+e.getAddress().getState()+" "+e.getAddress().getPincode());
			 
		}
		System.out.println(v.get(3).getEid()+" "+v.get(3).getName()+" Display single Emplyee data using index");
	}
}
