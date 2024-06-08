package selclassesNav;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyJavascriptUtility {
	
	/*
	 *  same as for element Utility
	 * 1. private webDriver driver
	 * 2. public constructor --using this key word to get the driver of the same class
	 * 3. public class methods 
	 * 
	 * 
	 */
	
	private WebDriver driver;
	
	public MyJavascriptUtility(WebDriver driver) {
		this.driver=driver;
	}
	public void flash(WebElement element) {
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i=0;i<10;i++) {
			changeColor("rgb(0,200,0)",element);
			changeColor(bgcolor,element);
		}
	}
	private void changeColor(String color, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
		
	}

}
