package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue8c {
        static WebDriver driver;
	public static void main(String[] args) {
		/*
		 * Scenario: entering the username manually on Login page of opencart
		 * and programatically retrieving the entered value using the value property of 
		 * DOM
		 * 
		 * cannot apply the getText() method on text fields to retrieve the value entered 
		 * 
		 */
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		
//		String email = driver.findElement(By.id("input-email")).getText();
//		System.out.println(email);//blank nothing printed on console
		
		//getText():can be applied to those fields where actual text is available like
		// a link, header, a label,span, 
		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		//when u inspect this field after the value gets entered--u see a 'value' attribute
		//only the key is present and no value pair seen on dom
		//to fetch this value attribute--need to use getAttribute(value){}
	   String valueAttriTxt = driver.findElement(By.id("input-email")).getAttribute("value");
	   System.out.println(valueAttriTxt);
		

	}

}
