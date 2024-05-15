package sel118classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select73 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		List<WebElement> dateList = driver.findElements(By.id("u_0_l_dJ"));
		
		WebElement day = driver.findElement(By.id("day"));
		day.clear();
		WebElement month = driver.findElement(By.id("month"));
		month.clear();
		WebElement year = driver.findElement(By.id("year"));
		year.clear();
		
		Select sel1 = new Select(day);
		sel1.selectByVisibleText("27");
		
		Select sel2 = new Select(month);
		sel2.selectByVisibleText("June");
		
		Select sel3 = new Select(year);
		sel3.selectByVisibleText("1969");
		
		
		
		

	}

}
