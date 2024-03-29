package com.expedia.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
		"junit:target/cucumber.xml", "rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"  }, 
		features = "src/test/java/com/expedia/features", 
		glue = "com.expedia.stepDefinitions", 
		tags = "@Daniela_Comanici", 
		dryRun = false, 
		monochrome = true, 
		strict = true
) 

public class Runners {
    
}
