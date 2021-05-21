package com.linkedlistpocs;

import java.util.*;

public class LinkedListMainClass {
	public static void main(String[] args) {
		LinkedList<Employee> emp=new LinkedList<Employee>();
		
		// creating  address objects for the Employees
		Address address1 =new Address(11, "jagtial", "Telangana", 505529);
		Address address2 =new Address(12, "KNR", "Telangana", 440011);
		Address address3 =new Address(112, "Mumbai", "MH", 505555);
		Address address4 =new Address(14, "Chennai", "TM", 500);
		
		//Creating the employee objects
		emp.add(new Employee(101, "kumar", address1));
		emp.add(new Employee(102, "Rakesh", address2));
		emp.add(new Employee(103, "Raju", address3));
		emp.add(new Employee(104, "kiran", address4));
		
		System.out.println(emp);
		
		//Display all Employee objects
		for(Employee e: emp) {
			System.out.println(e.eid+" "+e.name+" "+" "+e.address.Hno+" "+e.address.city+
					" "+e.address.getPincode()+" "+e.address.state);
		}
		System.out.println("                    ");
		
		Iterator<Employee> itr=emp.iterator();
		while(itr.hasNext()) {
			Employee e=itr.next();
			System.out.println(e.eid+" "+e.name+" "+" "+e.address.Hno+" "+e.address.city+
					" "+e.address.getPincode()+" "+e.address.state);
		}
		System.out.println(emp.get(2).name+" Display single employee data");
	}

}
