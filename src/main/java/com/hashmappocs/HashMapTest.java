package com.hashmappocs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
public static void main(String[] args) {
	
	//keys
	Student s1 = new Student(1, "Rakesh"); 
	  
    Student s2 = new Student(2, "kumar"); 
    Student s3 = new Student(3, "Raju");
    Student s4 = new Student(4, "kiran");
    Student s5 = new Student(5, "deva");
    Student s6 = new Student(2, "kumar");

    HashMap<Student, String> map=new HashMap<Student, String>();
    // put keys in map
    map.put(s1, s1.getname());
    map.put(s2, s2.getname());
    map.put(s3, s3.getname());
    map.put(s4, s4.getname());
    map.put(s5, s5.getname());
    map.put(s6, s6.getname());

    
    System.out.println(map.get(s2));

    
    System.out.println(map.get(s3));

    System.out.println(map.get(s4));
    
    System.out.println("------------------------");
    
    System.out.println(map);
    Set<Student> itr=map.keySet();
    for (Student student : itr) {
		System.out.println(student.getname());
	}
    
    System.out.println("using entrySet ");
    for (Map.Entry<Student, String> entry : map.entrySet()) {
        System.out.println("Key : " + entry.getKey().getmarks()+","+entry.getKey().getname() + " value : " + entry.getValue());
      }
    System.out.println("---------------------");
    
    
    // using java 8 to iterate
    map.entrySet().stream().forEach(e ->
    System.out.println("Key : " + e.getKey().getmarks() + " value : " + e.getValue())
);
}

}

