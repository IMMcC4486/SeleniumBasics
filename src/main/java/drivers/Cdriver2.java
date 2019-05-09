package drivers;

import java.io.File;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.MainWiki;

public class Cdriver2 {

	public static void main(String[] args) throws InterruptedException {
		
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",  file.getAbsolutePath());
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		MainWiki wiki = new MainWiki(driver);
		
		wiki.getSearchBar().sendKeys("Hello");
		wiki.getSearchBar().sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
