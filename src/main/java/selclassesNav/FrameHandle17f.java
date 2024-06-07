package selclassesNav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle17f {
	
	/*
	 * FrameIndex: is risky because in future if more frames are added - then the position of the frame
	 * changes on the DOM structure
	 * 
	 */
    //STILL PENDING
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(3000);
		
		driver.switchTo().frame(2);

	}

}
