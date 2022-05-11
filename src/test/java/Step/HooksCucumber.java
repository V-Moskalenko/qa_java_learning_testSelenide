package Step;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;

public class HooksCucumber {
    @Before
    public static void setWebDriverFormat() {
        Configuration.startMaximized = true;
    }
}
