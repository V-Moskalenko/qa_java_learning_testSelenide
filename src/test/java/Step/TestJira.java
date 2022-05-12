package Step;

import io.cucumber.java.ru.*;
import org.junit.jupiter.api.Assertions;


import java.time.Duration;
import java.util.List;

import static PageObject.BaseElements.LoginElements.*;
import static PageObject.BaseElements.MainElements.*;
import static PageObject.BaseElements.ProjectElements.*;
import static PageObject.BaseSteps.CreateTaskSteps.createTask;
import static PageObject.BaseSteps.LoginSteps.authStep;
import static PageObject.BaseSteps.MainSteps.getCountTask;
import static PageObject.BaseSteps.ProjectSteps.testTask;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;

public class TestJira {

    // �������� 001: ���� ����
    @�����("^������������$")
    public void Test_1(List<String> testdata) {
        String login = testdata.get(0);
        String password = testdata.get(1);
        open("https://edujira.ifellow.ru");
        authStep(login, password);
    }

    @�("^�������� ���������� �����$")
    public void Test_2() {
        getCountTask();
    }

    @�("^��������� ������$")
    public void Test_3() {
        testTask();
    }

    @�("^������� ����� ������$")
    public void Test_4() {
        createTask("TEST-05052022", "CreateTest002");
    }

    // C������� 002: ������ �����������
    String LoginName;
    String PasswordName;

    @����("^����� '(.*)'")
    public void getLoginName(String str) {
        LoginName = str;
    }

    @�("^������ '(.*)'")
    public void getPasswordName(String str) {
        PasswordName = str;
    }

    @�����("^�������� �����������$")
    public void authorization() {
        open("https://edujira.ifellow.ru");
        loginPath.shouldBe(visible, Duration.ofSeconds(60)).click();
        loginPath.setValue(LoginName);
        passwordPath.shouldBe(visible, Duration.ofSeconds(60)).click();
        passwordPath.setValue(PasswordName);
        authButton.click();
    }

    @�����("^����� ���� �������$")
    public void checkProfile() {
        avatarButton.shouldBe(visible, Duration.ofSeconds(60)).click();
        profileButton.shouldBe(visible, Duration.ofSeconds(60)).click();
        assertEquals("vmoskalenko", checkAuth.text());
    }

    // ��������: 003 ��������� ���������� ��������� �����
    @�����("^������������ � Jira$")
    public void authorizationJira(List<String> testdata) {
        String login = testdata.get(0);
        String password = testdata.get(1);
        open("https://edujira.ifellow.ru");
        authStep(login, password);
    }

    @�("^��������� � �������$")
    public static void comeInProject() {
        projectButton.shouldBe(visible, Duration.ofSeconds(60)).click();
        testButton.shouldBe(visible, Duration.ofSeconds(60)).click();
        listTasks.shouldBe(visible, Duration.ofSeconds(60)).click();
    }

    @�����("^����� ������� ���������� ���������� �����$")
    public static void seeTasks(){
        System.out.println("������� ���������� �����: " + projectCount.shouldBe(visible, Duration.ofSeconds(60)).text());
    }

    // ��������: 004 �������� ������� � ������ ������
    @�("^���������� ������ ��� ������ ������$")
    public static void findTask(){
        filtrPath.shouldBe(visible, Duration.ofSeconds(180)).setValue("TestSelenium");
        buttonTest.shouldBe(visible, Duration.ofSeconds(180)).click();
        buttonStatusBar.click();
    }

    @��("^����� ��������� ������ � ������ ������$")
    public static void getStatusAndVersion(){
        String status = statusTask.shouldBe(visible, Duration.ofSeconds(180)).text();
        Assertions.assertEquals("� ������", status, "not equals");
        System.out.println("������ ������: " + status);
        Assertions.assertEquals("Version 2.0", versionTask.text(), "not equals");
        System.out.println("������ ������: " + versionTask.text());
    }

    //��������: 005 ������� ����� ������
    String theme, specification;

    @�("^������� ���� � ��������$")
    public void taskData(List<String> taskdata) {
        theme = taskdata.get(0);
        specification = taskdata.get(1);
    }

    @��("^����� ������� ����� ������$")
    public void createNewTask(){
        createTask(theme, specification);
    }
}
