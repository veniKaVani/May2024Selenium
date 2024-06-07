package homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildWinOneAtATime18c {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String pwid = driver.getWindowHandle();
		System.out.println("parent window handle:"+pwid);
		
		//collecting all the footer links:linkedin,facebook,twitter,youtube,
		List<WebElement> footerLinkList = driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']/a"));
		int linksListSize = footerLinkList.size();
		System.out.println(linksListSize);
		
		//Traversing to child windows one at a time and coming back to parent:
		for(WebElement e:footerLinkList) {
			String linkTxt = e.getText();
			System.out.println(linkTxt);
		}
		
		
		
		
//		for(int i=0;i<linksListSize;i++) {
//			
//			driver.findElement(By.xpath("//a[contains(@href,'linkedin')")).click();
//			String chwid1 = driver.getWindowHandle();
//			System.out.println("child window1 url:"+driver.getCurrentUrl());
//			System.out.println("child window1 title"+driver.getTitle());
//			if(!chwid1.equals(pwid)) {
//				driver.close();
//			}
//			
//			driver.findElement(By.xpath("//a[contains(@href,'facebook')")).click();
//			String chwid2 = driver.getWindowHandle();
//			System.out.println("child window2 url:"+driver.getCurrentUrl());
//			System.out.println("child window2 title"+driver.getTitle());
//			if(!chwid2.equals(pwid)) {
//				driver.close();
//			}
//			
//			driver.findElement(By.xpath("//a[contains(@href,'twitter')")).click();
//			driver.findElement(By.xpath("//a[contains(@href,'facebook')")).click();
//			String chwid3 = driver.getWindowHandle();
//			System.out.println("child window3 url:"+driver.getCurrentUrl());
//			System.out.println("child window3 title"+driver.getTitle());
//			if(!chwid3.equals(pwid)) {
//				driver.close();
//			}
//			
//			driver.findElement(By.xpath("//a[contains(@href,'youtube')")).click();
//			driver.findElement(By.xpath("//a[contains(@href,'facebook')")).click();
//			String chwid4 = driver.getWindowHandle();
//			System.out.println("child window4 url:"+driver.getCurrentUrl());
//			System.out.println("child window4 title"+driver.getTitle());
//			if(!chwid4.equals(pwid)) {
//				driver.close();
//			}
//			
//		}
//		

	}

}
