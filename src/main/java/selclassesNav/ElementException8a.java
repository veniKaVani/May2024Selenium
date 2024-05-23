package selclassesNav;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * ELEMENT EXCEPTION:-how exactly sel will behave when element is not there=>wrong locator case?
 * entering the wrong locator for the search field--on console says
 * Exception in thread "main" org.openqa.selenium.NoSuchElementException:and in red
 * no such element: Unable to locate element: {"method":"css selector","selector":"*[name='search111']"}
  (Session info: chrome=124.0.6367.208)
 * @author bkarn
 *this is a new change in sel--that whatever the locator-id/name--internally sel is always creating
 *a new css selector
 *-it is sel strategy that whatever the locator user passed name/id -internally it would create
 *a css selector--and says internally with the css selector syntax-it could not find the ele
 *
 *BUT if you used xpath--it would not convert it but would use the same to find it on the Dom structure
 *
 *trying the same scenario--finding the element using tagname-But giving the wrong locator
 *there is no exception thrown BUT says the size is 0
 *WARNING: Unable to find an exact match for CDP version 124, returning the closest version; 
 *found: 122; Please update to a Selenium version that supports CDP version 124 0
 *
 *this is another diff between findElement() and findElements()
 *==>if driver is unable to findElement()--it throws NoSuchElement Exception  --whereAs
 *if driver is unable to findElements()---it is saying the size is 0==>it throws empty ArrayList
 *if you try to print the elements directly on the console--it will print blank/empty ArrayList-[]
 *
 *REMEMBER THIS DIFF: very imp 
 *if findElement() is a failure--NoSuchElement Exception
 *if findElements() is a failure--returns an empty array List on the console
 *
 *SOO EXCEPTION HANDLING needs to be applied for these generic methods/fns in the ElementUtility 
 *we created soo far  ==>getElement(By locator){}
 *and for getElements(By locator){}
 *
 *so going back to MyElementUtility class

 */

public class ElementException8a {
    static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		//inspecting the search field and entering some value for it after finding/creating the search
		//ele and providing the wrong locator search111
//		driver.findElement(By.name("search111")).sendKeys("macbook");//NoSuchElement Exception
		
		//checking the exception thrown on console:
		//NoSuchElement Exception
		
		List<WebElement> binEles = driver.findElements(By.tagName("BinAuto"));
		System.out.println(binEles.size()); //0
		//now checking the exception thrown on console and also println statement output on console
		System.out.println(binEles);  //[]

	}

}
