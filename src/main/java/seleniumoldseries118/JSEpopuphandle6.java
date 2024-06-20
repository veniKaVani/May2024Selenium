package seleniumoldseries118;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import sel118classes.AlertHandling5a;

public class JSEpopuphandle6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();// click on signin Btn
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
	//	alert.dismiss();  //no cancel btn here on this popup

	}

}
