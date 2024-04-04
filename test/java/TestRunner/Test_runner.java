package TestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;


@RunWith(Cucumber.class)
@CucumberOptions(features = {
        "src/test/java/FeatureFile/1_post.feature",
        "src/test/java/FeatureFile/2_get.feature"},
glue = {"StepDefination"})
public class Test_runner {


}
