package com.assign15;

import java.util.Scanner;

class Student 
{
	int studentId;
	String name;
	double examFee;
	public Student() {
		studentId=21053;
		name = "Afreed";
		examFee = 256.00;
	}
	public Student(int studentId,String name,double examFee)
	{
		this.studentId=studentId;
		this.name = name;
		this. examFee = examFee;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
}
class DayScholar extends Student {
	double transportFee;
	public  DayScholar()
	{
		super();
		this.transportFee=4255.6;
	}
	public  DayScholar(int studentId,String name,double examFee,double transportFee)
	{
		super(studentId,name,examFee);
		this.transportFee=transportFee;
	}
	
	public double payFee(int amount)
	{
		return transportFee += amount;
	}
	@Override
	public String toString() {
		return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}
	

}
	
class Hosteller extends Student {
	double hostelFee;
	public  Hosteller()
	{
		super();
		this.hostelFee=456.3;
	}
	public Hosteller(int studentId,String name,double examFee,double hostelFee)
	{
		super(studentId,name,examFee);
		this.hostelFee=hostelFee;
	}
	
	public double payFee(int amount)
	{
		return hostelFee -= amount;
	}
	@Override
	public String toString() {
		return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}
	
}

public class InheritanceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayScholar ds = new DayScholar(21075,"Harish",782.6,4552.8);
		DayScholar ds1 = new DayScholar();
         Hosteller h = new Hosteller(21053,"Afreed",782.4,4551.8);
         Hosteller h1 = new Hosteller();
		System.out.println(ds);
		System.out.println(ds1);
		System.out.println(h);
		System.out.println(h1);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your id: ");
//		int sid = sc.nextInt();
//		System.out.println("Enter name: ");
//		String name = sc.next();
//		System.out.println("Enter the examfee");
//		double fee = sc.nextDouble();
//		DayScholar ds = new DayScholar(sid,name,fee);
		System.out.println(ds.payFee(200));
		System.out.println(ds.toString());
	}
}
