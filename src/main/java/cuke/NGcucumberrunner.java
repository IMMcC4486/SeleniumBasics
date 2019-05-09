package cuke;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/resources/EngWiki.feature"},
		glue = {"cuke"} // package in same directory
		)


public class NGcucumberrunner extends AbstractTestNGCucumberTests {

	
	
	
}
