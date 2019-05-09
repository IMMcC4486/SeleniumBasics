package cuke;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MainWiki;

public class EnglishWikiCucumber {

	public static MainWiki wiki;
	public static WebDriver driver;

	@Given("^I am on the wikipedia homepage$")
	public void i_am_on_the_wikipedia_homepage() throws Throwable {
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		wiki = new MainWiki(driver);
		driver.get("http://www.wikipedia.org/");
	}

	@When("^I click on the english text$")
	public void i_click_on_the_english_text() throws Throwable {
		driver.findElement(By.id("js-link-box-en")).click();
	}

	@Then("^I should be at the English Wikipedia$")
	public void i_should_be_at_the_English_Wikipedia() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Wikipedia, the free encyclopedia");
		driver.close();
	}

}
