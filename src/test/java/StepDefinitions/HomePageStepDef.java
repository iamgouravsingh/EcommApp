package StepDefinitions;

import Setup.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ecom.Modules.CartPage;
import org.ecom.Modules.HomePage;
import org.testng.annotations.AfterMethod;

public class HomePageStepDef extends BaseClass {

    public HomePage homePage;

    public CartPage cartPage;

    @Given("User is on landing screen")
    public void userIsOnLandingScreen() {

        homePage = launchApplication();

    }

    @When("User click on Search field and enter perfume")
    public void userClickOnSearchFieldAndEnterPerfume() throws InterruptedException {
        homePage.clickSearchField();
        Thread.sleep(5);
        homePage.enterValue();

    }

    @And("Click on subcategory Men")
    public void clickOnSubcategoryMen() {
        homePage.clickOnOption();
    }

    @And("Click on Search")
    public void clickOnSearch() {
        homePage.clickOnSearch();

    }

    @Then("Application navigates to Item Detail screen")
    public void applicationNavigatesToItemDetailScreen() {
        homePage.setItemNameOnDetail();
    }

    @When("User click on Add to Cart")
    public void userClickOnAddToCart() {
        homePage.clickAddToCart();
    }

    @Then("Application redirects to Cart Page")
    public void applicationRedirectsToCartPage() {
        homePage.setOnShoppingCart();
    }

    @When("User click on menu option")
    public void userClickOnMenuOption() {
        homePage.setMenuOption();
    }

    @And("Click on item add to cart")
    public void clickOnItemAddToCart() {
        homePage.setAddToCartFromMenu();
    }

    @AfterMethod
    @Override
    public void tearDown() {
        super.tearDown();
    }
}
