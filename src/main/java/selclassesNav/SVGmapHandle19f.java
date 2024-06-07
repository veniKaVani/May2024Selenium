package selclassesNav;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGmapHandle19f {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * tagname <g> is also an svg element
		 * for svg element always start with //*[local-name()='svg']
		 * and for tagnames rect, g, path are there under svg
		 * => subpart of svgs then write one more //*[name()='g']
		 * 
		 * using this particular xpath:
		 * //*[local-name()='svg'and @id='map-svg']//*[name()='g'and@id='regions']/*[name()='g']
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		String map_xpath 
		= "//*[local-name()='svg'and @id='map-svg']//*[name()='g'and@id='regions']/*[name()='g']";
		
		List<WebElement> statesList = driver.findElements(By.xpath(map_xpath));
		
		Actions act1 = new Actions(driver);
		
		for(WebElement e: statesList) {
			act1.moveToElement(e).perform();
			String stateId = e.getAttribute("id");
			System.out.println(stateId);
			Thread.sleep(500);
		}
		
		

	}

}
