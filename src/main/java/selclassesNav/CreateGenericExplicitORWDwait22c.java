package selclassesNav;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateGenericExplicitORWDwait22c {
	/**
	 * What is the diff between visibility of an element And Presence of an
	 * element?? Both are different 
	 * 
	 *  An expectation for checking that an element
	 * is present on the DOM of the page This does not necessarily mean that the
	 * element is visible
	 * @param locator
	 * @param timeout
	 * @return
	 * 
	 * IS RISKY: because sometimes the element even if present on the DOM is hidden and
	 * not visible
	 * 
	 */

	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * and is visible Visibility means that the element is not only displayed but
	 * also has a height and width that is greater than 0
	 * @param locator
	 * @param timeout
	 * @return
	 */
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");

		By fullName = By.id("Form_getForm_Name");
		By busEmail = By.id("Form_getForm_Email");

//		waitForElementPresence(fullName, 10).sendKeys("testing");
//		waitForElementPresence(busEmail, 5).sendKeys("test@gmail.com");
		
		waitForElementVisible(fullName, 11).sendKeys("testing");
		waitForElementVisible(busEmail, 5).sendKeys("test@gmail.com");

	}
    /**
     * 
	 * An expectation for checking that an element
	 * is present on the DOM of the page This does not necessarily mean that the
	 * element is visible
     * @param locator
     * @param timeOut
     * @return
     */
	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * and is visible Visibility means that the element is not only displayed but
	 * also has a height and width that is greater than 0
	 * @param locator
	 * @param timeout
	 * @return
	 */

	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
