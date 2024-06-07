package selclassesNav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;

public class RelLocators19b {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement ele = driver.findElement(By.id("input-email"));
		
		String aboveTxt 
		= driver.findElement(with(By.cssSelector("label[for='input-email']")).above(ele)).getText();
		
		System.out.println(aboveTxt);
		
		//capturing the txt below New Customer-Header using rel locator concept:using continue Btn as baseEle
		WebElement baseEle = driver.findElement(By.xpath("//a[text()='Continue']"));
		
		String paragraphAboveContinueBtn = driver.findElement(with(By.tagName("p")).above(baseEle)).getText();
		System.out.println(paragraphAboveContinueBtn);
		
		

	}

}
