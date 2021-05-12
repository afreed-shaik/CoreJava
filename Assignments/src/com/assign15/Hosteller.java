package com.assign15;

public class Hosteller extends Student {
	double hostelFee;
	public Hosteller() {
		// TODO Auto-generated constructor stub
		hostelFee = 0.00d;
	}

	public Hosteller(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);
		// TODO Auto-generated constructor stub
		this.hostelFee = hostelFee;
	}
	public String displayDetails() {
		return "Hosteller [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "hostelFee=" + hostelFee + "]";
	}

	double payFee(double amount) {
		return examFee - amount + hostelFee;
		
	}
}
