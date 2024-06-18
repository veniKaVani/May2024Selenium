package selclassesNav;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitConcept22d {

	public static void main(String[] args) {
		// wait(I): until(); -->FluentWait(C):(@overridden)until(){}+other
		// methods-->WebDriverWait(C):no methods
		/*
		 * 1. Driver.findElement(); 2. With the java script executor--it was giving the
		 * shadow DOM element Converting that into WE 3. wait.until(); ===>waits until
		 * the presence of the element and then returns that WE Takes the By locator to
		 * find the element
		 * 
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");

		By fullName = By.id("Form_getForm_Name");

		// Explicitly Wait: could be applied either with the FluentWait OR with the
		// WebDriver wait also
		// return type: of until() method is V--means it could return any thing based on
		// the behavior
		// of the application

		// e1:10 secs
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement fullName_ele = wait.until(ExpectedConditions.presenceOfElementLocated(fullName));
		fullName_ele.sendKeys("testing");
		
		//e2: 0 no wait applied--this flexibility happens only with explicit wait/WebDriver wait
		driver.findElement(By.id("Form_getForm_Email")).sendKeys("test@gmail.com");

	}

}
