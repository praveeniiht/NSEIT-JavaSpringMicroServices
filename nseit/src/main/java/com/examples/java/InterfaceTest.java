package com.examples.java;

interface OnlineShop {
	int rate=10;
	void selectGoods();

    void payment();

	void shipment();
	
	default void security() {
		System.out.println("OTP should be generted..");
	}
	static void registration() {
		System.out.println("Shop must be registered with govt ");
	}
	
}

class MyShop1 implements OnlineShop {

	public void selectGoods() {
		
		System.out.println(rate);
		System.out.println("Goods have to be selected manually");
	}

	public void payment() {
		System.out.println("Cash transaction only");
	}

	public void shipment() {
		System.out.println("Goods need to carry by customer only");
	}

	
}

class MyShop2 implements OnlineShop {

	public void selectGoods() {
		System.out.println("Goods can selected from www.onlineshop.com");
	}

	public void payment() {
		System.out.println("credit/debit card transaction only");
	}

	public void shipment() {
		System.out.println("Items will be shipped through blue dart");
	}
	
	public void security() {
		System.out.println("authenticate with grid card...");
	}

}

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OnlineShop.registration();
		
		MyShop1 shop1 = new MyShop1();
		shop1.selectGoods();
		shop1.payment();
		shop1.shipment();
		
		
		MyShop2 shop2 = new MyShop2();
		shop2.selectGoods();
		shop2.payment();
		shop2.shipment();
		shop2.security();
		

	}

}
