package faq100a;

public class StringManipulation7a {

	public static void main(String[] args) {
		// String: is a collection of chars inside double quotes
		// dot size is for arrayList; dot length for String class
		// String class: dot reverse not available since Strings are immutable
		// dot reverse: available in String Buffer class

		String str = "The rains have started here so";
		String str2 = "The rains have started here so";

		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('s'));// first occurrence of s

		System.out.println(str.indexOf('s', str.indexOf('s') + 1));// 2nd occurrence of s

		// THIS IS WRONG:THIRD OCCURRENCE--NEED TO FIGURE
//		System.out.println(str.indexOf('s',str.indexOf('s',str.indexOf('s')+1),str.indexOf('s')+2));//3rd occurrench HW

		System.out.println(str.indexOf("have"));
		System.out.println("hello");// -1 ==>it is not available gives -1 as result

		// String comparison:
		System.out.println(str.equals(str2));

		System.out.println(str.equalsIgnoreCase(str2));

		// substring:
		System.out.println(str.substring(0, 9));

		// trim:
		String s = "     helloWorld!   ";
		System.out.println(s.trim());

		System.out.println(s.replace(" ", ""));

		String date = "01-01-2017";
		System.out.println(date.replace("-", "/"));

		// split:
		String test = "Hello_World_Test_Selenium";
		String[] testVal = test.split("_");
		
		for(int i=0;i<testVal.length;i++) {
			System.out.print(testVal[i]);
		}
		
		String s2 = "cares";
		System.out.println(s2.concat("s"));
		
		String x="Hello";
		String y="World";
		
		int a = 100;
		int b = 200;
		
		System.out.println(x+y);
        System.out.println(a+b);
        System.out.println(x+y+a+b);
        System.out.println(x+y+(a+b));
        System.out.println(a+b+x+y);
        System.out.println(a+b+(x+y));
	}

}
