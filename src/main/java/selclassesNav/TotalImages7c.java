package selclassesNav;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages7c {
	//WEBSCRAPPING mechanism: used to manipulate the pricing-by taking the prices of competitors 
    static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));		
		System.out.println("total images:"+imagesList.size());
		
		for(WebElement e:imagesList) {
			String altValue=e.getAttribute("alt");
			String srcValue=e.getAttribute("src");
			
			System.out.println(altValue+"  "+srcValue);//called web scrapping:fetching the images attrivalues
		}
		

	}

}
