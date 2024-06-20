package frameworkRelated;

public class FWtheory2 {
	/*
	 * will create one page class, one test class to write the tcs, and will see the rules that
	 * we need to follow
	 * PAGE LAYER: contains all page class
	 * PAGE CLASS: will give the behaviour of the page
	 * ---But it should not assert any thing, no testng code at all
	 * In page class: we will never write testng code
	 * For every page, we will maintain the private WebDriver also at the class level
	 * i)Private By locators
	 * ii) Public page class constructor....
	 * iii) Public page Actions/Methods
	 * 
	 * accessing the private page variables from inside the public page methods -- is called
	 * ENCAPSULATION
	 * Page class/Page library/Page Object is the classic example of ENCAPSULATION
	 * 
	 * you cannot run this Page class as it has no main method
	 * 
	 * DRIVER FACTORY:
	 * Now trying to create The DriverFactory--is just replica of Browser Utility
	 * i) launches the browser taking the param browserName
	 * ii) launches the url taking the param url
	 * 
	 * 
	 * TEST LAYER:
	 * Creating a test class to try out the page class code written so far
	 * ==>creating LoginPageTest --to try out the code written in LoginPage class
	 * these test classes should always be written inside src/test/java
	 * TEST CLASS: no driver code, no selenium code
	 * 
	 * POM: was introduced by Martin Fowler
	 * he says: 
	 * page objects are commonly used for testing, but should not make assertions themselves
	 * their responsibility is to provide access to the state of the underlying page
	 * Its up to the test clients/testng to carry out the assertion logic
	 * 
	 * Simon Stewart: creator of selenium says
	 * If you have WebDriver APIs in your test methods, you are doing it wrong
	 * 
	 * 
	 */

}
