package Step;

import Hooks.WebHooks;
import io.cucumber.java.ru.�;
import io.cucumber.java.ru.�����;

import static PageObject.BaseSteps.CreateTaskSteps.createTask;
import static PageObject.BaseSteps.LoginSteps.authStep;
import static PageObject.BaseSteps.MainSteps.getCountTask;
import static PageObject.BaseSteps.ProjectSteps.testTask;
import static com.codeborne.selenide.Selenide.open;

public class TestJira{

    @�����("^������������$")
    public void Test_1(){
        open("https://edujira.ifellow.ru");
        authStep("vmoskalenko", "123Qwerty");
    }

    @�("^�������� ���������� �����$")
    public void Test_2(){
        //open("https://edujira.ifellow.ru");
        //authStep("vmoskalenko", "123Qwerty");
        getCountTask();
    }

    @�("^��������� ������$")
    public void Test_3(){
        //open("https://edujira.ifellow.ru");
        //authStep("vmoskalenko", "123Qwerty");
        //getCountTask();
        testTask();
    }

    @�("^������� ����� ������$")
    public void Test_4() {
        //open("https://edujira.ifellow.ru");
        //authStep("vmoskalenko", "123Qwerty");
        //getCountTask();
        //testTask();
        createTask("TEST-05052022", "CreateTest002");
    }
}
