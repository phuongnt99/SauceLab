package screens.smoketest.app;

import common.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class LoginScreen extends BaseTest {
    AppiumDriver driver = getDriver();
    @AndroidFindBy(accessibility = "test-Username")
    @iOSXCUITFindBy()
    private WebElement usernameField;

    @AndroidFindBy(accessibility = "test-Password")
    @iOSXCUITFindBy()
    private WebElement passwordField;

    @AndroidFindBy(accessibility = "test-LOGIN")
    @iOSXCUITFindBy()
    private WebElement loginBtn;

    @AndroidFindBy(className = "android.webkit.WebView")
    @iOSXCUITFindBy()
    private WebElement titlePageTxt;

    @AndroidFindBy(xpath = "//*[@content-desc='test-Error message']//android.widget.TextView[1]")
    @iOSXCUITFindBy()
    private WebElement invalidAccountErrorTxt;

    public void pressLoginBtn() {
        click(loginBtn);
    }

    public void enterUsername(String username) {
        clear(usernameField);
        sendKeys(usernameField, username);
    }

    public void enterPassword(String password) {
        clear(passwordField);
        sendKeys(passwordField, password);
    }

    public String getInvalidAccountError() {
        return getAttribute(invalidAccountErrorTxt, "text");
    }

    public void loginSuccessful(String username, String password){
        sendKeys(usernameField, username);
        sendKeys(passwordField, password);
    }
}
