package faq2;

public class Positive_NegativeNo1 {

	public static void main(String[] args) {
		/*
		 * Java program to find if the no is positive or negative??
		 * using a double no: so it handles both +ve & -ve and int as well
		 * ==> the container of a double is big enough to hold both the
		 * +vedouble,-vedouble and int datatype
		 * 0 is not +ve, -ve
		 */
		double number = 12.33;
		
		if(number<0.0) {
			System.out.println(number+" is negative number");
		}
		else if(number>0.0) {
			System.out.println(number+" is positive number");
		}else {
			System.out.println(number+"is zero");
		}
		

	}

}
