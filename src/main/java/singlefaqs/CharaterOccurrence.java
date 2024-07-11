package singlefaqs;

import java.util.stream.IntStream;

public class CharaterOccurrence {
   /*
    * Count occurrences of a character in a string
    * o -2; I-1; 
    * 1.chararray -- for loop
    * 2.str.len -charAt(i)
    * 3.Apache common StringUtils
    * 4.Streams
    */
	public static void main(String[] args) {
		
		String str = "I love coding";
		
//		//1.using charArray:
//		int count = 0;
//		for(char ch: str.toCharArray()) {
//			if(ch==' ') {
//				count++;
//			}
//		}
//		System.out.println(count);
		
//		getCharOccurrence(str, 'o');
//		getCharCount(str,'i');
		
//		getCharCountUsingStreams(str,"i");

	}
	public static void getCharOccurrence(String str,char val) {
		//1.using charArray:
				int count = 0;
				for(char ch: str.toCharArray()) {
					if(ch==val) {
						count++;
					}
				}
				System.out.println(count);
	}
	//2.using charAt(index):
	public static void getCharCount(String str, char value) {
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==value) {
				count++;
			}
		}
		System.out.println(value+":"+count);
	}
//	//3.using streams:not working on this computers jdk: has some issue---EVEN TEST NG
//	public static void getCharCountUsingStreams(String str, String val) {
//		str.chars();
//		
//		System.out.println(count);
//	}
}

