import Hooks.WebHooks;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

import static PageObject.BaseSteps.CreateTaskSteps.*;
import static PageObject.BaseSteps.LoginSteps.*;
import static PageObject.BaseSteps.MainSteps.*;
import static PageObject.BaseSteps.ProjectSteps.*;
import static com.codeborne.selenide.Selenide.open;

public class TestSelenide extends WebHooks {

    @Test
    @DisplayName("Тест авторизации")
    public void Test_1(){
        open("https://edujira.ifellow.ru");
        authStep("vmoskalenko", "123Qwerty");
    }

    @Test
    @DisplayName("Проверка заведённых задач")
    public void Test_2(){
        open("https://edujira.ifellow.ru");
        authStep("vmoskalenko", "123Qwerty");
        getCountTask();
    }

    @Test
    @DisplayName("Проверка статуса и версии задачи")
    public void Test_3(){
        open("https://edujira.ifellow.ru");
        authStep("vmoskalenko", "123Qwerty");
        getCountTask();
        testTask();
    }

    @Test
    @DisplayName("Заведение новой задачи")
    public void Test_4() {
        open("https://edujira.ifellow.ru");
        authStep("vmoskalenko", "123Qwerty");
        getCountTask();
        testTask();
        createTask("TEST-05052022", "CreateTest002");
    }
}
