package faq3;

public class PalindromeNum2a {

	public static void main(String[] args) {
		//Java program to find if the no given is palindrome or not??
		
		/*
		 * Palindrome Num: the reverse of the no is same as the no itself
		 * eg: 121,1331 is a palindrome num
		 * 
		 */
		
		int num = 1331;
		int rev = 0;
		
		int actualNum = num;
		
		while(num!=0) {
			int n = num%10;
			rev = rev*10 + n;
			num = num/10;
		}
		System.out.println(rev);
		
		if(actualNum == rev) {
			System.out.println(actualNum +" is a palindrome");
		}else {
			System.out.println(actualNum + " is not a palindrome");
		}

	}

}
