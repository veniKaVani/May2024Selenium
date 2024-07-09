package faq2;

public class ReverseANo9a {

	public static void main(String[] args) {
		//Java program to reverse a no??
		
		int num = 1234;
		int rev = 0;
		
		while(num!=0) {
			int n = num%10;
			rev = rev*10 + n;
			num = num/10;//123
			
		}
		System.out.println("rev no is:"+ rev);
	}

}
