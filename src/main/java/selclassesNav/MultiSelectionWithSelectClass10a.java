package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionWithSelectClass10a {
       /*
        * if select tag is available for any dr down -which has multiple attribute
        * then multiple selections is possible==> it is a multiple selection dr down 
        * -then use select object ref.multiple();
        * -which would give a boolean-true/false
        * 
        * -use just driver.FE because we want to interact with single select element
        * -and then interact with any no of multiple select elements
        * 
        * -this select class has a method getAllSelectedOptions()--which selects only
        * the selected options
        * 
        * -also has getAllOptions()---which selects all the options of the dr down
        * 
        * -it has getFirstSelectedOption() to select the first option
        * 
        */
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		
		WebElement drDownEles = driver.findElement(By.xpath("//select[@multiple]"));
		
		Select select =new Select(drDownEles);
		
		System.out.println(select.isMultiple());//true
		
		if(select.isMultiple()) {
			System.out.println("multiple select is possible");
			select.selectByVisibleText("American flamingo");
//			select.selectByVisibleText("Andean flamingo");
			
//			select.selectByVisibleText("Greater flamingo");
			select.selectByVisibleText("James's flamingo");
			select.selectByVisibleText("Lesser flamingo");
		}
		select.deselectByVisibleText("Lesser flamingo");
		select.deselectAll();

	}

}

