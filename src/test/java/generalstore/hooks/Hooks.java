package generalstore.hooks;

import generalstore.utils.ConfigReader;
import generalstore.utils.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;

public class Hooks {

    @BeforeAll
    public static void before_All(){
        Driver.serverBaslat(ConfigReader.getProperty("localIPAdres"), Integer.parseInt(ConfigReader.getProperty("localPort")));



    }
   @Before
           public void setUp(){
Driver.getDriver().activateApp("com.androidsample.generalstore");
   }

   @After
    public void tearDown(Scenario scenerio){
       if (scenerio .isFailed()) {
           byte[] screenshotAs = Driver.getDriver().getScreenshotAs(OutputType.BYTES);
           scenerio.attach(screenshotAs,"image/png","Hata Resmi");

       }
//       Driver.getDriver().executeScript("mobile: terminateApp", ImmutableMap.of(
//               "appId", "com.androidsample.generalstore","timeout", 10000));
//
Driver.getDriver().terminateApp("com.androidsample.generalstore");


   }
    @AfterAll
    public static void after_All(){

        Driver.uygulamayiKapat();
        Driver.serverKapat();

    }

}
