package faq3;

public class PrimeNum3a {

	public static void main(String[] args) {
		/*
		 * 1 is not the prime num
		 * Prime Num: is divisible by 1 and itself
		 * eg:2,13
		 * 2 is the lowest prime num
		 * also if the prime num is divisible by 2--then it is not prime
		 */
		int num = 37;
		boolean flag = false;
		
		for(int i=2;i<=num/2;i++) {
			
			if(num%i == 0) {
				flag = true;
				break;
			}
			
		}
		if(!flag) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}

	}

}
