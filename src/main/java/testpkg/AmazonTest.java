package testpkg;

import selclassesNav.BrowserUtility4;

public class AmazonTest {

	public static void main(String[] args) {
		String browserName="chrome";
		
		BrowserUtility4 brUtil=new BrowserUtility4();
		brUtil.launchBrowser(browserName);
		brUtil.launchUrl("https://www.amazon.in/");
		System.out.println(brUtil.getPageTitle());
		
		String actTitle = brUtil.getPageTitle();
		
		if(actTitle.contains("Amazon")) {
			System.out.println("correct title-test PASS");
		}else {
			System.out.println("incorrect title-test FAIL");
		}
		
		brUtil.quitBrowser();

	}

}
