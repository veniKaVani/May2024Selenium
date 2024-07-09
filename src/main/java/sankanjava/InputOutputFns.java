package sankanjava;

import java.util.Scanner;

public class InputOutputFns {

	public static void main(String[] args) {
		/*
		 * CLASS: consists of properties/vars and Actions/methods OBJECT: is an instance
		 * of the Class the vars and methods of class can be accessed only by Objects
		 * 
		 * input/output fns: also called thru objects IOStreams: System.in, System.out,
		 * System.err---available in java.lang pkg Streams: characters flow
		 * 
		 * INPUT FN: to read input from kB at the run time itself:SCANNER & BUFFERED
		 * READER the above 2 classes - Scanner and BR are used to read input from KB
		 * Methods:Scanner--next(), nextInt(), nextFloat(), nextDouble() BR: also reads
		 * from File(which should be existing)
		 * 
		 * CREATION OF OBJECT:
		 * ClassName objRef = new Constructor();
		 * 
		 * constructor() ---purpose is to initialize the object
		 */
		Scanner sc = new Scanner(System.in);
		sc.next();
		System.out.println(sc.next());
		System.out.println(sc.nextInt());
		System.out.println(sc.nextFloat());
	}

}
