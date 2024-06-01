package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//HW:write the program to get the data from 2nd and 3rd column??
public class StaticWebTable13b {
    static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		
		System.out.println("totalrows="+(rowCount-1));
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[6]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		String beforeXpath = "//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		for(int row=2;row<=rowCount;row++) {
			String compXpath = beforeXpath+row+afterXpath;
			//System.out.println(compXpath);
			String text = driver.findElement(By.xpath(compXpath)).getText();
			System.out.println(text);
		}
		
		

	}

}
