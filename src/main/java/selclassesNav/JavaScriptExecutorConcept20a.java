package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept20a {

	public static void main(String[] args) {
		/*
		 * Java script: is just back door entry since it does the job from the DOM
		 * ---is not the simulation of a users Actions
		 * ---user always acts directly on the elements on the page
		 * ---using the actions class on the webElements is the user simulation of using the app
		 * W3c recommends actions scrolling rather than JSE scrolling
		 * 
		 * browser: understands only the lang JS
		 * 
		 * JSE: lot of good things could be solved with the help of JavaScriptExecutor
		 * so need to create a utility for this 
		 * 
		 * we are writing the code in java-sel, BUT browser understands only JavaScript
		 * java/python/Ruby --these langs are created for programming purpose
		 * end of the day-communication is happening with browser in the form of Js
		 * whatever java/sel code is written --is picked by the chromedriverserver and interacted
		 * with browser--end of the day -the methods in Javascript are being called here
		 * 
		 * Sel: cannot give everything to you eg: to highlight a color, to create a border, to
		 * handle the shadow DOM, to handle something on browser which is not available with sel
		 * => the method is not available with sel BUT it is possible with the help of Java script
		 * on the browser
		 * 
		 * so sel says u can write one Java script and then give it to this JSE(is an interface created)
		 * and this interface has one executeScript()
		 * this executeScript() method will run ur java script on the browser on behalf of u
		 * 
		 * browser: JS
		 * JS --> Java Script Executor --> executeScript()
		 * 
		 * u can execute the java script on any web apps console
		 * to print something on the console:
		 * console.log(100);
		 * 
		 * alert('hello java');   enter and then hello java gets printed
		 * 
		 * TO RUN THE SAME JAVA SCRIPT FROM THE JAVA/SEL CODE:what needs to be done??
		 * 1. need to convert the driver into Java Script Executor
		 * see the heirarchy: there is one chromeDriver, chromeDriver to chromium driver,
		 * chromium driver to the remote webdriver
		 * AND remote webdriver is having two interfaces--one is the webdriver, and the other one
		 * is the Java Script Executor(JSE)
		 * 
		 * => a class can implement multiple interfaces
		 * 
		 * To use JSE which is another interface--how to do that??
		 * casting needs to be done from one interface to another interface
		 * => webDriver and JSE both are interfaces
		 * and now WebDriver driver--gets converted --to JSE driver
		 * IN JAVA INTERFACE TO INTERFACE CASTING IS POSSIBLE:
		 * so write
		 * (JavascriptExecutor)driver;
		 * and then store this in some java script executor ref var js
		 * AND now u can use the executescript() method with the var js ref using the dot operator
		 * 
		 * eg: on console of web app opencart
		 * document.title 
		 * gives output as 'your store'
		 * 
		 * so to try this with sel/java code on eclipse --write
		 *js.executescript("return document.title;"); 
		 * store the above in a string var title
		 * BUT js.executescript("return document.title;"); doesnot give the string
		 * so write
		 * js.executescript("return document.title;").toString();
		 * 
		 * IQ) for the history what will u pass for goingback, refresh, going forward??
		 * for going back -1      history.go(-1)
		 * for refresh 0          history.go(0)
		 * for going forward +1   history.go(1)
		 * 
		 * Do we have any methods for the above in selenium??
		 * driver.navigate().back();
		 * driver.navigate().refresh();
		 * driver.navigate().forward();
		 * 
		 */
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.get("https://classic.freecrm.com/index.html");
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		
//		//now to get the Url of the page: on console can write document.URL  and enter
//		//doing the same with java/sel code on eclipse editor:
//		String appUrl = js.executeScript("return document.URL;").toString();
//		System.out.println(appUrl);
//		
//		//at the same time u can also use driver to do this:
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		
//		//what else can we do with Java script: can create a utility
//		//create a new class to do it: just like ElementUtility-create JavascriptUtility
		
		
		//commenting all the above code: since JSutil class is ready:
		//using the utility class instead for the same job to be accomplished:
		JSutil jsu = new JSutil(driver);
		String title = jsu.getTitleByJS();
		System.out.println(title);
		
//		jsu.generateJSAlert("hi this is my alert");
//		String pageTxt = jsu.getPageInnerText();
//		System.out.println(pageTxt);
//		
//		if(pageTxt.contains("Deals & Sales Pipeline")) {
//			System.out.println("PASS");
//		}
		
//		WebElement header = driver.findElement(By.xpath("//h3[text()='Companies & Contacts']"));
//		jsu.scrollIntoView(header);
		
//		jsu.zoomChromeEdgeSafari("50");
//		jsu.zoomChromeEdgeSafari("400");
		
//		jsu.drawBorder(header);
		
		

	}

}
