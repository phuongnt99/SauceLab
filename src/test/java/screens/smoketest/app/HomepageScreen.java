package screens.smoketest.app;

import common.BaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class HomepageScreen extends BaseTest {

    @AndroidFindBy(accessibility = "test-Menu")
    private WebElement menuIcon;

    @AndroidFindBy(id = "android:id/content")
    private WebElement menuBar;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]")
    private WebElement swaglabsLogo;

    @AndroidFindBy(accessibility = "test-Cart")
    private WebElement cartIcon;

    @AndroidFindBy(accessibility = "test-Cart drop zone")
    @iOSXCUITFindBy()
    private WebElement cardItem;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PRODUCTS\"]")
    private WebElement productsText;

    @AndroidFindBy(accessibility = "test-Toggle")
    private WebElement viewToggle;

    @AndroidFindBy(accessibility = "test-Modal Selector Button")
    private WebElement filterButton;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-Item\"])[1]")
    private WebElement textITem1;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-Item\"])[2]/android.view.ViewGroup")
    private WebElement textItem2;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
    private WebElement filterPopup;

    @AndroidFindBy(accessibility = "test-PRODUCTS")
    @iOSXCUITFindBy()
    private WebElement productsItem;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"test-PRODUCTS\"]/android.view.ViewGroup")
    @iOSXCUITFindBy()
    private WebElement productsList;

    public boolean isProductList() {
        return find(productsList, 1);
    }

    public void testLoginAndNavigateToHome() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.getDriver();
        loginScreen.loginSuccessful("standard_user", "secret_sauce");
        loginScreen.pressLoginBtn();
    }

    public void pressMenuIcon() {
        click(menuIcon);
    }

    public void pressCartIcon() {
        click(cartIcon);
    }

    public void pressLogo() {
        click(swaglabsLogo);
    }

    public void pressViewToggle() {
        click(viewToggle);
    }

    public void pressFilterButton() {
        click(filterButton);
    }

    public boolean isMenuIcon() {
        return find(menuIcon, 1);
    }

    public boolean isSWagLabsLogo() {
        return find(swaglabsLogo, 1);
    }

    public boolean isCartIcon() {
        return find(cartIcon, 1);
    }

    public boolean isMenuSidebar() {
        return find(menuBar, 1);
    }

    public boolean isCardItemPresent() {
        return find(cardItem, 1);
    }

    public boolean isProductsItemPresent() {
        return find(productsItem, 1);
    }

    public boolean isProductsText() {
        return find(productsItem, 1);
    }

    public boolean isViewToggle() {
        return find(viewToggle, 1);
    }

    public boolean isFilterButton() {
        return find(filterButton, 1);
    }

    public boolean isProductItem1() {
        return find(textITem1, 1);
    }

    public boolean isProductItem2() {
        return find(textItem2, 1);
    }

    public boolean isFilterPopup() {
        return find(filterPopup, 1);
    }
}
