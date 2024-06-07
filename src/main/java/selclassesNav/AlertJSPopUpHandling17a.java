package selclassesNav;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSPopUpHandling17a {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * what do u mean by Alerts, what do u mean by JS popups??
		 * Alert: is a method which is already there in Java Script in the browser
		 * because browser understands only java script language
		 * 
		 * on any webpage, right click inspect--and go to console window--and here u can write
		 * some java script code: alert('hello java');
		 * 
		 * ---immediately when u enter the alert('hello java'); --an alert window is seen
		 * ---so these alert pop ups are called java script pop ups
		 * 
		 * nothing can be done on the page until the alert has been accepted--it freezes the 
		 * entire page and not even inspect any other ele
		 * 
		 * ---Do we have any other Java script alerts??
		 * yes, we have confirmation popups as well--which asks either to click on OK or cancel
		 * 
		 * --the third category amongst the java script popups is prompt()---needs some data
		 * to be entered---it asks for some input from the user side
		 * 
		 * JAVA SCRIPT POPUPS: 3 types--all are JS alerts
		 * alert();
		 * confirm();
		 * prompt();
		 * 
		 * how to handle these JS alerts??
		 * the user needs to switch the driver to JS alerts to handle--since when u launch the appn
		 * the control/driver is immediately on browser page
		 * then the driver needs to accept/cancel/giveSomeInput...etc.
		 * 
		 * ALERT: is an existing interface which is available in sel--which has some classes
		 * internally which r implementing the alert
		 * 
		 * ***************imp point
		 * if the user enters the input manually in the JS prompt: it is visible
		 * BUT if entered thru sel using sendKeys() --it is not visible on the prompt window
		 * 
		 * AUTHENTICATION POPUP is not JS pop up
		 * how to handle authentication pop ups???
		 * switchTo().alert() --will not work since it is not a proper JS popup
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//1.alert
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Alert alert1 = driver.switchTo().alert();
		
		String txtOfalert1 = alert1.getText();
		
		System.out.println(txtOfalert1);
		
		alert1.accept();
		
//		alert1.dismiss();//to cancel the alert:manually hit esc on key board to cancel
		
		//2.confirm:
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Alert alert2 = driver.switchTo().alert();
		
		String txtOfalert2 = alert2.getText();
		
		System.out.println(txtOfalert2);
		
		alert2.accept();
		
//		alert2.dismiss();
		
		//3.prompt:here we need to enter a value--can there be 2 entry fields
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert alert3 = driver.switchTo().alert();
		
		String txtOfalert3 = alert3.getText();
		
		System.out.println(txtOfalert3);
        
		alert3.sendKeys("Binka");
		Thread.sleep(1000);
		
		alert3.accept();
		
//		alert3.dismiss();
		

	}

}
