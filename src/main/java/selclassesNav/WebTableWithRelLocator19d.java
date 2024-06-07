package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

public class WebTableWithRelLocator19d {
	//for simple scenarios just one checkbox-rel locators helpful
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);
		
		WebElement playerEle = driver.findElement(By.linkText("Joe.Root"));
		
		driver.findElement(with(By.id("ohrmList_chkSelectRecord_21")).toLeftOf(playerEle)).click();
		
		List<WebElement> rightSideInfo 
		= driver.findElements(with(By.xpath("//table[@id='resultTable']//td")).toRightOf(playerEle));
		
		for(WebElement e:rightSideInfo) {
			String playerInfoTxt = e.getText();
			System.out.println(playerInfoTxt);
		}

	}

}
