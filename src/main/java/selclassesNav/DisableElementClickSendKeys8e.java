package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElementClickSendKeys8e {
     static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
//		driver.findElement(By.id("pass")).click();//no exception	
//		
//		driver.findElement(By.id("pass")).sendKeys("testing");//ElementNotInteractableException
		
//		driver.findElement(By.id("fname")).sendKeys(null);//IllegalArgumentException: Keys to send should be a not null CharSequence
        
//		driver.findElement(By.id("fname")).sendKeys("null");//since null is string--it got entered
		
		/*
		 * sendKeys(CharSequence...KeysToSend)
		 * CHAR SEQUENCE: Is already a class/interface in Java
		 * All 3 -String, StringBuilder,StringBuffer,--are children of CHAR SEQUENCE
		 *  ...=>3 dot parameters--=>is an Array
		 *  
		 *  CharSequence--interface
		 *  String, SBuilder, SBuffer
		 */
		
		StringBuilder sb = new StringBuilder("testing");
		String s = "automation";
//		driver.findElement(By.id("fname")).sendKeys(sb+s);
		
		driver.findElement(By.id("fname")).sendKeys(sb, s, "naveen");
		
		
	}

}
