package selclassesNav;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import allexceptions.BrowserException;

/**
 * 
 * @author bkarn
 *
 */

public class BrowserUtility4 {
	
	WebDriver driver;
	/**
	 * this method is used to initialize the driver on the basis of given browser
	 * @param browserName
	 * @return this returns driver
	 */
	
	public WebDriver launchBrowser(String browserName) {
		System.out.println("browser name: "+browserName);
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();  //USING TOP CASTING
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("plz pass the correct browser"+browserName);
			throw new BrowserException("BROWSER NOT FOUND!...");
		}
		return driver;
	}
  public void launchUrl(String url) {
	  //applying null chk incase url is blank/null:
	  if(url==null) {
		  throw new BrowserException("URL IS NULL!....");
	  }
	  
	  if(url.indexOf("http")==0) {
		  driver.get(url);
	  }
	  else {
		  throw new BrowserException("HTTP IS MISSING IN URL");
	  }
  }
  //overloading the launchUrl with URL param:
  public void launchUrl(URL url) {
	  //applying null chk incase url is blank/null:
	  if(url==null) {
		  throw new BrowserException("URL IS NULL!....");
	  }
	  String appUrl=String.valueOf(url);
	  if(appUrl.indexOf("http")==0) {
		  driver.navigate().to(url);;
	  }
	  else {
		  throw new BrowserException("HTTP IS MISSING IN URL");
	  }
  }
  
  public String getPageTitle() {
	 return driver.getTitle();
  }
  public String getPageUrl() {
	  return driver.getCurrentUrl();	  
  }
  public void quitBrowser() {
	  driver.quit();
  }
}
