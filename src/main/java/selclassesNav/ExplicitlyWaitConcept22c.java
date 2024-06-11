package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitlyWaitConcept22c {

	public static void main(String[] args) {
// Wait(I): until(); --->FluentWait(C):(@overridden) until(){} + other methods --->WebDriverWait(C):no methods
		/*
		 * WebDriverWait: is extending the fluentWait
		 * fluentWait: is implementing the wait interface
		 * Wait: is an interface
		 * until: is a method without body - so is implemented by fluentWait class
		 * 
		 * WebDriverWait: is the child of fluentWait class
		 * 
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm.com/30-day-free-trial/");
		
		By fullname=By.id("Form_getForm_Name");
		
		

	}

}
