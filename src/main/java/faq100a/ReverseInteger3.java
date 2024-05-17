package faq100a;

public class ReverseInteger3 {
    //How do you reverse an integer??
	public static void main(String[] args) {
		//use mathematical skills:
		
		//1.using algo:
		long num = 123456;
		long rev = 0;
		
		while(num!=0) {
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println("Reverse no is:"+rev);
		
		//2.using StringBuffer method:
		long num1=8976543;
		StringBuffer sb = new StringBuffer(String.valueOf(num1));
		System.out.println(sb.reverse());
	}
   
}
