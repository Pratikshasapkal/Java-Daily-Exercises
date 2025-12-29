package com.tka.dec24;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Student s1 = new Student();
        
        Student s2 = new Student(5);
        System.out.println(s2.roll);
        
        Student s3 = new Student(1, "Pratiksha", 95);
        System.out.println(s3.roll);
        System.out.println(s3.name);
        System.out.println(s3.marks);
        
        Student s4 = new Student(s3);
	
	}

}