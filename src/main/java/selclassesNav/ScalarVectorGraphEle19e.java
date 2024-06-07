package selclassesNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScalarVectorGraphEle19e {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * SVG: Scalar Vector Graph
		 * commonly art eles=>smileys, immorticons, somePics, stars, arrows,
		 * the magnifyingLensIcon/searchIcon ...etc
		 * 
		 * since the magnifying lens-combination of a round+stroke-line-join
		 * for SVG eles the normal xpath will not work
		 * we have to create one special xpath Query:
		 * local-name()-- is a fn which is already there in xpath and is used for SVG eles
		 * how to write that??
		 * write the below-------------for writing special locator for SVG ele
		 * //*[local-name()='svg']
		 * and then use other properties along with it
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("macbook");
		//inspecting the magnifyingGlassIcon on search bar--is an svg ele coming under button tagname
		//button/*[local-name()='svg']----is the special xpath for the magnifying lens
		//button//*[local-name()='svg']---can also write it with double slash as well
		driver.findElement(By.xpath("//button/*[local-name()='svg']")).click();

	}

}
