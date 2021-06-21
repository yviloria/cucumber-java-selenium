import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features",
        glue={"StepDefinitions", "StepDefinitionsHooks", "StepDefinitionsBackground"},
        /*tags = {"@SmokeTest or @RegressionTest or @ImportantTest"},*/
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html", "json:target/cucumber-reports/cucumber.json"}
)
public class TestRunner { }
