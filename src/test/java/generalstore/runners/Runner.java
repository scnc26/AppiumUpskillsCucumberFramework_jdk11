package generalstore.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:raporlar/CucumberRapor.html",
        features = "src/test/resources/features",
        //glue birden fazla kullanım için {} kullanılır
        glue = {"generalstore/stepDefs" , "generalstore/hooks"},
        tags = "",
        dryRun = false,//true olursa eksik adımları verir
        monochrome = true

)
public class Runner {
}
