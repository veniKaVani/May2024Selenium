package extrapractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HasAuthenticationConcept17 {
     static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		
		
		
		driver.get("https://@the-internet.herokuapp.com/basic_auth");
		

	}

}
