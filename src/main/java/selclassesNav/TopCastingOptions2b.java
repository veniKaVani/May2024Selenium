package selclassesNav;

import org.openqa.selenium.chrome.ChromeDriver;

public class TopCastingOptions2b {

	public static void main(String[] args) {
		// 1. WD d = new CD();
		//valid--recommended **************************MORE PREFERABLE*********industryIsFollowing
		//WebDriver driver = new ChromeDriver();
		
		//2. SC driver = new CD();
		//valid -- not recommended
		//SearchContext driver = new ChromeDriver();
		
		//3. RWD driver = new CD();
		//valid --recommended
		//RemoteWebDriver driver = new ChromeDriver();
		
		//we always prefer the topcasting between the interface and the lower class*********
		//since tomorrow some other new browser classes are coming
		
		//4.
		//ChromiumDriver driver = new ChromeDriver();
		//valid --but not recommended since this topcasting doesnot support ff and safari
		
		//5.
		//WD driver = new RWD();
		//valid -- recommended
		//run tests on the remote/server/cloud machine/grid/sauce labs/browserstack/lambdatest
		//WebDriver driver = new RemoteWebDriver(serverURL, capabilities);
		
		//6.
		//SearchContext driver = new RemoteWebDriver(serverURL, capabilities);
		
		//7.CD driver = new ChromeDriver();
		//valid but works only for chrome browser--works for single browser requirement
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
		
		
		
		

	}

}
