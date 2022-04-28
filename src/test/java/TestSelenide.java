import Hooks.WebHooks;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static PageObject.BaseSteps.PageSteps.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.assertEquals;

public class TestSelenide extends WebHooks {

    WebDriver driver;

//    @BeforeEach
//    public void start(){
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.get("https://edujira.ifellow.ru");
//        authStep("vmoskalenko", "123Qwerty");
//        sleep(10000);
//    }
//
//    @AfterEach
//    public void finish(){
//        driver.quit();
//    }

    @Test
    @DisplayName("Тест авторизации")
    public void Test_1(){
        open("https://edujira.ifellow.ru");
        authStep("vmoskalenko", "123Qwerty");
        sleep(1000);
        open("https://edujira.ifellow.ru/secure/ViewProfile.jspa");
        sleep(1000);
        assertEquals("vmoskalenko", checkAuth.text());
    }

    @Test
    @DisplayName("Проверка заведённых задач")
    public void Test_2(){
        //open("https://edujira.ifellow.ru");
        //authStep("vmoskalenko", "123Qwerty");
        //sleep(1000);
        open("https://edujira.ifellow.ru/secure/RapidBoard.jspa?rapidView=1&projectKey=TEST&view=planning.nodetail&issueLimit=100");
        System.out.println(projectCount.text());
    }

    @Test
    @DisplayName("Проверка статуса и версии задачи")
    public void Test_3(){
        //open("https://edujira.ifellow.ru");
        //authStep("vmoskalenko", "123Qwerty");
        //sleep(1000);
        open("https://edujira.ifellow.ru/secure/RapidBoard.jspa?rapidView=1&projectKey=TEST&view=planning&selectedIssue=TEST-374&issueLimit=100");
        testTask();
        String status = statusTask.shouldBe(visible, Duration.ofSeconds(180)).text();
        System.out.println("Status task: " + status);
        System.out.println("Version task: " + versionTask.text());
    }

//    @Test
//    @DisplayName("Заведение новой задачи")
//    public void Test_4(){
//        //open("https://edujira.ifellow.ru");
//        //authStep("vmoskalenko", "123Qwerty");
//        //sleep(1000);
//        createTask("TEST-28042022", "CreateTest001");
//    }
}
