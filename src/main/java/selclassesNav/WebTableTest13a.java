package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest13a {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		driver.manage().window().maximize();

		driver.findElement(By.name("username")).sendKeys("binduk7");
		driver.findElement(By.name("password")).sendKeys("Orange@123");

		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(4000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		
		selectContact("Susan Coburn");
		System.out.println(getCompName("Susan Coburn"));

	}

	public static void selectContact(String contactName) {

		String xpath = "//a[text()='" + contactName
				+ "']/parent::td/preceding-sibling::td/child::input[@type='checkbox']";
		driver.findElement(By.xpath(xpath)).click();

	}

	public static String getCompName(String contactName) {
		String xpath = "//a[text()='Kit Moy']/parent::td/following-sibling::td/child::a[@context='company']";
		return driver.findElement(By.xpath(xpath)).getText();

	}

	public static void getPhoneNumber(String contactName) {

	}

	public static void getContactsInfoList(String contactName) {

	}
}
