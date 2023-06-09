import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

abstract public class BaseTest {
    ReadProperties readProperties = new ReadProperties();
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
    }
@BeforeMethod
    public void init(){
        setUp();
}

@AfterMethod
    public void tearDown(){
    Selenide.closeWebDriver();
}
}
