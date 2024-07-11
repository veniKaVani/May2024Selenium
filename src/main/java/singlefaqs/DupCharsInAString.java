package singlefaqs;

public class DupCharsInAString {

	public static void main(String[] args) {
		/*
		 * Java program to find the duplicate chars in a string
		 * EdgeCases/NegScenarios: what if string is null, empty or length=1
		 * in all the above edge cases: it should return nothing
		 */
		String s = "Java";
		
		
	}
	public static void printDupChars(String str) {
		if(str==null) {
			System.out.println("NULL String");
			return;
		}
		if(str.isEmpty()) {
			System.out.println("Empty String");
			return;
		}
		if(str.length()==1) {
			System.out.println("Single Char String");
			return;
		}
		char singleletters[]=str.toCharArray();
		
		
	}

}
