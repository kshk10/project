package com.flipkart;

public class AxisPayment extends FlipkartManagement {

	@Override
	public void returnAmount() {
		System.out.println("Axis return amount");
	}

	@Override
	public void payForOrder() {
		System.out.println("Payment for Order");
	}

	@Override
	public void payForOrder(int value) {
		System.out.println("Axis payment for order");
	}
}