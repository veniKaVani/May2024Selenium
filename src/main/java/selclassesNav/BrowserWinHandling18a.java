package selclassesNav;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWinHandling18a {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * BrowserPopUp:egs: social media links on any web page--opens to a new browser window/a new
		 * tab
		 * the property/attribute target=_blank 
		 * it opens in a new tab
		 * 
		 * when u open multiple browser window popups: then use quit() to close all of them in
		 * one shot
		 * If u want to close one particular window popUp-then u have to use close()
		 * 
		 * driver.getwindowHandles() returns set of String NOT list of String
		 * one for the parent window and one id for child window
		 * the window ids are always and always unique
		 * the window ids cannot be duplicate
		 * 
		 * ITERATOR: is an interface
		 * iterator ref (it) is pointing just above the object above both(pwindow, and child win)
		 * need to shift the it to the  
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
		//1st:fetch the window ids:
		Set<String> handles = driver.getWindowHandles();
		
		//how to iterate since set is not order/index based:so need to use iterator()-gives iterator of string
		Iterator<String> it = handles.iterator();
		
		String pwid = it.next();
		System.out.println("parent window id:"+pwid);
		
		String chwid = it.next();
		System.out.println("child window id:"+chwid);
		
		//2nd:switching work
		driver.switchTo().window(chwid);
		System.out.println("child window url:"+driver.getCurrentUrl());
		
		driver.close();
		
		driver.switchTo().window(pwid);
		System.out.println("parent window url:"+driver.getCurrentUrl());
		
		driver.quit();
		
		
		

	}

}
