package selclassesNav;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTable12c {
	/*
	 * if u apply the dot text on the parent tag, it will give the text of the child tag as well
	 */
    static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/women-s-premier-league-2023-24-1411373/delhi-capitals-women-vs-up-warriorz-women-4th-match-1417719/full-scorecard");
		
//		String wkt_Taker = driver.findElement(By.xpath("//span[text()='Dinesh Vrinda']/ancestor::td/following-sibling::td//span")).getText();
//		System.out.println(wkt_Taker);
		
		System.out.println(getWicketTakerName("Dinesh Vrinda"));
		System.out.println(getWicketTakerName("Grace Harris"));
		
		System.out.println(getScoreCard("Dinesh Vrinda"));
		System.out.println(getScoreCard("Grace Harris"));

	}
  public static  String getWicketTakerName(String batsmanName) {
	  return
	  driver.findElement(By.xpath("//span[text()='"+batsmanName+"']/ancestor::td/following-sibling::td//span/span"))
	      .getText();
	  
  }
  public static List<String> getScoreCard(String batsmanName) {
	  List<WebElement> scoreCardEles = driver.findElements(By.xpath("//span[text()='"+batsmanName+"']/ancestor::tr//td[contains(@class,'ds-text-right')]"));
	  List<String> scoreCardList = new ArrayList<String>();
	  
	  for(WebElement e:scoreCardEles) {
		  String txt = e.getText();
		  scoreCardList.add(txt);
	  }
	  return scoreCardList;
  }
}
