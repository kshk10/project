package com.constructorPackage;

public class MobileSpecifications {
	String brandName;
	char model;
	int price;
	float screenSize;
	int ram;
	String processor;
	int memory;
	int camera;
	long mobileNumber;

	public MobileSpecifications() {
	}

	public MobileSpecifications(String brandName1, char model1, int price1, float screenSize1, int ram1,
			String processor1, int memory1, int camera1) {
		this.brandName = brandName1;
		this.model = model1;
		this.price = price1;
		this.screenSize = screenSize1;
		this.ram = ram1;
		this.processor = processor1;
		this.memory = memory1;
		this.camera = camera1;
	}

	public void makeCall(long mobileNumber) {
		System.out.println("Calling the Number");
	}

	public static void main(String[] args) {
		MobileSpecifications mobile1 = new MobileSpecifications("Nokia", 'A', 15000, 6.609f, 4, "Qualcomm", 8, 50);
		System.out.println(mobile1.brandName);
		System.out.println(mobile1.model);
		mobile1.makeCall(987654321);
		MobileSpecifications mobile2 = new MobileSpecifications();
		System.out.println(mobile2.ram);
		System.out.println(mobile2.memory);
	}
}