package selclassesNav;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWinHandling18b {
    //The Bug is that unnecessarily the parent window is getting closed--how do u fix it
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String pwid = driver.getWindowHandle();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')")).click();
		
		//fetch window ids:
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			String wid = it.next();
			driver.switchTo().window(wid);
			System.out.println("window url:"+driver.getCurrentUrl());
			
			if(!wid.equals(pwid)) {
				driver.close();
			}
					
			Thread.sleep(1000);
		}
		
		driver.switchTo().window(pwid);
		System.out.println(driver.getCurrentUrl()+""+driver.getTitle());

	}

}
