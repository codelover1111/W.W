package framework_weight_watchers;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		// This creates cucumber reports
        plugin = {"pretty", "html:target/site/cucumber-pretty","json:target/cucumber.json"},
        //This create auto method name in camelCase
        snippets = cucumber.api.SnippetType.CAMELCASE,
        //strict=true,
        	 monochrome=true,	
        //Path to your feature file
        features = {"/Users/fatemaislam/Documents/workspace/weight_watchers_Framework/Features"},
        // Specify tags to be executed
        tags = {"@regression-weightWatchers"},
        //Specify step definition package name (Note: make sure to have this package on current directory) 
        glue = {"stepdefinition_weight_watchers"}
     
        //dryRun=true(It will check feature file is right or wrong)
)
public class TestRunner {
	
}
