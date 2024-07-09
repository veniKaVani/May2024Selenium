package faq2;

public class AlphabetCheck2 {

	public static void main(String[] args) {
		//Java program to check if a char is alphabet or not
		//chars: can be nos 0-9,special chars-#@$%^&*(),A_Z, a-z
		
		char c = 'z';
		
		if((c>='a' && c<='z')||(c>='A' && c<='Z')){
			System.out.println(c+ " is an alphabet");
		}else {
			System.out.println(c+ " is not an alphabet");
		}
			

	}

}
