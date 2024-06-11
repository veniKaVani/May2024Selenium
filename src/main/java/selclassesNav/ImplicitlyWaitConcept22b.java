package selclassesNav;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept22b {
     //What is implicitly wait and why we should not use this wait
	public static void main(String[] args) {
	/*
	 * the striked line means the method is deprecated
	 * so it was in use until sel 3
	 * now from sel 4: we have to use duration method
	 * 
	 * implicitly wait: is global wait -it is applied by default to all the eles
	 * FE/FEs
	 * 	
	 * for n no.of eles you try to find/create --the implicitly wait gets applied n no. of times
	 * the recent updated wait time is applied
	 * 
	 * 1.problem with implicitly wait: for every page whatever first time wait is applied that same
	 * wait gets applied as it is global
	 * if u want to change the wait for a particular ele u have to override the previous wait 
	 * 
	 * 2.problem: gets applied to all the eles on the page/class-so might give performance issue
	 * if there are 100 eles on page-so it gets applied to all the 100 eles and delays the 
	 * performance
	 * 
	 * implicitly wait is not possible for one specific element -- it is always applied globally
	 * 
	 * TO Apply explicitly for one ele : that liberty is achieved only thru explicitly wait/fluent
	 * wait
	 */
	WebDriver driver = new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //since deprecated
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //sel 4.x
	
	driver.get("https://orangehrm.com/30-day-free-trial/");
	//total time out = 10 secs
	driver.findElement(By.id("Form_getForm_Name")).sendKeys("test"); //e1:10
	//e2:10
	//e3:10
	//....en 10
	
	//home page: 15 secs
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//sel 4.x
	//he1:15
	//he2: 15
	//logout:15
	
	//login page:10 secs
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//e1, e2, e3: 10 secs
	
	//reg page:5 secs
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//cart page:0: nullify of imp wait: 0
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

	//case 2:
	//login page: 10 secs
	//e1 : 10
	//e2 : 10
	//e3 : 10
	//e4 : 10
	
	//case 3:
	//its only for webElements
	//not applicable for non-web elements:==> cannot be applied for alerts, titles, urls, browser
	//windows
	
	//avoid imp wait in ur real time appns
	
	
	
	}

}
