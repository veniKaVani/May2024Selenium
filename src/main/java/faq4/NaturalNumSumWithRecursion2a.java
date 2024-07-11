package faq4;

public class NaturalNumSumWithRecursion2a {
      /*
       * Recursion: a method which calls itself
       * Natural Nums: start with 1
       * ==>positive no.s and 0 is not a Natural no.
       * 
       * 
       */
	public static void main(String[] args) {
		int num = 5;//5/4/3/2/1=>5+4+3+2+1=15
		int sum = addNum(num);
		System.out.println("sum is: " +sum);
		
	}
    public static int addNum(int num) {
    	if(num!=0) {
    		return num + addNum(num-1);
    	}else {
    		return num;
    	}
    }
}
