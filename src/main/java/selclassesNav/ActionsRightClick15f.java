package selclassesNav;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsRightClick15f {
	/*
	 * what do u mean by context click OR right Click??
	 * BOth are the same thing
	 * when u right click on a web page--whatever u see on the window(back, forward, reload...inspect)
	 *  --u cannot automate since
	 * those are not part of the browser
	 * 
	 * how do u automate a context click??==> they r talking about a right click
	 * We have to use Actions class for this-create an object of Actions class and supply the driver as
	 * param to the constructor of Actions class
	 * 
	 * and there is no method called rightclick BUT there is a method contextClick() from Actions class
	 * 
	 */
    static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickEle = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightClickEle).perform();
		
		driver.findElement(By.xpath("//span[text()='Cut']")).click();
		
//		List<WebElement> rightEles
//		= driver.findElements(By.cssSelector("ul.context-menu-list>li:not(.context-menu-not-selectable)"));
//		
//		for(WebElement e:rightEles) {
//			String text = e.getText();
//			System.out.println(text);
//			
//			if(text.equalsIgnoreCase("Copy")) {
//				e.click();
//				break;
//			}
//		}
		
		
		
		

	}

}
