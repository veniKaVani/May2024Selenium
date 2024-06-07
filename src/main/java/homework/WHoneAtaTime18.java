package homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WHoneAtaTime18 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String pwid = driver.getWindowHandle();
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[@target='_blank']"));
		int linksCount = allLinks.size();
		System.out.println(linksCount);
		
		for(WebElement e: allLinks) {
			e.click();
			String wid = driver.getWindowHandle();
			System.out.println("windowId:"+wid);
			System.out.println("windowUrl:"+driver.getCurrentUrl());
			
			if(!wid.equals(pwid)) {
				driver.close();
			}
		}
	}

}
