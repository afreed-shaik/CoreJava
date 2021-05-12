package com.assign15;

public class DayScholar extends Student {
	double transportFee;
	
	public DayScholar() {
		transportFee = 0.00;
	}

	public DayScholar(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		this.transportFee = transportFee;
	}

	@Override
	public String displayDetails() {
		return "DayScholar [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "transportFee=" + transportFee + "]";
	}

	double payFee(double amount) {
		return examFee - amount + transportFee;
		
	}
	
}
