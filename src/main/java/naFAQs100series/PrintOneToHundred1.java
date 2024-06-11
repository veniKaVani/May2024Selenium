package naFAQs100series;

public class PrintOneToHundred1 {

	public static void main(String[] args) {
		/*
		 * Output no.s from 1-100 without using any no.s in the code
		 */

		int one = 'A' / 'A'; // 1
		String s1 = "..........";

		for (int i = one; i <= s1.length() * s1.length(); i++) {
			System.out.println(i);
		}
		System.out.println("****************");
		// using ascii values:a-97,b 98, c 99, d 100
		for (int i = one; i <= 'd'; i += one) {
			System.out.println(i);
		}
		System.out.println("****************");
		for (int i = one; i <= 'd'; i ++) {
			System.out.println(i);
		}
	}

}
