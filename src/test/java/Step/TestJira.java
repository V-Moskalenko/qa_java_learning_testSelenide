package Step;

import Hooks.WebHooks;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;

import static PageObject.BaseSteps.CreateTaskSteps.createTask;
import static PageObject.BaseSteps.LoginSteps.authStep;
import static PageObject.BaseSteps.MainSteps.getCountTask;
import static PageObject.BaseSteps.ProjectSteps.testTask;
import static com.codeborne.selenide.Selenide.open;

public class TestJira{

    @Когда("^Авторизуемся$")
    public void Test_1(){
        open("https://edujira.ifellow.ru");
        authStep("vmoskalenko", "123Qwerty");
    }

    @И("^Получаем количество задач$")
    public void Test_2(){
        //open("https://edujira.ifellow.ru");
        //authStep("vmoskalenko", "123Qwerty");
        getCountTask();
    }

    @И("^Проверяем задачу$")
    public void Test_3(){
        //open("https://edujira.ifellow.ru");
        //authStep("vmoskalenko", "123Qwerty");
        //getCountTask();
        testTask();
    }

    @И("^Заводим новую задачу$")
    public void Test_4() {
        //open("https://edujira.ifellow.ru");
        //authStep("vmoskalenko", "123Qwerty");
        //getCountTask();
        //testTask();
        createTask("TEST-05052022", "CreateTest002");
    }
}
