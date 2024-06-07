package selclassesNav;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp17b {

	public static void main(String[] args) {
		/* BASIC AUTH:is the simplest form of authentication where u just have to pass the un and pwd
		 * O AUTH: is the more complex form of authentication where u have to pass the token id, refreshtoken..
		 * 
		 * Authentications: are of diff types
		 * JWD token, api keys, O Auth 1.0, O Auth 2.0, Primitive Authentications, Digestive Authentication
		 * Basic Auth is one of them
		 * 
		 * POSTMan: if u go to postman
		 * 
		 * Authentication popup url: https://the-internet.herokuapp.com/basic_auth
		 * The moment url is launched --there is this auth popup window appearing
		 * and nothing else could be done--the page is freezed
		 * so user needs to enter the username and passwords on the pop up --manually
		 * which could be done by sel as well
		 * HOW??--append the username and pwd in the url itself
		 * in the url itself after //username:password@domain
		 * 
		 * the username and pwd for this url is admin:admin--so write in the url
		 * 
		 * https://admin:admin@the-internet.herokuapp.com/basic_auth
		 * 
		 * the username and password will not be seen in the url--because sel will take care
		 * of it internally
		 * 
		 * WHAT IS THE LIMITATION OR MAJOR PROBLEM WITH THE LINE 30 OF CODE??
		 * 
		 * if the password is admin@123--will it work NO
		 * because after @ it is always expecting the domain name--so create pwd without @123
		 * 
		 * How to use HasAuthentication??
		 * Type HasAuthentication and typecast/convert the driver to HasAuthentication
		 * Dot and then use the method: register()
		 * And in the register() --it says that you have to give a supplier
		 * SUPPLIER: is one interface--which says u have to give one supplier
		 * --for which we have to use one lambda=>we have to supply one functional interface
		 * in the form of lambda(arrow is called lambda)
		 */
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//if u do not want to write the hard coded value then write as below:
		//1st way:supply the username and password from the url itself
		String username = "admin";
		String password = "admin";
		
//		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		//sel 4.x:
		//2nd way: using HasAuthentication()---is an interface which says
		//indicates that a driver supports authenticating to website in some way
		
		((HasAuthentication)driver).register(()->new UsernameAndPassword(username,password));
		
		//now u do not need to pass the username and password in the url anymore
		driver.get("https://@the-internet.herokuapp.com/basic_auth");

	}

}
