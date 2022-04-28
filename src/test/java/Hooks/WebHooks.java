package Hooks;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebHooks {
    static WebDriver driver;

    @BeforeAll
    public static void setWebDriverFormat() {
        Configuration.startMaximized = true;
    }



}
