package faq2;

public class NaturalNoSum3 {

	public static void main(String[] args) {
		//Java program to print the sum of natural nos??
		
		int num = 100;
		int sum =0;
		
		//1+2+3+.....+100=5050
		
		for(int i=1;i<=num;i++) {
			sum = sum+i;
			
		}
       System.out.println("sum is: "+sum);
       System.out.println("-------------");
       //using while loop:
       int k=1;
       int sum1=0;
       while(k<=num) {
    	   sum1 = sum1+k;
    	   k++;
       }
       System.out.println("sum is: "+sum);
	}

}
