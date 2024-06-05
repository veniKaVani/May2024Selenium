package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTabSequence16c {

	public static void main(String[] args) {
		/*
		 * what is Actions tab sequence??
		 * sleep is a java method AND pause is a selenium method
		 * 
		 * writing a program to fill the reg form using tab sequence:
		 * 
		 * on good apps: tab seq is always there and is fixed
		 * Scenario: usability testing(for blind people -this feature is used)
		 * BUT this usedcase is fragile -since once the tab seq changes the TC fails
		 * and a bug can be raised
		 * 
		 * ZOOM-IN, ZOOM-OUT: cannot be done with actions class BUT can be achieved using JSE
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		Actions act = new Actions(driver);
		
		WebElement fn = driver.findElement(By.name("firstname"));
		
		act.sendKeys(fn, "Sanjay")
		     .sendKeys(Keys.TAB)
		     .pause(200)
		     .sendKeys("automation")
		     .sendKeys(Keys.TAB)
		     .pause(200)
		     .sendKeys("san@gmail.com")
		     .sendKeys(Keys.TAB)
		     .pause(200)
		     .sendKeys("99999999999")
		     .sendKeys(Keys.TAB)
		     .pause(200)
		     .sendKeys("san@123")
		     .sendKeys(Keys.TAB)
		     .pause(200)
		     .sendKeys("san@123")
		     .build()
		     .perform();
		     

	}

}
