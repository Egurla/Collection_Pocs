package com.setpos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest
{
	public static void main(String[] args) {
	
		Set<Product> set=new HashSet<Product>();
		
		//add duplicate eliments in product data
		Product p1=new Product(1111,"Biscuits");
		Product p2=new Product(1112,"Cakes");
		Product p3=new Product(1333,"Chips");
		Product p4=new Product(44331,"seeds");
		Product p5=new Product(1333,"aaaa");
		Product p6=new Product(1122,"santhor");
		Product p7=new Product(1111,"Biscuits");
		
		set.add(p1);
		set.add(p7);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.add(p6);
		
		Iterator<Product> itr=set.iterator();
		
		while(itr.hasNext()) {
			Product pobj=itr.next();
			System.out.println(pobj.pId+" "+pobj.pName);
			
			
			
		}
		
		
	}

}
