package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "definitions",
        tags = "@Ejemplo",
        plugin = {"pretty","html:Reporte/Reporte.html"}
)
class Runner {

}
