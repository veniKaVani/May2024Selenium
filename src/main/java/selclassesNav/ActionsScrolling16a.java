package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling16a {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * with sel 4.x: new changes have been made one of which is scrolling is also
		 * made possible with the Actions class, previously we had only one option which
		 * was with JavaScriptExecutor--here we r talking about vertical scrolling
		 * 
		 * infinite scrolling: is diff which can be achieved using JSE
		 * 
		 * Keys: are pre-defined enum in java
		 * enum: is a collection of multiple constant values 
         * there are multiple constant key board actions already defined here-arrow left,right
         * 
         * there is one thing that they have defined keys.PAGE_DOWN
         * 
         * SCROLLTOELEMENT: scroll until an ele is found
         * this is a builder pattern
         * 
         * from the keyboard--the refresh is function F5
		 */
      WebDriver driver = new ChromeDriver();
      driver.get("https://naveenautomationlabs.com/opencart/");
      
      Actions act = new Actions(driver);
      
//      act.sendKeys(Keys.PAGE_DOWN).perform();//since only one action
//      Thread.sleep(1500);
//      act.sendKeys(Keys.PAGE_UP).perform();
      
//      act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
//      Thread.sleep(1000);
//      act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
//      Thread.sleep(1000);
//      act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
     
        act.scrollToElement(driver.findElement(By.xpath("//a[text()='Delivery Information']")))
            .click(driver.findElement(By.xpath("//a[text()='Delivery Information']")))
               .build().perform();     
	}

}
