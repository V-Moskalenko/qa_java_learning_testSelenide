package PageObject.BaseElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FindElements {
    //Элементы для Тест_1
    public static SelenideElement loginPath = $x("//input[@id='login-form-username']");
    public static SelenideElement passwordPath = $x("//input[@id='login-form-password']");
    public static SelenideElement authButton = $x("//input[@class='aui-button aui-button-primary']");
    public static SelenideElement checkAuth = $x("//dd[@id='up-d-username']");
    //Элемент Тест_2
    public static SelenideElement projectCount = $x("//div[@class='ghx-backlog-header js-marker-backlog-header']/descendant::div[@class='ghx-issue-count']");
    //Элементы Тест_3
    public static SelenideElement filtrPath = $x("//input[@class='text ghx-search']");
    public static SelenideElement buttonTest = $x("//div[@class='ghx-key']/a");
    public static SelenideElement statusTask = $x("//div[@id='ghx-detail-view']/descendant::span[@class=' jira-issue-status-lozenge aui-lozenge jira-issue-status-lozenge-yellow jira-issue-status-lozenge-indeterminate jira-issue-status-lozenge-max-width-medium']");
    public static SelenideElement versionTask = $x("//div[@class='wrap']/descendant::span[@id='versions-val']/descendant::span[@title]");
    public static SelenideElement buttonStatusBar = $x("//span[@class='aui-icon aui-icon-small aui-iconfont-info']");
    //Элементы Тест_4
    public static SelenideElement buttonCreate = $x("//a[@id='create_link']");
    public static SelenideElement createTheme = $x("//input[@class='text long-field']");
    public static SelenideElement typeTask = $x("//input[@id='issuetype-field']");
    public static SelenideElement iFrame = $x("//div[@class='tox-edit-area']/iframe[@id='mce_0_ifr']");
    public static SelenideElement iFrame_2 = $x("//body[@data-id='mce_0']/p");
    public static SelenideElement buttonFinal = $x("//input[@id='create-issue-submit']");
}
