package com.examples.java;

class Temp{
	String name;
	String dept;
	static String org;
	
	public Temp(String name, String dept) {
	System.out.println("Inside the constructor...");
		this.name = name;
		this.dept = dept;
	
	}

	public void showData() {
		System.out.println("Name: "+name+" "+"dept: "+dept+" "+"org: "+org);
	}
	public static void showDetails() {
		System.out.println("org:"+org);
	}
	
	static{
		System.out.println("Inside the static block...");
	}
	{
		System.out.println("Inside the non static block...");
	}
}

public class StaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp.org="NSEI Technolgies Ltd";
		Temp t1 = new Temp("Kumar","IT");
		Temp t2 = new Temp("Pavan","QA");
		Temp t3 = new Temp("sunil","finance");
		t1.showData();
		t2.showData();
		t3.showData();
		t2.org="NSEIT";
		t1.showData();
		t2.showData();
		t3.showData();
		Temp.showDetails();
	}

}
