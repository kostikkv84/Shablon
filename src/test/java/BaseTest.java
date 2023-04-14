
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;


import static com.codeborne.selenide.Selenide.executeJavaScript;

public class BaseTest {
    public BaseTest() {
    }

    public void setUp(String PLATFORM_AND_BROWSER) {
        switch (PLATFORM_AND_BROWSER) {
            case "win_chrome":
                WebDriverManager.chromedriver().setup();
                Configuration.browser = "chrome";
                System.setProperty("chromeoptions.args","--disable-popup-blocking");
                break;
            case "win_firefox":
                WebDriverManager.firefoxdriver().setup();
                Configuration.browser = "firefox";
                break;
            default:
                Assert.isTrue(false, "Incorrect platform");
        }
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        Configuration.driverManagerEnabled = true;
        Configuration.headless = false;
        Configuration.fastSetValue=true;
    }


/*    @AfterAll
    public void timeTestResult(ITestResult result){
        System.out.println("в последующем методе NewTestngClass");
        long a = result.getEndMillis()-result.getStartMillis();
        System.out.println("Время, затраченное на выполнение теста:"+a+" миллисекунды");
    } */


}

