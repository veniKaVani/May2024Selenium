package selclassesNav;

public class WaitConcept22a {

	public static void main(String[] args) {
		
		/*
		 * eg: u have written a script which does something on app But appn is very slow
		 * may be it is taking some time(5,10,20secs....serverslowness, some band width not available)
		 * --so we have to sink the script that we have written and the appn-hence we have to write
		 * the synchronization between the script and the appn which is in the form of Wait
		 * WAITS: 2 TYPES
		 * 1. static wait 
		 *   eg: Thread.sleep(3000); we have written so far
		 *   Problem: with static wait -even if the element appears within 2 secs still the
		 *   appn is going to wait for 3 secs--as it is not a dynamic wait
		 * 2. dynamic wait:if the wait time given is 10 secs and if the ele is found within 2 secs
		 *   then the rest of 8 secs will not be waited anymore
		 *    diff types of dynamic waits: 
		 *    2.a.Implicitly wait
		 *    2.b.Explicitly wait
		 *      i) WebDriverWait (C)
		 *      ii) FluentWait(C)
		 *      
		 *  Wait(I): until(); --->FluentWait(C): until(){} + other methods --->WebDriverWait(C)
		 * 
		 * 
		 */
		
	}

}
