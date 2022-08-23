package Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue ={"com.metronet"},
        plugin={"json:target/cucumber-report/cucumber.json","html:target/cucumber-reports"},
        tags = "@login",
        monochrome = true
)

public class TestRunnerMetronetUI {
}
