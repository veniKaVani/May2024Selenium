package selclassesNav;

import org.openqa.selenium.WebDriver;

public class AmazonTest4 {

	public static void main(String[] args) {
		
		String browserName = "edge";
		
		BrowserUtility4 brUtil = new BrowserUtility4();
		WebDriver driver=brUtil.launchBrowser(browserName);
		
		brUtil.launchUrl("https://www.amazon.com");
		String actTitle = brUtil.getPageTitle();
		
		String actUrl = brUtil.getPageUrl();
		
		if(actUrl.contains("amazon")) {
			System.out.println("correct url");
		}else
		{
			System.out.println("incorrect url");
		}
		
		driver.close();

	}

}
