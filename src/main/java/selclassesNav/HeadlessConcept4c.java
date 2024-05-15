package selclassesNav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessConcept4c {

	public static void main(String[] args) {
		// headless: no browser visibility
		//headless vs headed
		//faster
		//run tcs on CI CD/Jenkins/Linux: can go headless
		//headless is not an actual user simulation
		//for complex mode of html DOM: heavily written - it might not work
		//alerts/popups: could be a problem
		
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--headless");
//		co.addArguments("--incognito");
//		WebDriver driver = new ChromeDriver(co);
		
		
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
//		fo.addArguments("--incognito");		
//		WebDriver driver = new FirefoxDriver(fo);
		
		EdgeOptions eo = new EdgeOptions();
//		eo.addArguments("--headless");
		eo.addArguments("--inprivate");
		WebDriver driver = new EdgeDriver(eo);
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println(driver.getTitle());
		
		driver.quit();
		

	}

}
