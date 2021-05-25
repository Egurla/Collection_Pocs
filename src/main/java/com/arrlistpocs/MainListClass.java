package com.arrlistpocs;


import java.util.*;
import java.util.Map.Entry;

public class MainListClass {

	public static void main(String[] args) {
	
		List<Student> studentObj=new ArrayList<Student>();
		
		Student student1=new Student(101,"Mahu","ECE");
		Student student2=new Student(101,"Mahu","ECE");
		Student student3=new Student(103,"sitara","IT");
		Student student4=new Student(104,"rakesh","EEE");
		Student student5=new Student(105,"mahesh","CSC");
		
		//add Student objects in the ArrayList
		studentObj.add(student1);
		studentObj.add(student2);
		studentObj.add(student3);
		studentObj.add(student4);
		studentObj.add(student5);
		
		//Display all student data 
		for(Student s:studentObj) {
			System.out.println(s.getName()+" "+s.getSid()+" "+s.getSbranch());
		}
		//using index to get the data
		System.out.println(studentObj.indexOf(student2.getName()));
		System.out.println(studentObj.get(3).name+"---->getting the data from student");
		
		//Display all student data with itetator
		Iterator<Student> itr=studentObj.iterator();
		while(itr.hasNext()) {
			Student s=itr.next();
			System.out.println(s.name+" "+s.Sbranch+" "+s.Sid);
		}
		//Usining ListIterator
		ListIterator<Student> litr=studentObj.listIterator();
		
		//Display all student data forword direction
		while(litr.hasNext()) {
			Student s1=litr.next();
			System.out.println(s1.name+" "+s1.Sbranch+" "+s1.Sid);
		}
		//Display student data backowrd direction with using previous() method
		while (litr.hasPrevious()) {
			Student s2=litr.previous();
			System.out.println(s2.name+" "+s2.Sbranch+"--- "+s2.Sid);
			
		}
		
		
		 // Creating a hash set using constructor
        Set<Student> hSet = new HashSet<Student>(studentObj);
  
        System.out.println("Created HashSet is");
        for (Student s: hSet)
        {
        	System.out.println(s.name+"-"+s.Sid+"-"+s.Sbranch);
        }
		
		
        //converting List to Map type
        
        Map<Integer, String> map1 = new HashMap<>();
     // put every value list to Map
        for (Student st : studentObj) {
            map1.put(st.getSid(), st.getName());
        	
        }
        System.out.println(" converting LIst to MAp");
        Set<Entry<Integer, String>> set=map1.entrySet();
        for(Entry<Integer, String> s: set) {
        	Integer st=s.getKey();
        	System.out.println(st+" "+s.getValue());
        }
	}
}
