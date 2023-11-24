package is.demo.serenity.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/LoginDemoSerenity.feature",
        glue = "is.demo.serenity.stepsDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LoginRunner {
}
