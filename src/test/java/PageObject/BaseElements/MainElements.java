package PageObject.BaseElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainElements {
    public static SelenideElement projectButton = $x("//div[@class='aui-header-primary']//a[@id='browse_link']");
    public static SelenideElement testButton = $x("//div[@class='aui-header-primary']//div[@class='aui-dropdown2-section']//a[contains(text(),'Test (TEST)')]");
    public static SelenideElement listTasks = $x("//div[@class='aui-sidebar-group aui-sidebar-group-tier-one']//a//span[@class='aui-icon aui-icon-large agile-icon-plan aui-iconfont-backlog']");
    public static SelenideElement projectCount = $x("//div[@class='ghx-backlog-header js-marker-backlog-header']/descendant::div[@class='ghx-issue-count']");
}
