package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement15a {
	/*
	 * userActions: 
	 *  mouseMovement=>moveToElement, keyboardActions, dragNdrop, rightClick, menuSubmenuHandling
	 * clickNsendKeys,
	 * All the above Actions: can be solved with the help of Actions class
	 * 
	 * Scenario: we r going to handle mouse movement=> when we r going to hover the mouse
	 * on some element, some hidden eles are going to appear
	 * 
	 * here on Dom when i inspect content--on the dom @class = 'menulink'
	 * ----------------which can also be considered as className--
	 * so can write By.classname("menulink")
	 * 
	 * for mouse over: use actions class=>create the object & pass the driver into actions class constructor
	 * ---then moveToElement(target) and whenever u r using any actions class method--here
	 * it is moveToElement(target) --u have to build and perform
	 * i) for just single action --can use just perform()
	 * ii) for multiple actions--n no. of actions
	 * --need to use both build().perform();
	 * ==>.perform() is mandatory to use
	 * 
	 * act.moveToElement(content).build().perform();
	 * 1 -perform
	 * 1 -build.perform
	 * n --build.perform
	 * 
	 * BUILD: is collecting all the actions together and then performing those on the page
	 * 
	 * when dealing with LINKS: do you take the dom text OR linkText visible on page??
	 * ---always take the link Text visible on page--usually the text in uppercase
	 */
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		
		//creating the target webelement:
		WebElement contentEle = driver.findElement(By.className("menulink"));
		
		Actions act1 = new Actions(driver);
		act1.moveToElement(contentEle).perform();
		
		Thread.sleep(1500);
		
		driver.findElement(By.linkText("ARTICLES")).click();
		
		
		

	}

}
