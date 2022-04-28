package PageObject.BaseSteps;

import PageObject.BaseElements.FindElements;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;

public class PageSteps extends FindElements {
    public static void authStep(String loginName, String passwordName){
        loginPath.shouldBe(visible, Duration.ofSeconds(180)).click();
        loginPath.setValue(loginName);
        passwordPath.shouldBe(visible, Duration.ofSeconds(180)).click();
        passwordPath.setValue(passwordName);
        authButton.click();
    }

    public static void testTask(){
        //filtrPath.shouldBe(visible, Duration.ofSeconds(180)).click();
        filtrPath.setValue("TestSelenium");
        buttonTest.shouldBe(visible, Duration.ofSeconds(180)).click();
        buttonStatusBar.click();
    }

    public static void createTask(String themeName, String specificationStr){
        buttonCreate.click();
        typeTask.shouldBe(visible, Duration.ofSeconds(180)).click();
        typeTask.setValue("Ошибка");
        createTheme.setValue(themeName);
        iFrame.shouldBe(visible, Duration.ofSeconds(180)).setValue(specificationStr);
        buttonFinal.click();
    }

}
