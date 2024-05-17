package selclassesNav;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksConcept7 {

	public static void main(String[] args) {
		//1.total links
		//2.print the text of each link
		//3.avoid broken link
		//4.broken link--later
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//find out all the elements -->FEs
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//		ArrayList<String>allLinksTxt=new <String>ArrayList();
		System.out.println(allLinks.size());
		
		for(int i=0;i<allLinks.size();i++) {
			String txt = allLinks.get(i).getText();
	//		allLinksTxt.add(txt);
		}
 //      System.out.println(allLinksTxt);
	}

}
