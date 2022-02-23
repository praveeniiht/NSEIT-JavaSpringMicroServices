package com.examples.java8;

import java.util.Scanner;
import java.util.function.Function;

class Student{
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	};
	
}

public class StudentFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		Function<Student,String> f= s->{
			String result=null;
			if(s.marks>=80)
				result="Distinction";
			else if(s.marks>=60 && s.marks <80)
				result="First Class";
			else if(s.marks>=50 && s.marks < 60)
				result = "Second class";
			else
				result ="Fail";
			return result;
		};
		System.out.println("Enter name ");
		String name = sc.next();
		System.out.println("Enter marks");
		int marks = sc.nextInt();
		Student s = new Student(name,marks);
		String result = f.apply(s);
		System.out.println("The Result is : "+result);
	}

}
