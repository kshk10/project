package com.methodPackage;

public class SwappingWithoutExtraVariable {
	int x, y;

	public SwappingWithoutExtraVariable(int x, int y) {
		x = x + y;
		this.y = x - y;
		this.x = x - this.y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwappingWithoutExtraVariable swap = new SwappingWithoutExtraVariable(10, 20);
		System.out.println(swap.x + " , " + swap.y);
	}
}