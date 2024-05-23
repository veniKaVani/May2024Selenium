package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept7b {
	static WebDriver driver;
	public static void main(String[] args) {
		//text-->get text();
		//attribute-->getAttribute()
		
		//get all the links
		//capture href value
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		String fn_placeholder = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//		String fn_text = driver.findElement(By.id("input-firstname")).getAttribute("text");
//		String fn_name = driver.findElement(By.id("input-firstname")).getAttribute("name");
//		
//		System.out.println(fn_placeholder);
//		System.out.println(fn_text);
//		System.out.println(fn_name);
		
		By fn = By.id("input-firstname");
		By regLink = By.linkText("Register");
		
		String fn_placeholder = doGetEleAttribute(fn,"placeholder");
		System.out.println(fn_placeholder);
		String fn_type = doGetEleAttribute(fn,"type");
		System.out.println(fn_type);
		String fn_name = doGetEleAttribute(fn, "name");
		System.out.println(fn_name);
		
		String href_Attri = doGetEleAttribute(regLink,"href");
		System.out.println(href_Attri);
		
		driver.close();
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
    //creating a utility method for getting the attributes and later moving it to element Utility-generic class
	public static String doGetEleAttribute(By locator, String attriName) {
		return getElement(locator).getAttribute(attriName);
	}
}
