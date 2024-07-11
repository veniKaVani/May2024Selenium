package faq4;

public class CheckPrimeNoTough1a {
      /*
       * Java program to chk whether the no given could be expressed as prime or not
       * amongst all the combinations-the primes are
       * the prime no pairs :3+31; 5+29; 11+23; 17+17
       */
	public static void main(String[] args) {
//		int num = 34;
		//34=1+33;2+32;3+31;4+30;5+29;6+28;7+27;8+26;9+25;10+24;11+23;12+22;13+21;14+20;15+19;
		//16+18;17+17
//		System.out.println(checkPrimeNum(34));
		
		int num = 34;
		boolean flag = false;
		
		for(int i=2;i<=num/2;i++) {
			
			if(checkPrimeNum(i)) {
				
				if(checkPrimeNum(num-i)) {
					System.out.println(num+"="+i+" + "+(num-i));
					flag = true;
				}
			}
			
			
		}
		
		if(!flag) {
			System.out.println(num+" can not be expressed as the sum of two prime no.s");
		}

	}
   public static boolean checkPrimeNum(int num) {
	   boolean isPrime = true;
	   for(int i=2;i<=num/2;i++) {
		   if(num%i==0) {
			   isPrime=false;
			   break;
		   }
	   }
	   
	return isPrime;
	   
   }
}
