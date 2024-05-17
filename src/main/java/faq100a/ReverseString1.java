package faq100a;

public class ReverseString1 {
    //how to reverse a String?
	public static void main(String[] args) {
		//1.using a String class:
		String s = "selenium";
		System.out.println(s.length());
		
		int len = s.length();
		String rev ="";//initializing the reverse variable
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);//muineles
		}
		System.out.println(rev);
		
		//2.using StringBuffer class:
		StringBuffer sb = new StringBuffer(s);
		StringBuffer newrev = sb.reverse();
		System.out.println(newrev);
		

	}

}
