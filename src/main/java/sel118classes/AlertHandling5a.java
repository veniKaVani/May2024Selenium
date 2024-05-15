package sel118classes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling5a {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement submitBtn = driver.findElement(By.xpath("proceed"));
		
//		Alert alert=driver.findElement(By.xpath("proceed")).click();

	}

}
