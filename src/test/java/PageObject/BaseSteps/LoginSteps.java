package PageObject.BaseSteps;

import PageObject.BaseElements.LoginElements;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static org.junit.Assert.assertEquals;

public class LoginSteps extends LoginElements {
    @Step("Авторизация с логином {loginName} и паролем {passwordName}")
    public static void authStep(String loginName, String passwordName){
        loginPath.shouldBe(visible, Duration.ofSeconds(60)).click();
        loginPath.setValue(loginName);
        passwordPath.shouldBe(visible, Duration.ofSeconds(60)).click();
        passwordPath.setValue(passwordName);
        authButton.click();
        avatarButton.shouldBe(visible,Duration.ofSeconds(60)).click();
        profileButton.shouldBe(visible,Duration.ofSeconds(60)).click();
        assertEquals("vmoskalenko", checkAuth.text());
    }

}
