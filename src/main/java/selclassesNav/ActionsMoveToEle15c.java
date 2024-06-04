package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToEle15c {
	/*
	 * sometimes on some apps: u need to click on the parent menu so the sub menus appear
	 * eg: bigbasket.com
	 * and they might have multiple submenus to be handled
	 * 
	 */
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		
		By parent = By.className("menulink");
		By submenu = By.linkText("COURSES");
		
		handleMenuSubMenu(parent, submenu);
		
	}
	//creating getElement() generic for finding/creating the webEles:
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
	    //creating a generic fn for this mouseMovement-to handle menu-submenu and put it in ele utility:
		public static void handleMenuSubMenu(By parentMenuLocator, By SubMenuLocator) throws InterruptedException {
			Actions act = new Actions(driver);
			//targetEle = getElement(parentMenuLocator)
			act.moveToElement(getElement(parentMenuLocator)).perform();//since single action
			Thread.sleep(1500);
			
			getElement(SubMenuLocator).click();
		}
}
