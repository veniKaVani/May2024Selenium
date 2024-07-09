package faq2;

public class NoOfDigits8a {

	public static void main(String[] args) {
		//Java program to find the no. of digits of a number??
		
		//1234 --4
		//123 --3
		
		long num = 908591636;
		int count = 0;
		
		while(num!=0) {
			num=num/10;//1234 123 12 1 
			count++;
		}
       System.out.println("no.of digits: " +count);
	}

}
