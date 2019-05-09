package drivers;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cdriver {

	public static void main(String[] args) throws InterruptedException {
		
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",  file.getAbsolutePath());
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		// Web Elements just HTML elements
			// find them, do some action on them
				// There are a bunch of ways to grab web elements
		
		// Grabbing element by ID
		WebElement deutsch = driver.findElement(By.id("js-link-box-de"));
		
		// Grabbing element by Xpath (recommend against it)
		WebElement italiano = driver.findElement(By.xpath("//*[@id=\"js-link-box-it\"]")); //*[@id="js-link-box-it"]
		
		// Grabbing element by name
		WebElement searchBar = driver.findElement(By.name("search"));
		
		// tagName
		// className
		// link text // test? 
		
		// Grabbing by CSS Selector (grabs by attribute)
		WebElement espanol = driver.findElement(By.cssSelector("div[lang='es']"));
		
//		deutsch.click();
//		italiano.click();
		searchBar.sendKeys("Selenium");
		searchBar.sendKeys(Keys.ENTER);
		
		
//		espanol.click();

		
		// bad practice
		Thread.sleep(5000);
		
		driver.quit();
	}

}
