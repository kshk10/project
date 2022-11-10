package com.flipkart;

public class FlipkartManagement {

public static void main(String[] args) {
	AxisPayment axisPayment = new AxisPayment();
	axisPayment.returnAmount();
	axisPayment.payForOrder();
	
	
	Payment hdfcPayment = new HdfcPayment();
	hdfcPayment.returnAmount();
	hdfcPayment.payForOrder();
}
	}