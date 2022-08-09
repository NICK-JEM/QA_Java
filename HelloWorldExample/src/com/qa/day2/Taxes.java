package com.qa.day2;

public class Taxes {
	
	double taxPer;
	double taxed;
	int salary;
	
	public double taxPercent(int a) {
		
		salary = a;
		
		if(a>=45000) {
			taxPer = 0.25;
		} else if(a<45000 && a>=30000) {
			taxPer = 0.20;
		} else if(a<30000 && a>=20000) {
			taxPer = 0.15;
		} else if(a<20000 && a>=15000) {
			taxPer = 0.10;
		} else if(a<15000) {
			taxPer = 0.00;
		}
		
		return taxPer;
	}
	
	public void exactTax(int a) {
		
		taxPercent(a);
		
		taxed = salary*taxPer;
		
		System.out.println("Your Salary is: "+salary+" \nso your tax percentage is: " + (taxPer*100) + ". \nThis means you will pay: "+taxed+" pounds.");
	}
}
