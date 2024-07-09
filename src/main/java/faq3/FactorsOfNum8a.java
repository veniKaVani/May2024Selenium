package faq3;

public class FactorsOfNum8a {

	public static void main(String[] args) {
		/*
		 * Factors of a Num:
		 * 10 --> 1 2 5 10    numberitself and 1 are always the factors of a num
		 * 60 --> 1 2 3 4 5 6 10 12 15 20 30 60
		 */
		
		int num = 10;
		
		
		for(int i=1;i<=num;i++) {
			
			if(num%i == 0) {
				System.out.println(i + " ");
			}
		}

	}

}
