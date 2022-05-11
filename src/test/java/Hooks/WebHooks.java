package Hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class WebHooks {

    @BeforeAll
    public static void setWebDriverFormat() {
        Configuration.startMaximized = true;
    }

    @AfterEach
    public void webClose(){
        WebDriverRunner.closeWebDriver();
    }

//    @Before
//    public static void setWebDriverFormatCucumber() {
//        Configuration.startMaximized = true;
//    }
//
//    @After
//    public void webClose(){
//        WebDriverRunner.closeWebDriver();
//    }
}
