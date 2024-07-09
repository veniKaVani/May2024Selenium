package faq2;

public class FactOfNumUsingWhile4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num  = 6;
		getFact(num);

	}
	public static void getFact(int num) {
		int fact = 1;
		
		int i=1;
		while( i<=num) {
			fact = fact * i;
		}
		System.out.println("fact of num"+fact);
		
		
	}

}
