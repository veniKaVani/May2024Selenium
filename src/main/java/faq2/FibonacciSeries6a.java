package faq2;

public class FibonacciSeries6a {

	public static void main(String[] args) {
		/* Java program to print the fibonacci series??
		 * 
		 * Fibonacci: 0 1 1 2 3 5 8 13 21 34 
		 * first two nos: always 0 and 1
		 * third no: is always sum of first two nos: 0+1=1
		 */
		
		//0 1 1 2 3 5 8 13 21 34
		
		int num = 10;
		int t1 = 0;
		int t2 = 1;
		
		for(int i=1;i<=num;i++) {
			System.out.println(t1);
			int sum = t1+t2;
			t1=t2;
			t2=sum;
			
		}

	}

}
