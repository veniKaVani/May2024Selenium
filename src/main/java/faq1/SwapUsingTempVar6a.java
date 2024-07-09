package faq1;

public class SwapUsingTempVar6a {

	public static void main(String[] args) {
		//Java program to swap two no.s using temp var??
		
		int a = 11;
		int b = 21;
		
		System.out.println("before swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);

		System.out.println("after swapping:");
		int temp;
		temp= a;
		a=b;
		b=temp;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
