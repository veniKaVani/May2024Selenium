package selclassesNav;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import allexceptions.ElementException;

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

	// we created a wrapper method on top of sel-findElement()-with proper Exception
	// Handling as well
	// in future if the ele is not found when it comes inside the catch block--we
	// might need to write
	// some wait mechanism as well-to say pls wait for some more time until the
	// element might appear
	public static WebElement getElement(By locator) {
		WebElement element = null;

		try {
			element = driver.findElement(locator);
		} catch (NoSuchElementException e) {
			System.out.println("Element is not found on the page");
			e.printStackTrace();
			return null;
		}
		return element;
	}

	private static void nullBlankCheck(String value) {
		// if the user passes a null value for text-need to throw custom exception:
		// make this private so not accessible to everyone
		if (value == null || value.length() == 0) {
			throw new ElementException("VALUE TEXT CANNOT BE NULL!...");
		}
	}

	// overloading the getElement() to take String Type parameter
	public static WebElement getElement(String locatorType, String locatorValue) {
		return driver.findElement(getBy(locatorType, locatorValue));
	}

	// still need to create the getElements(By locator, String value){}
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public ArrayList<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleTxtList = new ArrayList<String>();

		for (WebElement e : eleList) {
			String text = e.getText();

			if (text.length() != 0) {
				eleTxtList.add(text);
			}
		}
		return eleTxtList;
	}

	public static void doSendKeys(By locator, String value) {
		nullBlankCheck(value);
		getElement(locator).sendKeys(value);
	}
	//overloading the doSendKeys() to apply explicit wait mechanism --in case a user wants to apply wait
	public static void doSendKeys(By locator,String value, int timeOut) {
		nullBlankCheck(value);
		waitForElementVisible(locator, timeOut).sendKeys(value);
	}

	// overloading the doSendKeys() to take the getElement(2param) method:
	public void doSendKeys(String locatorType, String locatorValue, String value) {
		getElement(locatorType, locatorValue).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}
	//overloading doClick() to apply explicit wait until the element is visible
	public void doClick(By locator, int timeOut) {
		waitForElementVisible(locator, timeOut).click();
	}

	public String doGetElementText(By locator) {
		return getElement(locator).getText();
	}

	public String doGetEleAttribute(By locator, String attriName) {
		return getElement(locator).getAttribute(attriName);
	}

	public boolean isElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public boolean isElementExist(By locator) {// MOVING IT TO eLEuTIL better than isDisplayed();
		if (getElements(locator).size() == 1) {
			return true;
		}
		return false;
	}

	// the above generic fn for more no of elements than 1:
	public boolean multipleElementsExist(By locator) {
		if (getElements(locator).size() > 0) {
			return true;
		}
		return false;
	}

	// **************SELECT BASED DR DOWN UTILS******************
	public void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public void doSelectByVisibleText(By locator, String value) {
		// if the user passes a null value for text-need to throw custom exception:
		nullBlankCheck(value);

		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}

	public void doSelectByValueAttri(By locator, String value) {
		// if the user passes a null value for text-need to throw custom exception:
		nullBlankCheck(value);

		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public List<String> getDropDownOptionsTextList(By locator) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		List<String> txtList = new ArrayList<String>();

		for (WebElement e : optionsList) {
			String optionText = e.getText();
			txtList.add(optionText);
		}
		return txtList;
	}

	public List<WebElement> getDropDownOptionsList(By locator) {

		Select select = new Select(getElement(locator));
		return select.getOptions();
	}

	public int getDropDownValuesCount(By locator) {
		return getDropDownOptionsList(locator).size();
	}

	// creating a utility to select from Dr down without using the 3 fns
	// selectByVisibleTxt(),
	// selectByIndex(), selectByValueAttri()
	public void doSelectDropDownValue(By locator, String value) {

		List<WebElement> optionsList = getDropDownOptionsList(locator);
		System.out.println(optionsList.size());

		for (WebElement e : optionsList) {// time complexity one single for loop:O(n)
			String text = e.getText();
			System.out.println(text);
			if (text.equals("India")) {
				e.click();
				break;
			}

		}

	}

	public void printSelectDropDownList(By locator) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		System.out.println(optionsList.size());

		for (WebElement e : optionsList) {// time complexity one single for loop:O(n)
			String text = e.getText();
			System.out.println(text);
		}

	}

	// pasting the generic fn of session 9c:without select class selecting the dr
	// down values
	public void doSelectValueFromDrDown(By locator, String value) {
		List<WebElement> optionsList = getElements(locator);

		System.out.println(optionsList.size());

		for (WebElement e : optionsList) {
			String text = e.getText();
			if (text.equals("India")) {
				e.click();
				break;
			}
		}
	}

	// generic fn to search Google and printing the suggestions on console:
	public void doSearchGoogle(By searchlocator, By searchSuggestions, String searchKey, String value)
			throws InterruptedException {

//		driver.findElement(searchlocator).sendKeys(searchKey);--to be removed

		doSendKeys(searchlocator, searchKey);

		Thread.sleep(3000);

//		List<WebElement> suggsList = driver
//				.findElements(searchSuggestions);---To be removed

		List<WebElement> suggsList = getElements(searchSuggestions);

		System.out.println(suggsList.size());

		for (WebElement e : suggsList) {
			String text = e.getText();
			System.out.println(text);

			if (text.contains(value)) {
				e.click();
				break;
			}
		}
	}

	// creating a generic fn for this mouseMovement-to handle menu-submenu and put
	// it in ele utility:
	public void handleMenuSubMenu(By parentMenuLocator, By SubMenuLocator) throws InterruptedException {
		Actions act = new Actions(driver);
		// targetEle = getElement(parentMenuLocator)
		act.moveToElement(getElement(parentMenuLocator)).perform();// since single action
		Thread.sleep(1500);

		// getElement(SubMenuLocator).click();
		doClick(SubMenuLocator);
	}

	// creating a generic fn for this mouseMovement-to handle menu-submenu and put
	// it in ele utility:
	public void handleMenuSubLevel4Menu(By level1Loc, By level2Loc, By level3Loc, By level4Loc)
			throws InterruptedException {

		// getElement(level1Loc).click();
		doClick(level1Loc);
		Actions act = new Actions(driver);
		Thread.sleep(1500);

		act.moveToElement(getElement(level2Loc)).perform();// since single action
		Thread.sleep(1500);

		act.moveToElement(getElement(level3Loc)).perform();
		Thread.sleep(1500);

		// getElement(level4Loc).click();
		doClick(level4Loc);
	}
	//***************Actions click and sendKeys15**********************//
	public  void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(driver.findElement(locator)).perform();
	}
	public  void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	
	//**********************Wait Utils*******************************//
	 /**
     * 
	 * An expectation for checking that an element
	 * is present on the DOM of the page This does not necessarily mean that the
	 * element is visible
     * @param locator
     * @param timeOut
     * @return
     */
	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * and is visible Visibility means that the element is not only displayed but
	 * also has a height and width that is greater than 0
	 * @param locator
	 * @param timeout
	 * @return
	 */

	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
