package basictest;

import java.io.File;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.MainWiki;

public class WikiLang {

//	@Test(priority = 2)
//	  public void f1() {
//		System.out.println("my");
//	  }
//	
//	@Test(priority = 5)
//	  public void f2() {
//		System.out.println("ian");
//	  }
//	
//	@Test(priority = 3)
//	  public void f3() {
//		System.out.println("name");
//	  }
//	
//	@Test(priority = 1)
//	  public void f4() {
//		System.out.println("hello");
//	  }
//	
//	@Test(priority = 4)
//	  public void f5() {
//		System.out.println("is");
//	  }

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
	@Parameters({ "wikipedia" })
	public void goToMainPage(String wiki) {
		driver.get(wiki);
	}

	@Test(priority = 1)
	public void German() {
		wiki.getGerman().click();
		Assert.assertEquals(driver.getTitle(), "Wikipedia – Die freie Enzyklopädie");
	}

	@Test(priority = 2)
	public void Spanish() {
		wiki.getSpanish().click();
		Assert.assertEquals(driver.getTitle(), "Wikipedia, la enciclopedia libre");
	}

	@Test(priority = 3)
	public void Italian() {
		wiki.getItalian().click();
		Assert.assertEquals(driver.getTitle(), "Wikipedia, l'enciclopedia libera");
	}

	@Test(groups = "smoke")
	public void hello() {
		System.out.println("Hello from WikiLang");
	}

	@AfterSuite
	public void cleanup() {
		driver.quit();
	}

}
