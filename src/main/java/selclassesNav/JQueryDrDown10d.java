package selclassesNav;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDrDown10d {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		
		Thread.sleep(2000);
		
//		driver.findElement(By.id("justAnInputBox")).click();
//		Thread.sleep(2000);
//		
//		List<WebElement> choicesList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));//44
//		
//		System.out.println(choicesList.size());
//		
//		for(WebElement e:choicesList) {
//			String text = e.getText();
//			System.out.println(text);
//			
//			if(text.equals("choice 1")) {
//				e.click();
//				break;
//			}
//		}
		By drDown = By.id("justAnInputBox");
		By choices = By.xpath("//span[@class='comboTreeItemTitle']");
		
		//1. tc_01: single selection
		selectChoice(drDown,choices,"choice 1");
		
		//2. tc_02: multi-selection: using 3 dots OR spread param ==> String...
		//which makes the String...value ---behave like an array that takes a String, StringBuilder,
		//StringBuffer
		//changing the 3rd param in the generic to String... and then here passing more than one param for 3rd
//		selectChoice(drDown,choices,"choice 1","choice 3");
		
		
	}
  public static void selectChoice(By drdownlocator, By choices, String... value) throws InterruptedException {
	  
	  driver.findElement(drdownlocator).click();//dr down locator
		Thread.sleep(2000);
		
		List<WebElement> choicesList = driver.findElements(choices);//44
		//choices
		System.out.println(choicesList.size());
		
		for(WebElement e:choicesList) {
			String text = e.getText();
			System.out.println(text);
			
			//iterating the String... array one more time to fetch the values of array and putting the if()
			//inside the for loop and remove the break statement
			for(String val:value) {
			if(text.equals(value)) {
				e.click();
				
			}
			}
		}
	  
  }
}
