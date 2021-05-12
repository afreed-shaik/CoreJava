package com.training;

public class BiggestTwoVar {

	public static void main(String[] args) {
		int firstvar = Integer.parseInt(args[0]);
		int secondvar = Integer.parseInt(args[1]);
		if(firstvar < secondvar) {
			firstvar = secondvar;
		}
		secondvar = Integer.parseInt(args[2]);
		if(firstvar < secondvar) {
			firstvar = secondvar;
		}
		secondvar = Integer.parseInt(args[3]);
		if(firstvar < secondvar) {
			firstvar = secondvar;
		}
		secondvar = Integer.parseInt(args[4]);
		System.out.println("Big Number is : " + firstvar);
	}

}
