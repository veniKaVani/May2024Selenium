package oldjavasessionsgeneralNa;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 * 3 types: 
		 * 1. try-catch block
		 * why we use try-catch block: also used for reporting purpose
		 * 
		 * 2.throws:also used for exception handling, But when using throws---there is no option
		 * for reporting
		 * always used when we have method chaining
		 * one method throws exception and is caught by another, which again throws, and another
		 * method catches it.....so on and so forth until it is caught by main()--when the JVM itsel
		 * had to handle it
		 * for eg: u have written 150 lines of code: and 100 lines of it is giving exception--for
		 * which writing 100 try-catch blocks to handle is tiresome=====in such case throws keyword
		 * is used so as to keep throwing the exceptions until it reaches the main() when JVM -gets
		 * to handle it and take care of it
		 * And obviously the program is terminated
		 * JVM prints its own stack trace-kind of its own report
		 * and the user has no option to report it--eventually try-catch has to be used
		 * 
		 * 3.Throw: is used to custom create ur own exception
		 * 
		 * 
		 * 
		 * There are 2 classes:
		 * Error class, Exception class both are child classes of Throwable
		 * ERRor: syntax error, fatal 
		 * Exception: means unpredictable behaviour ==> some coding problem
		 * 
		 * THROWABLE: IS the super class of Error and Exception
		 * Object: is the super super class of all classes
		 * so the parent of Throwable is Object
		 */
		
		//1. try-catch block:
		try {
		int i = 9/0;//this code throws exception
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("this is my own message-AE");
		}
		System.out.println("ABC");
	}

}
