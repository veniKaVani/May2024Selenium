package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public static void main(String[] args) {
		BrowserUtility4 brUtil = new BrowserUtility4();

		WebDriver driver = brUtil.launchBrowser("chrome");
		
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//By locators Bank:
		By username=By.id("input-email");
		By pwd = By.name("password");
		
		By submitBtn=By.cssSelector("input.btn.btn-primary");
		
		By successMesg = By.tagName("h2");
		
		MyElementUtility eleUtil = new MyElementUtility(driver);
		eleUtil.doSendKeys(username, "JunoB@123.com");
		eleUtil.doSendKeys(pwd, "DingDong123");
		
		eleUtil.doClick(submitBtn);
		
		String loginSuccess = eleUtil.doGetElementText(successMesg);
		
		if(loginSuccess.contains("My Account")) {
			System.out.println("login-SUCCESS");
		}else {
			System.out.println("login-FAILURE");
		}
		
		driver.close();

	}

}
