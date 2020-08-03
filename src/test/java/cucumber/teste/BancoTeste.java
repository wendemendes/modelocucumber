package cucumber.teste;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", tags = "@BancoTeste",
    glue = "cucumber.teste.steps", monochrome = true, dryRun = false)
public class BancoTeste {
}
