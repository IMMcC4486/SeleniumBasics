package cuke;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MainWiki;

public class StateSearchCucumber {

	public static MainWiki wiki;
	public static WebDriver driver;

	@Given("^The user is on Wikipedia$")
	public void the_user_is_on_Wikipedia() throws Throwable {
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		wiki = new MainWiki(driver);
		driver.get("http://www.wikipedia.org/");
	}

	@Given("^The user types in \"([^\"]*)\"$")
	public void the_user_types_in(String arg1) throws Throwable {
		wiki.getSearchBar().sendKeys(arg1);
	}

	@When("^The user presses enter$")
	public void the_user_presses_enter() throws Throwable {
		wiki.getSearchBar().sendKeys(Keys.RETURN);

	}

	@Then("^The Title of the article is \"([^\"]*)\"$")
	public void the_Title_of_the_article_is(String arg1) throws Throwable {
		Assert.assertEquals(driver.getTitle(), arg1);
	}

}
