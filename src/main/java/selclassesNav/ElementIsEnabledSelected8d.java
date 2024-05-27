package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsEnabledSelected8d {
    static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		
		boolean f1 = driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(f1);
		boolean f2 = driver.findElement(By.name("agreeTerms")).isDisplayed();
		System.out.println(f2);
		
		boolean flag = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(flag);//false
		
		boolean chk_flag = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(chk_flag);
		
		driver.findElement(By.name("agreeTerms")).click();
		
	    chk_flag = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(chk_flag);
		
		flag=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(flag);//true
		/*
		 * diff between isDisplayed() and isEnabled()
		 * isDisplayed --element is present on the page
		 * isEnabled --element is obv present on the page but its enabled or not
		 */

	}

}
