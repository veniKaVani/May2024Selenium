package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartLoginTest5 {

	public static void main(String[] args) {
		
		BrowserUtility4 brUtil = new BrowserUtility4();
		WebDriver driver = brUtil.launchBrowser("edge");//123
		
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String title = brUtil.getPageTitle();
		System.out.println(title);
		
		By username = By.id("input-email");
		By pwd = By.id("input-password");
		
		MyElementUtility eleUtil = new MyElementUtility(driver);
		eleUtil.doSendKeys(username, "veni@myyahoo.com");
		eleUtil.doSendKeys(pwd, "EnPatiNagamma");
		
		brUtil.quitBrowser();

	}

}
