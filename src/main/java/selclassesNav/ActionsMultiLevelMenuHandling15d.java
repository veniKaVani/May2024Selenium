package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMultiLevelMenuHandling15d {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		By level1Pmenu = By.xpath("(//span[text()='Shop by'])[2]");
		By level2Smenu = By.linkText("Beverages");
		By level3Smenu = By.linkText("Tea");
		By level4Smenu = By.linkText("Green Tea");
		
		//using the generic fn to locate the multiple submenus:
		handleMenuSubLevel4Menu(level1Pmenu,level2Smenu,level3Smenu,level4Smenu);

	}

	// creating getElement() generic for finding/creating the webEles:
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	// creating a generic fn for this mouseMovement-to handle menu-submenu and put
	// it in ele utility:
	public static void handleMenuSubLevel4Menu(By level1Loc, By level2Loc, By level3Loc, By level4Loc) throws InterruptedException {
		
		getElement(level1Loc).click();
		Actions act = new Actions(driver);
		Thread.sleep(1500);
		
		act.moveToElement(getElement(level2Loc)).perform();// since single action
		Thread.sleep(1500);
        
		act.moveToElement(getElement(level3Loc)).perform();
		Thread.sleep(1500);
		
		getElement(level4Loc).click();
	}

}
