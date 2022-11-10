package com.flipkart;

public interface Payment {
	public abstract void payForOrder();
	void returnAmount();
}