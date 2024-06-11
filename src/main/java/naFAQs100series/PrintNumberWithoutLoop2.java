package naFAQs100series;

import java.util.stream.IntStream;

public class PrintNumberWithoutLoop2 {
	/*
	 * print 1 to 100 without using any loop
	 * 1. recursive function==> fn calling itself
	 * 2. Java streams(from java 8)
	 */

	public static void main(String[] args) {
		//printNum(1);
		
		//printNumber(5, 500);
		
		//using java streams:
		IntStream.range(1,	101).forEach(e ->System.out.println(e));
		
	}
    public static void printNum(int num) {
    	if(num<=100) {
    		System.out.println(num);//1 2 3 4.......100
    		num++;
    		printNum(num);
    	}
    	
    }
    public static void printNumber(int startNum, int endNum) {
    	if(startNum<= endNum) {
    		System.out.println(startNum);//1 2 3 4 ......100
    		startNum++;
    		printNumber(startNum, endNum);
    	}
    	
    }
}
