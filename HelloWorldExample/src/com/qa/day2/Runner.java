package com.qa.day2;

public class Runner {
	
	public static void main(String[] args) {
		
		//Flowchart flow = new Flowchart();
		
		/*
		System.out.println(flow.method1(3, 6, true)); //expected 9
		System.out.println(flow.method1(3, 6, false));//expected 18
		*/
		
		//test individually
		
		//flow.method2(7000);//Expected AC;
		//flow.method2(6000);//Expected ABD;
		//flow.method2(5000);//Expected ABD;
		//flow.method2(4000);//Expected ABE;
		//flow.method2(3500);//Expected ABE;
		//flow.method2(2000);//Expected 135;
		//flow.method2(600);//Expected 1346;
		//flow.method2(500);//Expected 1347;
		//flow.method2(100);//Expected 12;
		//flow.method2(10);//Expected 12;
		
		//-----------------------------------------------------//
		
		/*
		System.out.println(flow.blackjack(22, 24)); //expect 0
		System.out.println(flow.blackjack(21, 21)); //expect 808
		System.out.println(flow.blackjack(19, 18)); //expect 19
		System.out.println(flow.blackjack(12, 20)); //expect 20
		*/
		
		//--------------------------------------------------------//
		
		/*
		System.out.println(flow.sumUnique(3,6,9)); //expect 18
		System.out.println(flow.sumUnique(3,3,9)); //expect 9
		System.out.println(flow.sumUnique(3,9,9)); //expect 3
		System.out.println(flow.sumUnique(3,6,3)); //expect 6
		System.out.println(flow.sumUnique(3,3,3)); //expect 0
		*/
		
		//-------------------------------------------------------//
		
		//Taxes taxCalc = new Taxes();
		
		/*
		taxCalc.exactTax(47000); //expect 25%
		taxCalc.exactTax(45000); //expect 25%
		taxCalc.exactTax(44999); //expect 20%
		taxCalc.exactTax(31000); //expect 20%
		taxCalc.exactTax(30000); //expect 20%
		taxCalc.exactTax(29999); //expect 15%
		taxCalc.exactTax(21000); //expect 15%
		taxCalc.exactTax(20000); //expect 15%
		taxCalc.exactTax(19999); //expect 10%
		taxCalc.exactTax(16000); //expect 10%
		taxCalc.exactTax(15000); //expect 10%
		taxCalc.exactTax(14999); //expect 0%
		taxCalc.exactTax(399); //expect 0%
		*/
		
		//----------------------------------------------------//
		
		/*
		System.out.println(flow.FizzBuzz(15)); //expect FizzBuzz
		System.out.println(flow.FizzBuzz(10)); //expect Buzz
		System.out.println(flow.FizzBuzz(33)); //expect Fizz
		System.out.println(flow.FizzBuzz(8)); //expect "8 is not a multiple of 3 or 5"
		*/
		
		//flow.Aloop(); //expect 100 "A". uncomment second println (in Flowchart.Aloop) for count
		//flow.modLoop(); //expect alternating "-" and "*"
		
		//-----------------------------------------------------//
		
		Iterations iter = new Iterations();
		
		//iter.iterOne(); //expect 1 to 10, 10 times
		//iter.iterTwo(); //does not work as expected. prints
		
		iter.coins(7.80, 37); //is not in iteration yet. ensuring correct function before that (UNFINISHED)
	}
	

}
