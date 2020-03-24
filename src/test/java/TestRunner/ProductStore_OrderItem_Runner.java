package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\src\\main\\resources\\feature\\test.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TC11_Project_ProductStore,@TC12_Project_ProductStore"},
				
		glue = {"com.testCases"},
		monochrome = true
		) 
public class ProductStore_OrderItem_Runner {

}
