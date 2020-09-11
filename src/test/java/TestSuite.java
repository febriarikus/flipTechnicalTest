import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features={
                "src/test/resources/features/Login.feature",
                "src/test/resources/features/Homepage.feature"})
public class TestSuite {
}
