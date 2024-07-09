package faq1;

public class SwapWithoutUsingTempVar6b {

	public static void main(String[] args) {
		//swapping nos without using temp:
		int a = 11;
		int b = 12;
		
		System.out.println("before swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		a=a-b;
		b=a+b;
		a=b-a;
		
		System.out.println("after swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
