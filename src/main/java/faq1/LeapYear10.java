package faq1;

public class LeapYear10 {

	public static void main(String[] args) {
		/*
		 * LEAP no: exactly divisible by 4 -- for all the century years which are ending with 00
		 * century year: is a leap year only if it is perfectly divisible by 400
		 * 
		 * 1900: is not leap year -- since not divisible by 4
		 * 2012: leap year
		 * --------VERY CONFUSING WITH FLOWER BRACES--NEED TO FIGURE OUT
		 */
		int year = 1900;
		boolean leap = false;
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					leap = true;
				}
				else {
					leap = false;
				}
				
			}
			
		}

	}

}
