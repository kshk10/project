package com.flipkart;

public abstract class FlipkartPayment implements Payment {
	private String property;

	@Override
	public void payForOrder() {
		// TODO Auto-generated method stub
		System.out.println("Flipkart Payment for Order");

	}

	@Override
	public abstract void returnAmount();
}