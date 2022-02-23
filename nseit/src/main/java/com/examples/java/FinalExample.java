package com.examples.java;

class Base{
	int a=100;
	Base(){
		a=100;
	}
	public void showDetails() {
		System.out.println("A = "+a);
	}
}

class Derived extends Base {
	int b;
	Derived(){
		b=200;
	}
	public void showDetail() {
		System.out.println("A = "+a+" B = "+b);
	}
}

public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived d = new Derived();
		d.showDetails();
		
	}

}
