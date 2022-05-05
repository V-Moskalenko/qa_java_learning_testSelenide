package PageObject.BaseElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginElements {
    public static SelenideElement loginPath = $x("//input[@id='login-form-username']");
    public static SelenideElement passwordPath = $x("//input[@id='login-form-password']");
    public static SelenideElement authButton = $x("//input[@class='aui-button aui-button-primary']");
    public static SelenideElement avatarButton = $x("//div[@class='aui-header-secondary']//img");
    public static SelenideElement profileButton = $x("//div[@id='user-options-content']//a[1]");
    public static SelenideElement checkAuth = $x("//dd[@id='up-d-username']");
}
