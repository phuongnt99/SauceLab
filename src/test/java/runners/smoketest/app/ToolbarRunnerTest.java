package runners.smoketest.app;
import io.cucumber.testng.CucumberOptions;
import runners.smoketest.RunnerBase;

@CucumberOptions(
        plugin = {"pretty"
                , "html:target/App/HomePage/cucumber/report.html"
                , "json:target/cucumber-reports/CucumberReport.json"
                , "summary"
        }
        , features = {"src/test/resources"}
        , glue = {"stepsdef/smoketest/app"}
        , dryRun = false
        , monochrome = true
        , tags = "@toolbar-feature"
)

public class ToolbarRunnerTest extends RunnerBase {

}
