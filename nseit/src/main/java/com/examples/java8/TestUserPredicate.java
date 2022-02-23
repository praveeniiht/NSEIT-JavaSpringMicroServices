package com.examples.java8;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
	String username;
	String password;
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
}

public class TestUserPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Predicate<User> u = 
		usr-> usr.username.equals("admin") && usr.password.equals("admin");
		
		System.out.println("enter user name");
		String uname = sc.next();
		System.out.println("enter password");
		String passwd = sc.next();
		User user = new User(uname,passwd);
		if(u.test(user))
			System.out.println("Valid user");
		else
			System.out.println("Invalid user");
		

	}

}
