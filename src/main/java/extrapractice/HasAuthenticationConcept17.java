package extrapractice;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HasAuthenticationConcept17 {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		//1.way of handling:
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        //2.way of handling:
//		String username = "admin";
//		String password = "admin";
//
//		driver.get("https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth");

//		driver.get("https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");
		
		//3.way of handling:
		String username = "admin";
		String password = "admin";
		
		((HasAuthentication)driver).register(()->new UsernameAndPassword(username,password));


	}

}
