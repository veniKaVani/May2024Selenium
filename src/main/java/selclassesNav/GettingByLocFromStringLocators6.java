package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
   
public class GettingByLocFromStringLocators6 {
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By username = By.id("input-email");
		By pwd = By.id("input-password");
		
		//8. By util + String locators:
		String username_id = "input-email";
		String pwd_id = "input-password";
		
		//Formula: create a webElement using String locator--create inside the ElementUtility
		//then perform Action on the WEs
		//create a generic - which takes the String locator as param and return the By locator
		
		MyElementUtility eleUtil = new MyElementUtility(driver);
		eleUtil.doSendKeys("id", username_id, "veni@myyahoo.com");
		eleUtil.doSendKeys("id", pwd_id,"EnPatiNagamma");
		
	}

}
