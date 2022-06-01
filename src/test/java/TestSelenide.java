import Hooks.WebHooks;
import Utils.Configuration;
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
        open(Configuration.getValue("URL"));
        authStep(Configuration.getValue("loginName"), Configuration.getValue("passwordName"));
    }

    @Test
    @DisplayName("Проверка заведённых задач")
    public void Test_2(){
        open(Configuration.getValue("URL"));
        authStep(Configuration.getValue("loginName"), Configuration.getValue("passwordName"));
        getCountTask();
    }

    @Test
    @DisplayName("Проверка статуса и версии задачи")
    public void Test_3(){
        open(Configuration.getValue("URL"));
        authStep(Configuration.getValue("loginName"), Configuration.getValue("passwordName"));
        getCountTask();
        testTask();
    }

    @Test
    @DisplayName("Заведение новой задачи")
    public void Test_4() {
        open(Configuration.getValue("URL"));
        authStep(Configuration.getValue("loginName"), Configuration.getValue("passwordName"));
        getCountTask();
        testTask();
        createTask("TEST-05052022", "CreateTest002");
    }
}
