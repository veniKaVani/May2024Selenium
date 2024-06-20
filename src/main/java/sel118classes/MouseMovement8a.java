package sel118classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement8a {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		
		WebElement contentEle = driver.findElement(By.xpath("//a[@class='menulink']"));
		
		Actions act1 = new Actions(driver);
		act1.moveToElement(contentEle).build().perform();
		Thread.sleep(1500);
		
		driver.findElement(By.linkText("SINGLE VIDEOS")).click();

	}

}
