package selclassesNav;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementConcept21a {
       //giving JavaScriptException on line 53 ----need to fix the script
	public static void main(String[] args) {
		/*
		 * PseudoElement: where we have a special class available
		 * eg: on opencart on reg page the fields where it shows the asterisk symbol(*)
		 * ==> mandatory field is a pseudoElement
		 * how to test for such elements??
		 * one is by checking the functionality==> the reg should not be completed skipping input
		 * into one of those fields
		 * can also capture the error message --that says field is mandatory
		 * 2). what if u really want to check for the presence of (*) near the webElement on UI??
		 * when u inspect for it on DOM the txt of the field is seen but nothing written about 
		 * the *
		 * these pseudo Elements (*) are written on DOM using: 
		 *  ::before, or ::after   etc...
		 *  these ::before, ::after ---are all called pseudoclasses
		 *  -------------PSEUDO CLASSES-------------------
		 *  PseudoClasses are part of html DOM
		 *  BUT they do not have any other property/attribute like id, class, text...etc
		 *  nothing is visible except for ::after OR ::before
		 *  In that case, if u really want to capture using ::before, ::after
		 *  on the right part of DOM after u inspect-window
		 *  content: * 
		 *  is seen
		 *  To capture this pseudo element there is no direct method available 
		 *  in that case--we need to take help from Java Script
		 *  so on the console of chrome Dev Tools
		 *  write window.getComputedStyle(document.use a css selector here)
		 *  
		 *  window.getComputedStyle(document.queryselector(''))
		 *  
		 *  queryselector means cssselector and u have to supply the css selector for that 
		 *  particular element ==>
		 *  
		 *  window.getComputedStyle(document.queryselector('label[for='input-firstname']'),'::before').getProperty('content');
		 *  
		 *  now the Output is * on console
		 */
		String script 
		= "return window.getComputedStyle(document.queryselector('label[for=\"input-firstname\"]'),'::before')).getPropertyValue('content');";
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    String mand_txt = js.executeScript(script).toString();
	    System.out.println(mand_txt);

	}

}
