package basictest;

import java.io.File;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.RevPractice;

public class RevLog {

	public static RevPractice rev;
	public static WebDriver driver;
	WebDriverWait wait10 = new WebDriverWait(driver, 10);


	@BeforeSuite
	public void setUpDriverAndPage() {

		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		rev = new RevPractice(driver);

	}

	@BeforeMethod
	public void goToMainPage() {
		driver.get("https://dev-caliber.revature.tech/");
	}

	@Test(priority = 1)
	public void setUsername() throws InterruptedException {
		rev.getUsername().sendKeys("calibot@revature.com");
		rev.getPassword().sendKeys("*6Ak4-&kXnNTfTh6" );
		rev.getLoginButton().click();
		Thread.sleep(10000);
		rev.driver.close();
	}


	@Test(groups = "smoke")
	public void hello() {
		System.out.println("Hello from RevLog");
	}

	@AfterSuite
	public void cleanup() {
		driver.quit();
	}

}
