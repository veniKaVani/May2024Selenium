package selclassesNav;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDrDownAllOptions9b {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");

//		WebElement countryDrDown = driver.findElement(By.id("Form_getForm_Country"));
//		Select sel = new Select(countryDrDown);
//
//		List<WebElement> countryOptions = sel.getOptions();
//		System.out.println(countryOptions.size());
//
//		for (WebElement e : countryOptions) {//time complexity one single for loop:O(n)
//			String text = e.getText();
//			System.out.println(text);
//			if (text.equals("India")) {
//				e.click();
//				break;
//			}
//
//		}
		By country = By.id("Form_getForm_Country");
		doSelectDropDownValue(country, "India");
		
	}
	private static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static List<String> getDropDownOptionsTextList(By locator) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		List<String> txtList = new ArrayList<String>();
		
		for(WebElement e:optionsList) {
			String optionText = e.getText();
			txtList.add(optionText);
		}
		return txtList;
	}
	public static List<WebElement> getDropDownOptionsList(By locator) {
		
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}
	
	public static int getDropDownValuesCount(By locator) {
		return getDropDownOptionsList(locator).size();
	}
	//creating a utility to select from Dr down without using the 3 fns selectByVisibleTxt(),
	//selectByIndex(), selectByValueAttri()
	public static void doSelectDropDownValue(By locator, String value) {
		
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		System.out.println(optionsList.size());

		for (WebElement e : optionsList) {//time complexity one single for loop:O(n)
			String text = e.getText();
			System.out.println(text);
			if (text.equals("India")) {
				e.click();
				break;
			}

		}
		
	}
	public static void printSelectDropDownList(By locator) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		System.out.println(optionsList.size());

		for (WebElement e : optionsList) {//time complexity one single for loop:O(n)
			String text = e.getText();
			System.out.println(text);
	}

}
}
