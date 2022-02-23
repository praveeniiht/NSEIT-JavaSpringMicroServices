package com.examples.java;


@FunctionalInterface
interface Maths{
	public int add(int a, int b);
	
}

@FunctionalInterface
interface Geometry1{
	public double calCircleArea(int radius);
	
}

@FunctionalInterface
interface Geometry2{
	public double calCircleArea(int radius);
	
}

@FunctionalInterface
interface GT extends Geometry1, Geometry2{
	public double calCircleArea(int radius);
}

class MathsImpl implements Maths{
	public int add(int a, int b){
		return a+b;
	}
}

/*
 *(a,b)->a+b; 
 */

public class FunctionalExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	MathsImpl m = new MathsImpl();
	//	System.out.println(m.add(10,30));
		
		Maths m = (a,b)->a+b;
		System.out.println(m.add(20, 40));
		
		//Geometry g1 = (radius)->3.14*radius*radius;
		
		//GeometryImpl g = new GeometryImpl();
		//System.out.println("The area of circle "+g1.calCircleArea(5));

	}

}
