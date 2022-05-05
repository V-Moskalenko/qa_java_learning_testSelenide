package PageObject.BaseElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CreateTaskElements {
    public static SelenideElement buttonCreate = $x("//a[@id='create_link']");
    public static SelenideElement createTheme = $x("//input[@name='summary']");
    public static SelenideElement typeTask = $x("//input[@id='issuetype-field']");
    //public static SelenideElement textButton1 = $x("(//button[contains(text(),'Текст')])[1]");
    public static SelenideElement descriptionFrame = $x("//textarea[@name='description']");
    public static SelenideElement selectVersion = $x("//select[@name='fixVersions']//option[@value='-1']");
    public static SelenideElement selectPriority = $x("//input[@id='project-field']");
    //public static SelenideElement textButton2 = $x("(//button[contains(text(),'Текст')])[2]");
    public static SelenideElement environmentFrame = $x("//textarea[@name='environment']");
    public static SelenideElement assignMe =$x("//button[@data-field-id='#assignee']");
    public static SelenideElement buttonFinal = $x("//input[@id='create-issue-submit']");
}
