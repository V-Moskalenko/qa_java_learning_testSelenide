package PageObject.BaseElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProjectElements {

        public static SelenideElement filtrPath = $x("//input[@class='text ghx-search']");
        public static SelenideElement buttonTest = $x("//div[@title='TestSelenium']//ancestor::div[@class='ghx-row']//a");
        public static SelenideElement statusTask = $x("//span[@id='status-val']//span");
        public static SelenideElement versionTask = $x("//div[@class='wrap']/descendant::span[@id='versions-val']/descendant::span[@title]");
        public static SelenideElement buttonStatusBar = $x("//span[@class='aui-icon aui-icon-small aui-iconfont-info']");
    }
