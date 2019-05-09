package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainWiki {

		// ALL OF THIS IS A : 
	
		// P    O      M 
		// PAGE OBJECT MODEL
	
		public static WebDriver driver;
		
		public MainWiki(WebDriver driver) {
			this.driver = driver;
		}
		
		public WebElement getSearchBar() {
			return driver.findElement(By.name("search"));
		}
		
		
		public WebElement getGerman() {
			return driver.findElement(By.id("js-link-box-de"));
		}
		
		public WebElement getItalian() {
			return driver.findElement(By.xpath("//*[@id=\"js-link-box-it\"]")); //*[@id="js-link-box-it"]
		}
		
		public WebElement getSpanish () {
			return driver.findElement(By.cssSelector("div[lang='es']"));
		}
}
