package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp17c {

	public static void main(String[] args) {
		/*
		 * FileUpload popUp: user needs to click on Browse/choose file Btn and then the
		 * PopUP window of the users local file system--which is a part of the OS of the
		 * computer system appears
		 * From where he needs to select a file to upload
		 * For this SCENARIO: when writing the Automation script --the user should not
		 * use the click() method, instead should use the sendKeys() method with the
		 * passing the path of the file as a Parameter to the sendKeys method
		 * so the file gets uploaded automatically
		 * 
		 * u have to check one imp condition here for this scenario: that type property on the
		 * Dom exists and the attriValue equals 'file'--then only it can be handled in sel
		 * 
		 * if type = file is not there: then ask ur dev to add this attribute
		 * as there is no other solution given by sel to handle this
		 * 
		 * other ways to handle this in the absence of type='file'
		 * SIKULI ---is image based/resolution based
		 * AUTOIT --only for windows machine --won't work in docker, headless, jenkins, linux, macos 
		 * ---these are not part of sel in sel 4.x
		 * 
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\bkarn\\Documents\\tempTestData\\sampleTest.txt");

		//type = file is mandatory
	}

}
