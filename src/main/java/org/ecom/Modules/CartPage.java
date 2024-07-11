package org.ecom.Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "span.maintext")
    WebElement atShoppingCart;

    @FindBy(css = "a.btn.btn-sm.btn-default")
    WebElement removeOption;

    @FindBy(xpath = "//div[@class='contentpanel']")
    WebElement emptyCart;

    public void setAtShoppingCart(){
        atShoppingCart.getText();
    }
    public void setRemoveOption(){
        removeOption.click();
    }
    public void setEmptyCart(){
        emptyCart.getText();
    }
    


}
