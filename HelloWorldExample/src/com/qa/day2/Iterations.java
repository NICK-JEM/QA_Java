package com.qa.day2;
//import java.math.*;

public class Iterations {
	
	public void iterOne() {
		
		for(int i=0; i<10; i++) {
			System.out.println(i+1);
			for(int j=0; j<10; j++) {
				System.out.println(j+1);
			}
		}
	}
	//end of iterOne
	
	public void iterTwo() {
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			for(int j=0; j<=i; j++) {
				System.out.println(j);
			}
		}
	}
	//end of iterTwo
	
	double change;
	
	public void coins(double cost, int amount) {
		
		change = amount-cost;
		
		System.out.println("Your change will be: "+change+".");
		
		
		
			double tens = Math.floor(change/10);
			change -= tens*10;
			System.out.println(change);
			double fives = Math.floor(change/5);
			change -= fives*5;
			System.out.println(change);
			/*
			double twos = change - (change%2); 
			change -= twos;
			System.out.println(change);
			double ones = change - (change%1); 
			change -= ones;
			System.out.println(change);
			double fiftyPee = change*100 - (change%50); 
			change -= fiftyPee;
			System.out.println(change);
			double twentyPee = change - (change%20);
			change -= twentyPee;
			System.out.println(change);
			double tenPee = change - (change%10); 
			change -= tenPee;
			System.out.println(change);
			double fivePee = change - (change%5); 
			change -= fivePee;
			System.out.println(change);
			double twoPee = change - (change%2); 
			change -= twoPee;
			System.out.println(change);
			double onePee = change - (change%1); 
			change -= onePee;
			System.out.println(change);
			*/
			
			System.out.println("So you have: "+String.format("%.0f",(tens))+" £10 note(s).");
			System.out.println("You have: "+String.format("%.0f",(fives))+" £5 note(s).");
			
			/*System.out.println("You have: "+String.format("%.0f",(twos/2))+" £2 coin(s).");
			System.out.println("You have: "+String.format("%.0f",(ones/1))+" £1 coin(s).");
			System.out.println("You have: "+String.format("%.0f",(fiftyPee/50))+" 50p coin(s).");
			System.out.println("You have: "+String.format("%.0f",(twentyPee/20))+" 20p coin(s).");
			System.out.println("You have: "+String.format("%.0f",(tenPee/10))+" 10p coin(s).");
			System.out.println("You have: "+String.format("%.0f",(fivePee/5))+" 5p coin(s).");
			System.out.println("You have: "+String.format("%.0f",(twoPee/2))+" 2p coin(s).");
			System.out.println("You have: "+String.format("%.0f",(onePee/1))+" 1p coin(s).");
			*/
			
		
		
	}
}
