package faq3;

public class ArmstrongNum5a {

	public static void main(String[] args) {
		/*
		 * ARMSTRONG NUM: Armstrong number is the number in any given number base, which forms the 
		 * total of the same number, when each of its digits is raised to the power of the number 
		 * of digits in the number.
		 * eg: 153 ==>1*1*1 + 5*5*5 +3*3*3 = 153
		 * 371 ==> 3*3*3 + 7*7*7 + 1*1*1 = 27+343+1 = 371
		 * 
		 */
		int num = 371;
		int actualNum = num;
		double result = 0;
		
		while(actualNum!=0) {
			
			int n = actualNum % 10;
		    result = result + Math.pow(n, 3);
		    
		    actualNum = actualNum/10;
			
		}
        System.out.println(result);
        if(result == num) {
        	System.out.println(num + " is an armstrong number");
        }else {
        	System.out.println(num + " is not an armstrong number");
        }
	}

}
