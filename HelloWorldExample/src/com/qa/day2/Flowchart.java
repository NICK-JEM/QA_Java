package com.qa.day2;

public class Flowchart {
	
	public int method1(int a, int b, boolean c) {
		if(c == true) {
			return a+b;
		} else {
			return a*b;
		}
	}
	//end of method1
	
	String out;
	
	public void method2(int A) {
		
		
		if(A>2000) {
			System.out.println("A");
			
			if(A>2000 & A>6000) {
				System.out.println("C");
			} else if(A>2000 & A<=6000) {
				System.out.println("B");			
				
				if(A>2000 & A>4000) {
					System.out.println("D");
				} else if(A>2000 & A<=4000) {
					System.out.println("E");
				}
				
			}
				
		} else {
			System.out.println("1");
			
			if(A>100) {
				System.out.println("3");
				if(A>100 & A>600) {
					System.out.println("5");
				} else if(A>100 & A<=600) {
					System.out.println("4"); 
				    if(A>100 & A>500) {
						System.out.println("6");
					} else if(A>100 & A<=500) {
						System.out.println("7");
					}
				}
					
			} else if(A<=100) {
				System.out.println("2");
			} 
					
		} 
	}
	//end of method2
	
	public int blackjack(int a, int b) {
		int result;
		int draw = 808;
		
		if(a>21 & b>21) {
			result = 0;
		} else if(a==21 & b==21) {
			result = draw;
		} else if(a>b) {
			result = a;
		} else {
			result = b;
		}
		
		return result;
		
	}
	//end of blackjack
	int sum;
	
	public int sumUnique(int a, int b, int c) {
		
		if((a != b) & (b != c) & (c != a)){
			sum = a+b+c;
		} else if(a == b) {
			sum = c;
		} else if(a == c) {
			sum = b;
		} else if(b == c) {
			sum = a;
		}
		
		return sum;
		
	}
	//end of sumUnique
	
	String fizzBuzz;
	
	public String FizzBuzz(int a) {
		
		int number = a;		
		
		if(a%3==0 & a%5==0) {
			fizzBuzz = "FizzBuzz";
		}else if(a%3 == 0) {
			fizzBuzz = "Fizz";
		} else if(a%5 == 0) {
			fizzBuzz = "Buzz";
		} else {
			fizzBuzz = number+" is not a multiple of 3 or 5";
		}
		
		return fizzBuzz;
		
	}
	//end of fizzbuzz
	
	public void Aloop() {
		
		for(int A = 100; A <= 200; A++) {
			System.out.println("A"); 
			//System.out.println(A);
		}
	}
	//end of Aloop
	
	public void modLoop() {
		
		for(int A = 100; A <= 200; A++) {
			if(A%2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}
	
	
	
}
	
