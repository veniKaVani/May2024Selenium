package selclassesNav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowConcept18d {

	public static void main(String[] args) {
		/*
		 * WindowType: is an enum
		 * represents the type of new browser window/Tab that may be created
		 * (enum is a special datatype which can maintain n no. of constants)
		 * with 2 options windowType.Tab  & windowType.window
		 * 
		 * NEW FEATURES OF sel 4.x seen so far:
		 * 1. newWindow(windowType.TAB), newWindow(windowType.window)
		 * 2. Relative locators
		 * 3. HasAuthentication()
		 * 4. Actions Scroll
		 * 5. selenium Manager
		 * 
		 * 
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String pwid = driver.getWindowHandle();
		
		//sel 4.x:
//		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
//		driver.close();
		
		driver.switchTo().window(pwid);
		System.out.println(driver.getTitle());
		

	}

}
