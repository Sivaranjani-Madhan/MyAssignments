package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\main\\java\\features\\LoginAccount.feature",glue="steps",monochrome=true,publish=true )
public class ExecutionClass extends AbstractTestNGCucumberTests {

}
