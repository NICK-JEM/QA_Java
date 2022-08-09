package com.qa.day2;

public class Temperature {
	
	public String outPut;
	
	public String weather(int temp) {
		
		if(temp>24 && temp>=30){
			outPut = "It's "+ temp + " Degrees? SO HOT!";
		} else if(temp<24){
			outPut =  "It's "+ temp + " Degrees? brrrr!";
			if(temp<24 && temp <= 0) {
				outPut = "It's "+ temp + " Degrees? SO COLD!";
			} 
		} else {
			outPut = "It's "+ temp + " Degrees? meh, this is fine.";
		}
		
		return outPut;
	}

}
