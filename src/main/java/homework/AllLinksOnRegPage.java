package homework;

import org.openqa.selenium.WebDriver;

import selclassesNav.BrowserUtility4;

public class AllLinksOnRegPage {

	public static void main(String[] args) {
		BrowserUtility4 brUtil = new BrowserUtility4();
		WebDriver driver = brUtil.launchBrowser("edge");
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//By locator: for all links on reg page to be fetched
		

	}

}
