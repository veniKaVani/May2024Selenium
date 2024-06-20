package seleniumoldseries118;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseMovement8a {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.switchTo().frame(0);
		
		WebElement AboutUsEle = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]"));
		
		Actions act1 = new Actions(driver);
		
		act1.moveToElement(AboutUsEle).build().perform();
		Thread.sleep(Duration.ofSeconds(3));
		
		driver.findElement(By.linkText("ExtraSeat")).click();
		

	}

}
