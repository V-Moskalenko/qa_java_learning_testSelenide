package PageObject.BaseSteps;

import PageObject.BaseElements.CreateTaskElements;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class CreateTaskSteps extends CreateTaskElements {
    public static void createTask(String themeName, String specificationStr){
        buttonCreate.click();
        typeTask.shouldBe(visible, Duration.ofSeconds(60)).click();
        typeTask.setValue("Ошибка");
        typeTask.pressEnter();
        createTheme.setValue(themeName);
        //textButton1.shouldBe(visible, Duration.ofSeconds(60)).click();
        descriptionFrame.click();
        descriptionFrame.shouldBe(visible, Duration.ofSeconds(60)).sendKeys(specificationStr);
        selectVersion.click();
        selectPriority.click();
        selectPriority.setValue("Lowest");
        selectPriority.pressEnter();
        //textButton2.shouldBe(visible, Duration.ofSeconds(60)).click();
        environmentFrame.click();
        environmentFrame.shouldBe(visible, Duration.ofSeconds(60)).sendKeys("Windows 11, Chrome 101.0.4951.54");
        assignMe.click();
        buttonFinal.click();
    }
}
