package selclassesNav;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

public class TotalLinksConcept7 {

	public static void main(String[] args) {
		//1.total links
		//2.print the text of each link
		//3.avoid broken link
		//4.broken link--later
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//find out all the elements -->FEs
		//LIST: is order based and parent interface of ArrayList--comes from java.util
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		for(int i=0;i<allLinks.size();i++) {
			String txt = allLinks.get(i).getText();
			
			if(txt.length()!=0) {
				System.out.println(txt);
			}
			
		}
        System.out.println("********");
        
        for(WebElement e:allLinks) {
        	String text = e.getText();
        	if(text.length()!=0) {
        		System.out.println(text);
        	}
        }
        //total text fields on the Reg page:
        List<WebElement> allTxtFields = driver.findElements(By.className("form-control"));
        
        System.out.println(allTxtFields.size());
        
        for(WebElement e:allTxtFields) {
        	e.sendKeys("testing");
        }
        driver.close();
	}

}
