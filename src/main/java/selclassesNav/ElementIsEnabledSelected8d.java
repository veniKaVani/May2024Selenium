package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsEnabledSelected8d {
    static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		
		boolean flag = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(flag);//false
		
		driver.findElement(By.name("agreeTerms")).click();
		
		flag=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(flag);//true

	}

}
