package seleniumoldseries118;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpLoadPopUpHandle6b {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.name("fileupload")).sendKeys("C://Users//bkarn//Desktop//TestData//Fup.txt");

	}

}
