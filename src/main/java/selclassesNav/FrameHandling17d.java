package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling17d {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * What is Frame??
		 * is a webElement 
		 * and the frame also has its own DOM structure
		 * 
		 * what is the hierarchy??
		 * Browser -- Page -->on the page multiple elements + Frames(on the frame-more eles)
		 * 
		 * if the element is on frame: then user has to switch on to the frame to handle it
		 * and then to handle the eles not on frame--switch back from frame on to the web page
		 * 
		 * HTML: this tag means it is a web page
		 * if frame exists inside html tag==>the frame is on web page--and u need to switch to it-to
		 * handle we's on it
		 * a frame has its own #Document and a web page also has its own #Document
		 * 
		 * Frame is part of html body and not the head
		 * Just like frame iframe is also another html tag
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("binduk7");
		driver.findElement(By.name("password")).sendKeys("Orange@123");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(1500);
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.linkText("CONTACTS")).click();
	}

}
