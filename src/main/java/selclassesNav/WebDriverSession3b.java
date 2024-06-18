package selclassesNav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSession3b {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		System.out.println("page title is:"+title);

		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//driver.close(); //browser is closed
		//session is invalid with the same session id://NoSuchElementException:invalid session id
		
		driver.quit();//browser is closed
		//NoSuchElementException: Session ID is null. Using WebDriver after calling quit()?
		
		//sid = null
		
		driver = new ChromeDriver();//open browser: new session id = 456
		driver.get("https://www.google.com");//enter url:456
		
		System.out.println(driver.getTitle());//456
		//chromeDriver: chrome on mac(null)

	}

}
