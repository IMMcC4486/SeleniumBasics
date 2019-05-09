package pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import pages.RevPractice;

public class RevPractice {

	public static WebDriver driver;
		
	public RevPractice(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUsername() {
		return driver.findElement(By.name("username"));
	}

	public WebElement getPassword() {
		return driver.findElement(By.id("pw"));
	}

	public WebElement getLoginButton() {
		return driver.findElement(By.cssSelector("body > div > div > div > div.panel-body > div > form > div:nth-child(3) > div > input"));
	}
}
