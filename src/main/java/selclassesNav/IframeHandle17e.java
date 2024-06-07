package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandle17e {
	
	//getting NoSuchElementException on line 31--cannot find the iframe --NEED TO CHK AGAIN

	public static void main(String[] args) throws InterruptedException {
		/*
		 * if <img> for any web app after rightclick inspect form --u have to click on that input form then 
		 * it(image) will convert into  a complete form
		 * eg: vehicle registration
		 * 
		 * if iframe name or int index no is not available--then u can treat iframe as a WebElement and create
		 * an xpath to find it on The Dom 
		 * soo u can write
		 * driver.switchTo().iframe(driver.findElement(By.xpath("xpath")))
		 */
		WebDriver driver = new ChromeDriver();
		
		//page:
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		Thread.sleep(3000);
		
		//need to click on img so the form appears: to be filled
		driver.findElement(By.cssSelector("div#imageTemplateContainer img")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		driver.findElement(By.name("RESULT_TextField-8")).sendKeys("Dexter");
		
		driver.switchTo().defaultContent();
		
		
		

	}

}
