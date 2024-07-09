package faq1;

public class VowelOrConsonant8 {

	public static void main(String[] args) {
		//Java program to check whether the alphabet is vowel or consonant??
		
		//a e i o u
		
		char ch ='b';
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println(ch+" is a vowel");
		}else {
			System.out.println(ch+" is consonant");
		}
		
		System.out.println("**********************");
		//using a switch statement to do the same:
		
		switch (ch) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch+" is vowel");
			break;

		default:
			System.out.println(ch+" is consonant");
			break;
		}

	}

}
