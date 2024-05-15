package sel118classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPup5b {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/?s=fileupload");
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("C:\\Users\\bkarn\\Desktop\\TestFolder");
		
		

	}

}
