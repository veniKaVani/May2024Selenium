package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategy6b {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//1.id:unique attribute: cannot be duplicate
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//2.name:can be duplicate
//		driver.findElement(By.name("firstname")).sendKeys("test");
//		driver.findElement(By.name("lastname")).sendKeys("automation");
		
//		By fn = By.name("firstname");
//		By ln = By.name("lastname");
//		
//		MyElementUtility eleUtil = new MyElementUtility(driver);
//		eleUtil.doSendKeys(fn, "Veni");
//		eleUtil.doSendKeys(ln, "Karnam");
		
		//3.class name:its not a unique attribute can be duplicate
		//when u inspect all the fields on Registration form -has a common class= form-control
		//==>all the fields have the common class name--css is defined in the form of class
		//so all the fields look similar
		//only 3 different attribute methods are available-id, name, classname
//		driver.findElement(By.className("form-control")).sendKeys("testing");
		
		//4. if id, classname, name not available--then go with xpath-->xmlpath
		//xpath: is not attribute BUT is the address of the webelement in DOM
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("testing");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("automation");
		
//		By fn = By.xpath("//*[@id=\"input-firstname\"]");
//		By ln = By.xpath("//*[@id=\"input-lastname\"]");
//		MyElementUtility eleUtil = new MyElementUtility(driver);
//		eleUtil.doSendKeys(fn, "Veni");
//		eleUtil.doSendKeys(ln, "Karnam");
		
		//5.css:cascaded style sheet:its not an attribute: it works on styling of the element
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("testing");
//		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("automation");
		
		//6.linktext: only applicable for links
		//html dom:<a> tag=>anchor tag==>it is a link
//		driver.findElement(By.linkText("Login")).click();
		
//		By loginLink = By.linkText("Login");
//		MyElementUtility eleUtil = new MyElementUtility(driver);
//		eleUtil.doClick(loginLink);
		
		//7.partialLinkText:only for links:for the partial text of the link--select a unique text
//		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//Forgotten username
		//Forgotten password
		
		//8.tagname:html tag --tag names are not at all unique
		//all links -have <a> all input fields have <input>
//		String header = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(header);
		
		By pageHeader = By.tagName("h1");
		MyElementUtility eleUtil = new MyElementUtility(driver);
		String header = eleUtil.doGetElementText(pageHeader);
		System.out.println(header);

		
	}

}
