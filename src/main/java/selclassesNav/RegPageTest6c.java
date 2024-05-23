package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest6c {

	public static void main(String[] args) {

		BrowserUtility4 brUtil = new BrowserUtility4();

		WebDriver driver = brUtil.launchBrowser("edge");

		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// By locators Bank of RegPage:
		By fn = By.id("input-firstname");
		By ln = By.name("lastname");
		By email = By.id("input-email");
		By mob = By.xpath("//input[@name='telephone']");
		By pwd = By.xpath("//input[@name='password']");
		By pwdConfirm = By.xpath("//input[@name='confirm']");

		By subscribeYes = By.xpath("//input[@name='newsletter'and@value='1']");
		By subscribeNo = By.xpath("//input[@name='newsletter'and@value='0']");

		By privPolicy = By.name("agree");
		By continueBtn = By.cssSelector("input.btn.btn-primary");

		MyElementUtility eleUtil = new MyElementUtility(driver);
		eleUtil.doSendKeys(fn, "Juno");
		eleUtil.doSendKeys(ln, "Bell");
		eleUtil.doSendKeys(email, StringUtility.getRandomEmail());
		eleUtil.doSendKeys(mob, "5106740316");
		eleUtil.doSendKeys(pwd, "DingDong123");
		eleUtil.doSendKeys(pwdConfirm, "DingDong123");

		eleUtil.doClick(subscribeYes);
		eleUtil.doClick(privPolicy);
		eleUtil.doClick(continueBtn);

		if (brUtil.getPageUrl().contains("route=account/success")) {
			System.out.println("user registration - SUCCESSFUL");
		} else {
			System.out.println("user registration - FAILURE");
		}
		;

	}
}