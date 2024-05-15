package sel118classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelClass73b {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-elements/");
		
		WebElement drDown1 = driver.findElement(By.xpath("//li[contains(text(),'Item 1')]"));
		System.out.println(drDown1.getText());

	}

}
