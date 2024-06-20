package oldjavasessionsgeneralNa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseMovement8aSpJet {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
//		WebElement spiceClubEle = driver.findElement(By.linkText("SpiceClub"));

//		Actions act2 = new Actions(driver);
//		act2.moveToElement(spiceClubEle).perform();

//		driver.findElement(By.xpath("//div[contains(text(),'Tiers')]")).click();

		By parent = By.linkText("SpiceClub");
		By child = By.linkText("Tiers");

		By child2 = By.xpath("//div[text()='Tiers']");

		handleMenuSubMenu(parent, child2, 10);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}


	public static void handleMenuSubMenu(By parentMenuLocator, By subMenuLocator, int timeOut) throws InterruptedException {

		Actions act2 = new Actions(driver);
		act2.moveToElement(getElement(parentMenuLocator)).perform();
		Thread.sleep(1500);
		waitForElementVisible(subMenuLocator,timeOut).click();
		
	}
}
