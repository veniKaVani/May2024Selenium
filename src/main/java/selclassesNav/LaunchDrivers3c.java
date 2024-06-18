package selclassesNav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDrivers3c {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//open browser:123
		driver.get("https://www.google.com");//enter url: 123
		String title = driver.getTitle();
		System.out.println("page title:"+title);
		
		String url = driver.getCurrentUrl();//123
		System.out.println(url);
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");//enter url: 456
		String title1= driver.getTitle();//get title: 456
		System.out.println("page title:"+title);//456
		
		driver.quit();

	}

}
