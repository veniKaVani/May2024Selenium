package selclassesNav;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FEsUtil7d {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		By links = By.tagName("a");
		By images = By.tagName("img");

//		System.out.println("total links:" + getElementsCount(links));
//		System.out.println("total images:" + getElementsCount(images));
//
//		ArrayList<String> eleTxts = getElementsTextList(links);
//		System.out.println(eleTxts);
		
		ArrayList<String> attrlist = getElementAttributeList(images,"alt");
		System.out.println(attrlist);

	}

	private static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);

	}

	// generic fn to get the size of elements list:
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	// generic fn to print text of elements from the link list:
	public static ArrayList<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> txtList = new ArrayList<String>();

		for (WebElement e : eleList) {
			String txt = e.getText();
			if(txt.length()!=0) {
			txtList.add(txt);
			}
		}
		return txtList;
	}
	//generic fn to get the elements attributes:
	public static ArrayList<String> getElementAttributeList(By locator, String attrName) {
		List<WebElement> elementsList = getElements(locator);
		ArrayList<String> eleAttrList = new ArrayList<String>();
		
		for(WebElement e:elementsList) {
			String attrValue = e.getAttribute(attrName);
			if(attrValue.length()!=0) {
				eleAttrList.add(attrName);
			}
		}
		return eleAttrList;
	}
}
