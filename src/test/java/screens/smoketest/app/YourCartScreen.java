package screens.smoketest.app;

import common.BaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class YourCartScreen extends BaseTest {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"YOUR CART\"]")
    private WebElement cartTitle;

    @AndroidFindBy(accessibility = "test-Cart Content")
    private WebElement cartContent;

    public boolean isCartTitlePresent() {
        return find(cartTitle, 1);
    }

    public boolean isCartContentPresent() {
        return find(cartContent, 1);
    }
}