package com.assign15;

public class Student {
	int studentId;
	String name;
	double examFee;
	
	public Student() {
		studentId = 0;
		name = null;
		examFee = 0.00;
	}
	
	public Student(int studentId, String name, double examFee) {
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}
	
	String displayDetails() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}

	double payFee(double amount) {
	
		return  examFee - amount;
		
	}
}
