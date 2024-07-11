package StepDefinitions;

import Setup.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ecom.Modules.CartPage;



public class RemoveItemStepDef extends BaseClass {


    public CartPage cartPage;
    @When("user click on remove")
    public void userClickOnRemove() throws InterruptedException {
        Thread.sleep(5);
        cartPage.setRemoveOption();


    }

    @Then("Item get removed from cart")
    public void itemGetRemovedFromCart() {
        cartPage.setEmptyCart();
    }


}
