package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyElementUtility {
	private static WebDriver driver; // no initialization yet and its default value is null
	/*
	 * SRP--is a design pattern will static work for parallel mode??No
	 * ElementUtility: this class should follow the SRP-single responsibility
	 * principle =>BrowserUtility-responsible only for browser related work
	 * =>likewise ElementUtility is responsible for only element related work-ele
	 * creation + Action on elements
	 * 
	 * what is the current value of webDriver? --the default value==null the default
	 * value of non-primitive dataType-String is always null
	 * 
	 * copy+pasting here the generic utility fns(from 5a class)-1.for creating the
	 * WE and 2. for performing an Action on it====also remove static before pasting
	 * the utility fns
	 * 
	 * in order to assign a value to the driver which is null right now-we need to
	 * create the constructor of this class--which is public so when we create the
	 * object of ElementUtil--this constructor will be called-which would then get
	 * the value for driver same as this current object/class has(=>instance value
	 * of webdriver)
	 * 
	 * CONSTRUCTOR: can be used to set the values also this class has a private
	 * variable(WebDriver driver) and a public constructor(acting as a setter) and
	 * some public methods as well --accessing the private variable driver inside
	 * their method body-IS THE PERFECT EXAMPLE FOR ENCAPSULATION
	 * 
	 * PRIVATE driver--to avoid the unnecessary action on the driver by outsiders if
	 * PUBLIC driver--any one can access the driver of this class and can do
	 * unnecessary actions--to prevent this make it private
	 */

	public MyElementUtility(WebDriver driver) {
		this.driver = driver;// this.classVariable = local Variable inside the params
	}

	public static By getBy(String locatorType, String locatorValue) {
		By locator = null;

		switch (locatorType.toLowerCase().trim()) {
		case "id":
			locator = By.id(locatorValue);
			break;
		case "name":
			locator = By.name(locatorValue);
			break;
		case "classname":
			locator = By.className(locatorValue);
			break;
		case "linkText":
			locator = By.linkText(locatorValue);
			break;
		case "css":
			locator = By.cssSelector(locatorValue);
			break;
		case "xpath":
			locator = By.xpath(locatorValue);
			break;
		case "partiallinktext":
			locator = By.partialLinkText(locatorValue);
			break;
		case "tagname":
			locator = By.tagName(locatorValue);
			break;

		default:
			break;
		}
		return locator;
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	// overloading the getElement() to take String Type parameter
	public static WebElement getElement(String locatorType, String locatorValue) {
		return driver.findElement(getBy(locatorType, locatorValue));
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	// overloading the doSendKeys() to take the getElement(2param) method:
	public void doSendKeys(String locatorType, String locatorValue, String value) {
		getElement(locatorType, locatorValue).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetElementText(By locator) {
		return getElement(locator).getText();
	}

}
