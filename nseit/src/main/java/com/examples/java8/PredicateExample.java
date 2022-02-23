package com.examples.java8;

import java.util.function.Predicate;

public class PredicateExample {
	
	public static void main(String args[]) {
		
		Predicate<String> p4 = str->str.length()>=5;
		Predicate<Integer> p1 = n->n%2==0;
		Predicate<Integer> p2 = n->n>100;
		Predicate<Integer> p3 = n->
		{
			boolean isPrime=true;
			for(int i=2;i<n-1;i++) {
				if(n%i==0) {
					isPrime=false;
					break;
				}
			}
			return isPrime;
		};
		//p1.and(p3).test(10);
		System.out.println("Even:"+p1.test(10));
		System.out.println("Even:"+p1.test(9));
		System.out.println("Greater than 100:"+p2.test(10));
		System.out.println("Prime: "+p3.test(15));
		System.out.println("String length >5:"+p4.test("kumar"));
		
		System.out.println(">100 and even: "+p1.and(p2).test(24));
		System.out.println(">100 and even: "+p1.or(p2).test(24));
	   System.out.println("Odd Number: "+p1.negate().test(11));
	
	   
	}

}
