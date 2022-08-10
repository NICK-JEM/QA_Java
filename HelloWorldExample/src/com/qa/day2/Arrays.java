package com.qa.day2;

//use with Main.java

public class Arrays {
	
	public void arr1() {
	
		int[] arrayOne = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
	
		for(int a : arrayOne) {
			System.out.print(a+" ");
		}
		
	}
	//end of arr1
	
	public void arr2() {
		int[] arrayTwo = new int[5];
		int num = 4;
		
		for(int i = 0; i<arrayTwo.length; i++) {
			num++;
			arrayTwo[i] = num;
			System.out.print(arrayTwo[i]+" ");
			for(int j : arrayTwo) {
				arrayTwo[i] *= 10;
				System.out.print(arrayTwo[i]+" ");
			}
		}
	}
	//end of arr2
	
	public int[] numbers(int num1) {
		
		int[] nums = new int[2];
		
		if(num1>=10 && num1<=99) {
			
			int one = num1%10; 
			int two= (num1-(num1%10))/10;
			int numAdd = one+two;
			nums[0] = one;
			nums[1] = two;
			
			System.out.println(numAdd);
		}
		return nums;
		
	}
	//end of numbers

	public String numString(int b) {
		
		int[] numb = {((b-(b%10))/10), (b%10)};
		String out;
		//System.out.println(numb[1]); testing numbers are correct
		
		int[] onesArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] teensArray = {11, 12, 13, 14, 15, 16, 17, 18, 19};
		int[] tensArray = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		
		String[] strArray = new String[4];
		
		strArray[0] = " ";
		strArray[1] = " ";
		strArray[2] = " ";
		strArray[3] = " ";
		
		String[] wordOnes = {"one","two","three", "four", "five", "six", "seven", "eight", "nine"};
		String[] wordTeens = {"eleven","twelve","thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String[] wordTens = {"ten","twenty","thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		
			for(int i = 0; i<onesArray.length; i++) {
				
				if(b == teensArray[i]) {
					
					int ten = (numb[0]*10);
					int one = numb[1];
					
					if(ten+one == teensArray[i]) {
						strArray[3] = wordTeens[i];
						
						System.out.println(strArray[3]);
					}
						
				 } else if(b == onesArray[i]) {
					
					 if(numb[1] == onesArray[i]) {
						 strArray[0] = "";
						 strArray[1] = "";
						 strArray[2] = "";
						 strArray[3] = wordOnes[i];			
					 }
				 } else if(b == tensArray[i]) {
					
					 if(numb[0] == onesArray[i]){
						 strArray[0] = "";
						 strArray[1] = "";
						 strArray[2] = "";
						 strArray[3] = wordTens[i];
					}
				 }	else if((b>20 && b<=99)&&(b%10 != 0)) {
					 
					 strArray[0] = " ";
					 strArray[1] = " ";
					 
					 if((numb[0]*10 == tensArray[i]) &&(numb[1] == onesArray[i])) {
						 strArray[2] = wordTens[i];
						 strArray[3] = wordOnes[i];
					 }
					 
				 } else {
					 strArray[0] = "Not an approved number";
					 strArray[1] = "";
					 strArray[2] = "";
					 strArray[3] = "";
				 }
			}	
			out = strArray[0]+ " " + strArray[1] + " " + strArray[2] + " " + strArray[3];
			return out;
	}
}

