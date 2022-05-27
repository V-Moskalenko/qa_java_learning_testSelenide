package PageObject.BaseSteps;

import PageObject.BaseElements.ProjectElements;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjectSteps extends ProjectElements {
    public static void testTask() {
        filtrPath.shouldBe(visible, Duration.ofSeconds(180)).setValue("TestSelenium");
        buttonTest.shouldBe(visible, Duration.ofSeconds(180)).click();
        buttonStatusBar.click();
        String status = statusTask.shouldBe(visible, Duration.ofSeconds(180)).text();
        assertEquals("В РАБОТЕ", status, "not equals");
        System.out.println("Статус задачи: " + status);
        assertEquals("Version 2.0", versionTask.text(), "not equals");
        System.out.println("Версия задачи: " + versionTask.text());
    }
}