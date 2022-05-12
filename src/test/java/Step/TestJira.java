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

    // Сценарий 001: Весь тест
    @Когда("^Авторизуемся$")
    public void Test_1(List<String> testdata) {
        String login = testdata.get(0);
        String password = testdata.get(1);
        open("https://edujira.ifellow.ru");
        authStep(login, password);
    }

    @И("^Получаем количество задач$")
    public void Test_2() {
        getCountTask();
    }

    @И("^Проверяем задачу$")
    public void Test_3() {
        testTask();
    }

    @И("^Заводим новую задачу$")
    public void Test_4() {
        createTask("TEST-05052022", "CreateTest002");
    }

    // Cценарий 002: Только авторизация
    String LoginName;
    String PasswordName;

    @Дано("^логин '(.*)'")
    public void getLoginName(String str) {
        LoginName = str;
    }

    @И("^пароль '(.*)'")
    public void getPasswordName(String str) {
        PasswordName = str;
    }

    @Когда("^проводим авторизацию$")
    public void authorization() {
        open("https://edujira.ifellow.ru");
        loginPath.shouldBe(visible, Duration.ofSeconds(60)).click();
        loginPath.setValue(LoginName);
        passwordPath.shouldBe(visible, Duration.ofSeconds(60)).click();
        passwordPath.setValue(PasswordName);
        authButton.click();
    }

    @Тогда("^видим свой профиль$")
    public void checkProfile() {
        avatarButton.shouldBe(visible, Duration.ofSeconds(60)).click();
        profileButton.shouldBe(visible, Duration.ofSeconds(60)).click();
        assertEquals("vmoskalenko", checkAuth.text());
    }

    // Сценарий: 003 Проверяем количество заведённых задач
    @Когда("^авторизуемся в Jira$")
    public void authorizationJira(List<String> testdata) {
        String login = testdata.get(0);
        String password = testdata.get(1);
        open("https://edujira.ifellow.ru");
        authStep(login, password);
    }

    @И("^переходим в проекты$")
    public static void comeInProject() {
        projectButton.shouldBe(visible, Duration.ofSeconds(60)).click();
        testButton.shouldBe(visible, Duration.ofSeconds(60)).click();
        listTasks.shouldBe(visible, Duration.ofSeconds(60)).click();
    }

    @Тогда("^можем увидеть количество заведенных задач$")
    public static void seeTasks(){
        System.out.println("Текущее количество задач: " + projectCount.shouldBe(visible, Duration.ofSeconds(60)).text());
    }

    // Сценарий: 004 Проверка статуса и версии задачи
    @И("^используем фильтр для поиска задачи$")
    public static void findTask(){
        filtrPath.shouldBe(visible, Duration.ofSeconds(180)).setValue("TestSelenium");
        buttonTest.shouldBe(visible, Duration.ofSeconds(180)).click();
        buttonStatusBar.click();
    }

    @То("^можем проверить статус и версию задачи$")
    public static void getStatusAndVersion(){
        String status = statusTask.shouldBe(visible, Duration.ofSeconds(180)).text();
        Assertions.assertEquals("В РАБОТЕ", status, "not equals");
        System.out.println("Статус задачи: " + status);
        Assertions.assertEquals("Version 2.0", versionTask.text(), "not equals");
        System.out.println("Версия задачи: " + versionTask.text());
    }

    //Сценарий: 005 Заводим новую задачу
    String theme, specification;

    @И("^зададим тему и описание$")
    public void taskData(List<String> taskdata) {
        theme = taskdata.get(0);
        specification = taskdata.get(1);
    }

    @То("^можем создать новую задачу$")
    public void createNewTask(){
        createTask(theme, specification);
    }
}
