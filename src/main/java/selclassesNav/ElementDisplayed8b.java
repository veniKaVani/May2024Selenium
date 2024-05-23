package selclassesNav;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed8b {
    //how to figure out that this particular class is unique??
	//ctrl+F on inspect DOM ---then type dot+classname=> .classname
	//check on the RHS corner for 1x1 if not then it is not unique
	//inspecting the logo of any web page--is the scenario
	/*
	 * LIMITATION: of isDisplayed()--if the loc is wrong and the fn cannot find the ele
	 * it will throw NSE exception BUT would never return the boolean flag as false
	 * --it is not reaching the ele--but before at the point of creation of ele--it is 
	 * giving NSE exception
	 */
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		boolean flag=driver.findElement(By.className("img-responsive11")).isDisplayed();//NSE
//		System.out.println(flag);	
//		if(flag) {
//			System.out.println("logo is displayed");
//		}else {
//			System.out.println("logo is not displayed");
//		}
		//By locator Bank:
//		By logo = By.className("img-responsive");
//		if(isElementDisplayed(logo)) {
//			System.out.println("logo-displayed");
//		}
     //using findEs fn instead of findE():can be used only for single element
//		List<WebElement> logoImgs = driver.findElements(By.className("img-responsive11"));
//		
//		if(logoImgs.size()==1) {
//			System.out.println("logo is displayed");
//		}else {
//			System.out.println("logo is not displayed");
//		}
		
		//created a generic fn for the above code as well-isElementExist(locator){};chking it
		By logo = By.className("img-responsive");
		if(isElementExist(logo)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
	}
	public static boolean isElementExist(By locator) {//MOVING IT TO eLEuTIL
	   if(getElements(locator).size()==1) {
		 return true;  
	   }
	   return false;
	}
	private static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	//creating a generic fn to chk isDisplayed() for any ele-and moving it to ElementUtility
	public static boolean isElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

}
