package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept15e {
	/*
	 * do not try drag and drop for external files ele to ele on the page --valid
	 * file on the page --NA
	 * 
	 * what kind of pattern r we using internally from lines 27 to 31 Answer:
	 * Builder pattern--java uses builder pattern internally all the lines from 27
	 * to 31 returns an action webEle ---if the user doesnot want to use all of
	 * these 3 actions-clickAndHold,drag,drop ---there is one more method provided
	 * called -DragAndDrop(src, target)---which is only one Action--since only
	 * single action--then dot perform()
	 * 
	 * --there r 2 -Actions and Action---both should be imported from Selenium
	 * import the Action class from selenium 
	 * Action: is an interface whereas
	 * Actions: is a class and we have to build 
	 * only build() is returning Action 
	 * whereas clickAndHold(), moveToElement() --r returning Actions
	 * 
	 * What is the difference between the two?? famous IQues
	 * Action: is an interface and who is returning the Action?? build() is returning the action
	 * what is the used case??I can collect it(action) and use it whenever I want to perform
	 * 
	 * Actions: is a class
	 * 
	 * 
	 */
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		WebElement srcEle = driver.findElement(By.id("draggable"));
		WebElement targetEle = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);
//		act
//		   .clickAndHold(srcEle)
//		         .moveToElement(targetEle)
//		                 .release()
//		                      .build().perform();

//		act.dragAndDrop(srcEle, targetEle).perform();

		Action action = act.clickAndHold(srcEle).moveToElement(targetEle).release().build();
		action.perform();

	}

}
