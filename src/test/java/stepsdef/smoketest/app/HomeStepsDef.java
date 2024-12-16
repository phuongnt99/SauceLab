package stepsdef.smoketest.app;

import constant.Constant;
import drivers.PropertyManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import screens.smoketest.app.HomepageScreen;
import screens.smoketest.app.LoginScreen;
import screens.smoketest.app.YourCartScreen;

import java.io.IOException;
import java.util.Properties;

public class HomeStepsDef {
    public Properties getProps() throws IOException {
        return PropertyManager.getProps(Constant.PROP_ACCOUNT_FILE);
    }

    @Given("I logged in successfully")
    @And("The view is currently displaying 2 images")
    public void shouldView2Images() throws Exception {
        Assert.assertTrue(new HomepageScreen().isProductItem1());
        Assert.assertTrue(new HomepageScreen().isProductItem2());
    }

    @When("I accessed to Homepage successfully")
    public void testLoginAndNavigateToHome() throws Exception {
        new LoginScreen().enterUsername("standard_user");
        new LoginScreen().enterPassword("secret_sauce");
        new LoginScreen().pressLoginBtn();
    }

    @Then("Menu icon will be displayed")
    @And("Logo SWAGLABS will be displayed")
    @And("Cart icon will be displayed")
    public void shouldNavbarItems() throws Exception {
        Assert.assertTrue(new HomepageScreen().isMenuIcon());
        Assert.assertTrue(new HomepageScreen().isSWagLabsLogo());
        Assert.assertTrue(new HomepageScreen().isCartIcon());
    }

    @When("I click on the menu icon")
    public void pressMenuIcon() {
        new HomepageScreen().pressMenuIcon();
    }

    @Then("The sidebar menu should be visible")
    public void sidebarMenuShouldBeVisible() {
        // Check if the sidebar menu is displayed
        Assert.assertTrue(new HomepageScreen().isMenuSidebar());
    }

    @When("I click on Logo SWAGLABS")
    public void pressLogo() {
        new HomepageScreen().pressLogo();
    }

    @Then("No action occurs")
    public void shouldSeeHomepageItems() throws Exception {
        Assert.assertTrue(new HomepageScreen().isCardItemPresent());
        Assert.assertTrue(new HomepageScreen().isProductsItemPresent());
    }

    @When("I click on the cart icon")
    public void pressCartIcon() {
        new HomepageScreen().pressCartIcon();
    }

    @Then("YOUR CART screen will be displayed")
    public void shouldSeeyourCartItems() throws Exception {
        Assert.assertTrue(new YourCartScreen().isCartTitlePresent());
        Assert.assertTrue(new YourCartScreen().isCartContentPresent());

    }

    @Then("The PRODUCTS text is displayed")
    @And("The toggle-view button is displayed")
    @And("The filter is displayed")
    public void isProductsText() throws Exception {
        Assert.assertTrue(new HomepageScreen().isProductsText());
        Assert.assertTrue(new HomepageScreen().isViewToggle());
        Assert.assertTrue(new HomepageScreen().isFilterButton());
    }

    @When("I click on the toggle-view button")
    public void pressViewToggle() {
        new HomepageScreen().pressViewToggle();
    }

    @Then("The view should display 1 image only")
    public void isProductItem1() {
        Assert.assertTrue(new HomepageScreen().isProductItem1());
    }

    @Given("The view is in 1 image view mode")
    public void isProductItem2() {
        Assert.assertTrue(new HomepageScreen().isProductItem2());
    }

    @When("I click on filter button")
    public void pressFilterButton() {
        new HomepageScreen().pressFilterButton();
    }

    @Then("The filter popup is opened")
    public void isFilterPopup() {
        Assert.assertTrue(new HomepageScreen().isFilterPopup());
    }

    @Then("I should see Product List")
    public void isProductList() {
        Assert.assertTrue(new HomepageScreen().isProductList());
    }
}
