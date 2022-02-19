package com.chandu.designPatterns.factory;

public class Sedan extends Car {

	Sedan() {
	        super(CarType.SEDAN);
	        construct();
	    }

	@Override
	protected void construct() {
		// TODO Auto-generated method stub
		System.out.println("I am sedan car implementation");
	}

}
