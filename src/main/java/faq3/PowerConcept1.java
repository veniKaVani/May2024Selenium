package faq3;

public class PowerConcept1 {

	public static void main(String[] args) {
		/*
		 * Java program to find the power of a no??
		 * 3^4 = 81   base is 3 and exponent is 4
		 * 3X3x3x3 = result
		 * 
		 * Math.pow(base, exponent) --will give a double so the result is in num.0s
		 */
		
		int base =2;
		int exponent = 40;
		
//		long result=1;
//		
//		while(exponent!=0) {
//			result =result * base;
//			exponent--;
//		}
//       System.out.println(result);
       
       System.out.println(Math.pow(base, exponent));
	}

}
