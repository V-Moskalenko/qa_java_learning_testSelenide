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
    @DisplayName("���� �����������")
    public void Test_1(){
        open("https://edujira.ifellow.ru");
        authStep("vmoskalenko", "123Qwerty");
    }

    @Test
    @DisplayName("�������� ��������� �����")
    public void Test_2(){
        open("https://edujira.ifellow.ru");
        authStep("vmoskalenko", "123Qwerty");
        getCountTask();
    }

    @Test
    @DisplayName("�������� ������� � ������ ������")
    public void Test_3(){
        open("https://edujira.ifellow.ru");
        authStep("vmoskalenko", "123Qwerty");
        getCountTask();
        testTask();
    }

    @Test
    @DisplayName("��������� ����� ������")
    public void Test_4() {
        open("https://edujira.ifellow.ru");
        authStep("vmoskalenko", "123Qwerty");
        getCountTask();
        testTask();
        createTask("TEST-05052022", "CreateTest002");
    }
}
