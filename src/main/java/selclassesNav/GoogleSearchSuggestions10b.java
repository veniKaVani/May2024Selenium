package selclassesNav;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
  /*
   * HW: on grow.in send the searchKey as HDFC Bank and then write a generic code for
   * finding the search value
   */
public class GoogleSearchSuggestions10b {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

//	  driver.findElement(By.name("q")).sendKeys("selenium");
//	  
//	  Thread.sleep(3000);

		By gSearchField = By.name("q");
		By suggestions = By.xpath("//ul[@class='G43f7e' and @role='listbox']//div[@class='wM6W7d']/span");
		
//		doSearchGoogle(gSearchField, suggestions, "NaveenAutomationLabs","playwright");
		doSearchGoogle(gSearchField, suggestions, "NaveenAutomationLabs","java");

		// ul[@class='G43f7e' and @role='listbox']//div[@class='wM6W7d']/span

//	  List<WebElement> suggsList = driver.findElements(By.xpath("//ul[@class='G43f7e' and @role='listbox']//div[@class='wM6W7d']/span"));
//	  
//	  System.out.println(suggsList.size());
//	  
//	  for(WebElement e: suggsList) {
//		  String text = e.getText();
//		  System.out.println(text);
//		  
//		  if(text.contains("python")) {
//			  e.click();
//			  break;
//		  }
//	  }

	}

	public static void doSearchGoogle(By searchlocator, By searchSuggestions,String searchKey, String value) throws InterruptedException {

		driver.findElement(searchlocator).sendKeys(searchKey);

		Thread.sleep(3000);

		List<WebElement> suggsList = driver
				.findElements(searchSuggestions);

		System.out.println(suggsList.size());

		for (WebElement e : suggsList) {
			String text = e.getText();
			System.out.println(text);

			if (text.contains(value)) {
				e.click();
				break;
			}
		}
	}
}
