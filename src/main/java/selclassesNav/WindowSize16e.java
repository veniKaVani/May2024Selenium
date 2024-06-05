package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize16e {

	public static void main(String[] args) {
		/*
		 * WindowSize:==>the specific window size the user wants to open these r called:
		 * view port size tests
		 * 
		 * Dimension: is a class--pick the one coming from selenium lib Usedcase: these
		 * kind of testings r called: responsive-view ports
		 * 
		 * Right click on any webApp and when u inspect --there is one icon on Tool bar
		 * on inspect window--ToggleDevicetoolbar--click on this--u will get the
		 * Dimensions from here for all diff devices
		 * 
		 * Infact in the chrome dev tools: u can create ur own device how: click on
		 * Dimensions:responsive drop down - click on edit-Add custom device give ur own
		 * height and width ...
		 * 
		 * getLocation()--gives the exact location of the ele from the top left hand side 
		 * on the page
		 */
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		// driver.manage().window().fullscreen();

		Dimension dim = new Dimension(414, 896);
		driver.manage().window().setSize(dim);

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
		// sel 4.x
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		
		WebElement fn = driver.findElement(By.id("input-firstname"));
		System.out.println(fn.getCssValue("font-size"));
		
		int ht = fn.getSize().getHeight();
		int wd = fn.getSize().getWidth();
		
		System.out.println(ht);
		System.out.println(wd);
		
		int xcoordinate = fn.getLocation().getX();
		int ycoordinate = fn.getLocation().getY();
		
		System.out.println(xcoordinate);
		System.out.println(ycoordinate);
		
		WebElement continueBtn = driver.findElement(By.xpath("//input[@value='Continue']"));
		String bk_color = continueBtn.getCssValue("background-color");
		System.out.println(bk_color);
		

	}

}
