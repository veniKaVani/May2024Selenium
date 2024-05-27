package selclassesNav;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDrDownWithoutUsingSelectClass9c {
	static WebDriver driver;
	/*
	 * When creating Xpath: if we have to use attributes and not id(), name(),
	 * classname() fns we have to use @ whenever there is direct association after
	 * parent tag--use / for indirect child: use //
	 */

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");

		// not allowed to use select class
//		WebElement countryDrDown = driver.findElement(By.id("Form_getForm_Country"));

		By options = By.id("Form_getForm_Country");
		doSelectValueFromDrDown(options, "India");
		doSelectValueFromDrDown(options, "Australia");

//		List<WebElement> optionsList = driver.findElements(options);
//		
//		System.out.println(optionsList.size());
//		
//		for(WebElement e:optionsList) {
//			String text = e.getText();
//			if(text.equals("India")) {
//				e.click();
//				break;
//			}
//		}

	}
//HW: write a generic to select by passing int value=>index for the dropdown--need to 
	//a for with increasing counter
	public static void doSelectValueFromDrDown(By locator, String value) {
		List<WebElement> optionsList = driver.findElements(locator);

		System.out.println(optionsList.size());

		for (WebElement e : optionsList) {
			String text = e.getText();
			if (text.equals("India")) {
				e.click();
				break;
			}
		}
	}
}
