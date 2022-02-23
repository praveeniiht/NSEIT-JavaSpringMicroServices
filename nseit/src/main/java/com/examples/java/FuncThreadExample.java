package com.examples.java;
class Even{
	public boolean isEven(int n){
		if(n%2==0)
			return true;
		else
			return false;
	}
}

// n->n%2==0;
public class FuncThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = ()->System.out.println("Inside the thread...");
		Thread t1 = new Thread(r);
		t1.start();
		Even e = new Even();
		System.out.println(e.isEven(11));

	}

}
