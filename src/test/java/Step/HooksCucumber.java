package Step;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksCucumber {
    @Before
    public static void setWebDriverFormat() {
        Configuration.startMaximized = true;
    }

    @After
    public void webClose(){
        WebDriverRunner.closeWebDriver();
    }
}
