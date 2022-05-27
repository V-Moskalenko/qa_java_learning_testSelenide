package PageObject.BaseSteps;

import PageObject.BaseElements.MainElements;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class MainSteps extends MainElements {
    @Step("Получение количества заведённых задач")
    public static void getCountTask(){
        projectButton.shouldBe(visible, Duration.ofSeconds(60)).click();
        testButton.shouldBe(visible, Duration.ofSeconds(60)).click();
        listTasks.shouldBe(visible, Duration.ofSeconds(60)).click();
        System.out.println("Текущее количество задач: " + projectCount.shouldBe(visible, Duration.ofSeconds(60)).text());
    }
}
