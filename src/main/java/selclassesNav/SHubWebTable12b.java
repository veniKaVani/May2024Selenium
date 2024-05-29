package selclassesNav;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SHubWebTable12b {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");

//		driver.findElement(By.xpath("//a[text()='Joe.Root']/ancestor::tr/td/input[@type='checkbox']"));
//		String xpath = "//a[text()='Joe.Root']/ancestor::tr/td/input[@type='checkbox']";
//		driver.findElement(By.xpath(xpath)).click();

		selectUser("John.Smith");
		selectUser("Joe.Root");

		System.out.println(getUserDetails("John.Smith"));
        System.out.println(getUserDetails("Joe.Root"));
	}

	// creating a generic method based on xpath:cannot be moved to ElementUtil since
	// app specific
	public static void selectUser(String userName) {

		String xpath = "//a[text()='" + userName + "']/ancestor::tr/td/input[@type='checkbox']";
		driver.findElement(By.xpath(xpath)).click();

	}

	public static List<String> getUserDetails(String userName) {
		String xpath = "//a[text()='" + userName + "']/parent::td/following-sibling::td";
		List<WebElement> userInfoRoles = driver.findElements(By.xpath(xpath));
		List<String> userInfoList = new ArrayList<String>();

		for (WebElement e : userInfoRoles) {
			String text = e.getText();
			userInfoList.add(text);
		}
		return userInfoList;
	}

}
