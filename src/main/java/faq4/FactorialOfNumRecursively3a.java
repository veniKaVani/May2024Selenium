package faq4;

public class FactorialOfNumRecursively3a {

	public static void main(String[] args) {
		System.out.println(multiplyNums(5));
		System.out.println(multiplyNums(0));
	}
    public static int multiplyNums(int num) {
    	if(num>=1) {
    		return num * multiplyNums(num-1);
    	}else {
    		return 1;
    	}
		
    }
}
