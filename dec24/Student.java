package com.tka.dec24;

public class Student {

	int roll;
	String name;
	int marks;
	
	
	//CopyConstructor
	Student(Student s){
		System.out.println("This is a copy constructor");
		 roll = s.roll;
		 name = s.name;
		 marks = s.marks;
	}
	
	
	//Constructor1
	Student(int r, String n, int m){
		System.out.println("This is a Consturctor 1");
		roll = r;
		name = n;
		marks = m;
	}
	
	//Constructor2
	Student(int r){
		
		System.out.println("This is a Consturctor 2");
		roll = r;
	}
	
	//Constructor3
	Student(){
		System.out.println("This is Constructor 3");
	}
	
	//Constructor4
	Student(Person obj){
		
		roll = obj.roll;
		name = obj.name;
	}
}
