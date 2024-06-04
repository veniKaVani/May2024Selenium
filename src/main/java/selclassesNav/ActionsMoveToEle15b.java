package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToEle15b {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
//		//creating the target reference ele for action ref created:
//		WebElement addOnsEle = driver.findElement(By.xpath("//div[text()='Add-ons']"));//parent locator
//		
//		//creating actions class Ele & passing the driver as param:
//		Actions act2 = new Actions(driver);
//		
//		act2.moveToElement(addOnsEle).build().perform();
//		Thread.sleep(1500);
//		
//		//sub-menu locator
//		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar'and text()='Visa Services']")).click();
//		

		//using generic now with By locator bank:
		By parent = By.xpath("//div[text()='Add-ons']");
		By submenu=By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar'and text()='Visa Services']");
		
		handleMenuSubMenu(parent,submenu);
		

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
