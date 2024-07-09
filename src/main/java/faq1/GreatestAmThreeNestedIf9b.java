package faq1;

public class GreatestAmThreeNestedIf9b {

	public static void main(String[] args) {
		//using nested if loop
		int x = 500;
		int y = 400;
		int z = 600;
		
		if(x>=y ) {
			if(x>=z) {
				System.out.println("x is the greatest");
			}
			else {
				System.out.println("z is the greatest");
			}
		}
		else {
			if(y>=z) {
				System.out.println("y is the greatest");
			}
		}
		
        
	}

}
