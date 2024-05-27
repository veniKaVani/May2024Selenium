package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import allexceptions.ElementException;

public class SelectDrDownConcept9a {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");

//    WebElement countryDrDown = driver.findElement(By.id("Form_getForm_Country"));
//    
//    Select sel = new Select(countryDrDown);
//    sel.selectByIndex(5);
//    sel.selectByVisibleText("India");
//		sel.selectByVisibleText("Bin");//NSE exception so no need to handle this in gen fn
//    sel.selectByValue("Azerbaijan"); //here value is attribute seen on dom

		By country = By.id("Form_getForm_Country");
		doSelectByIndex(country, 5);
	}

	// creating a generic fn to create ele and pass it as param into the Select
	// class constructor:
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doSelectByVisibleText(By locator, String visibletext) {
		//if the user passes a null value for text-need to throw custom exception:
		if(visibletext==null) {
			throw new ElementException("VISIBLE TEXT CANNOT BE NULL!...");
		}
				
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibletext);
	}
	
	public static void doSelectByValueAttri(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
}
