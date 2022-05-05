package PageObject.BaseSteps;

import PageObject.BaseElements.ProjectElements;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class ProjectSteps extends ProjectElements {
    public static void testTask() {
        filtrPath.shouldBe(visible, Duration.ofSeconds(180)).setValue("TestSelenium");
        buttonTest.shouldBe(visible, Duration.ofSeconds(180)).click();
        buttonStatusBar.click();
        String status = statusTask.shouldBe(visible, Duration.ofSeconds(180)).text();
        System.out.println("Status task: " + status);
        System.out.println("Version task: " + versionTask.text());
    }
}