package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators19a {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * selenium 4.x:
		 * 
		 * 
		 *              above of ele
		 *                  |
		 * left of ele <---ele--->right of ele
		 *                  |
		 *  near of ele     below of ele
		 * 
		 * 
		 * ------------------------------------------
		 * relative: neighbors of the specific ele
		 * new feature added in sel 4.x
		 * 
		 * the first target when applying the rel locator concept: is what is the base element??
		 * from the base ele--need to traverse left, right, above and below
		 * 
		 * when writing the rel locators: use with() instead of By.
		 * with(by) is not coming from sel
		 * with(By by) is a static method and also have to do this static import:
		 * purpose of static import:==>i am already aware i have to use rel locator as class
		 * and with is a method 
		 * and now i do not need to write RelativeLocator.with(by)
		 * I can directly write with 
		 * 
		 * import static org.openqa.selenium.support.locators.RelativeLocator.with;
		 * 
		 * for nearest ele: it will CLOSE_IN_PIXELS=50;
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(4000);
		
		WebElement baseEle = driver.findElement(By.linkText("Boucherville, Canada"));
//		driver.findElement(RelativeLocator.with(by))
		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(baseEle)).getText();
		System.out.println(leftRank);

		String rightNo = driver.findElement(with(By.tagName("p")).toRightOf(baseEle)).getText();
		System.out.println(rightNo);
		
		String aboveCity = driver.findElement(with(By.tagName("p")).above(baseEle)).getText();
		System.out.println(aboveCity);
		
		String belowCity = driver.findElement(with(By.tagName("p")).below(baseEle)).getText();
		System.out.println(belowCity);
		
		String nearEle = driver.findElement(with(By.tagName("p")).near(baseEle)).getText();
		System.out.println(nearEle);
		

	}

}
