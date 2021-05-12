package com.assign15;

public class InheritanceTester {

	public static void main(String[] args) {
		DayScholar ds = new DayScholar(405, "Afreed", 1200, 19000);
		
		System.out.println(ds.payFee(25000));
		System.out.println(ds.displayDetails());
	}

	

}
