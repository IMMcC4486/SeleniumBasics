package basictest;

import java.io.File;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.MainWiki;

public class WikiSearch {

	public static MainWiki wiki;
	public static WebDriver driver;

	@BeforeSuite
	public void setUpDriverAndPage() {

		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		wiki = new MainWiki(driver);

	}

	@BeforeMethod
	public void goToMainPage() {
		driver.get("https://www.wikipedia.org/");
	}

	@Test
	public void f() {
		System.out.println("AppleJacks");
	}

	@Test(dataProvider = "Search Items")
	public void search(String item) {
		wiki.getSearchBar().sendKeys(item + Keys.ENTER);
		Assert.assertEquals(driver.getTitle(), item + " - Wikipedia");
	}

	@Test(groups = "smoke")
	public void hello() {
		System.out.println("Hello from WikiSearch");
	}

	@AfterSuite
	public void cleanup() {
		driver.quit();
	}

	@DataProvider(name = "Search Items")
	public static Object[][] searchables() {
		return new Object[][] { { "Flatulence" }, { "Alligator" }, { "RuneScape" }, { "World of Warcraft" },
				{ "Guild Wars" } };
	}

}
