package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept5a {
	static WebDriver driver;
	public static void main(String[] args) {
		//LOCATORS: 2 types - By and String types
		
		//create a webelement+perform action on it(click, getText, isDisplayed)--Formula
		//the complete page when u inspect is called chrome Dev Tools(the band with multiple options)
		//Elements, console, sources, recorder, Network, performance, memory...
		//Amongst these only the Elements section is DOM
		
		//whatever comes first after angular braces on HTML dom is tagname
		//rest of the things that are in key, value format are attributes/properties for the WE
		
		//whenever we hit the URL: the DOM is the first to be loaded which is written in the form
		//of html
		//Every browser has some DOM api's which would read the particular browser-and keep placing
		//the elements as per the content written
		//Dom will be coming first, then the html and page will be coming later
		//Dom is just to place the WEs on the page and not to define the funtionality of WEs
		//Browser understands only html and it is the common language for browser appns
		
		//we hit the server only and only when we use the driver method=> driver.
		
		//1.how to create elements??
		//driver.findElement(By.id/name/classname)
		//id(); name(); classname();---are methods
		//driver.findElement() is helping to find/create the element on the page
		//followed by actions=> dot sendkeys()/click()
		
	    driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//create WebElement and perform action on it:
		//1.
//		driver.findElement(By.id("input-email")).sendKeys("veni@myyahoo.com");
//		driver.findElement(By.id("input-password")).sendKeys("EnPatiNagamma");
		
		//2.
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement passwd = driver.findElement(By.id("input-password"));
//		
//		email.sendKeys("veni@myyahoo.com");
//		pwd.sendKeys("input-password");
		
		//3.
//		By username = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		WebElement emailid = driver.findElement(username);
//		WebElement pwdid = driver.findElement(pwd);
//		
//		emailid.sendKeys("veni@myyahoo.com");
//		pwdid.sendKeys("EnPatiNagamma");
		
		//4.By locator with some utility:
//		By username = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		WebElement email4id = getElement(username);
//		WebElement pwd4id = getElement(pwd);
//		
//        email4id.sendKeys("veni@myyahoo.com");
//        pwd4id.sendKeys("EnPatiNagamma");
		
		//5.sendActions is repetitive in the previous approach-so Action utility also needed:
		//By locator with Element Util and Action util
		By username = By.id("input-email");
		By pwd = By.id("input-password");
		
		doSendKeys(username, "veni@myyahoo.com");
		doSendKeys(pwd, "EnPatiNagamma");
		
		//6. By locator and create a common utility class for elemets:
		//just like the BrowserUtility class, another ElementUtility class
		//which would be responsible for all the element creation and Actions on those elements
	
	}
      public static WebElement getElement(By locator) {
    	  return driver.findElement(locator);
      }
      
      public static void doSendKeys(By locator, String value) {
    	  getElement(locator).sendKeys(value);
      }
}
