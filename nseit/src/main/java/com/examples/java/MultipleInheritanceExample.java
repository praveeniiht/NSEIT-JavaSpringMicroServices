package com.examples.java;
interface Test1{
	void t1();
	void t2();
}

interface Test2{
	void t3();
	void t4();
}
class Test4{
	public void t5() {
		System.out.println("Inside t5 method..");
	}
}

class Test5{
	public void t6() {
		System.out.println("Inside t6 method..");
	}
}



interface MultiInterface extends Test1, Test2{
	
}
class MultipleInheritance implements Test1, Test2{

	public void t3() {
		// TODO Auto-generated method stub
		
	}

	public void t4() {
		// TODO Auto-generated method stub
		
	}

	public void t1() {
		// TODO Auto-generated method stub
		
	}

	public void t2() {
		// TODO Auto-generated method stub
		
	}
	
}

public class MultipleInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
