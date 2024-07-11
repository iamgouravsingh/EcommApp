package org.ecom.Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goTo(){
    driver.get("https://automationteststore.com/");
    }

    @FindBy(xpath = "//input[@id='filter_keyword']")
    WebElement searchField ;

    @FindBy(xpath = "//a[@id='category_58']")
    WebElement menOption;

    @FindBy(css = ".fa.fa-search")
    WebElement clickSearchOption;

    @FindBy(xpath = "//span[contains(text(),'Obsession Night Perfume')]")
    WebElement itemNameOnDetail;

    @FindBy(xpath = "//a[normalize-space()='Add to Cart']")
    WebElement addToCart;

    @FindBy(xpath = "//span[@class='maintext']")
    WebElement onShoppingCart;

    @FindBy(xpath = "(//a[contains(text(),'Men')])[3]")
    WebElement menuOption;
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/a[1]/i[1]")
    WebElement addToCartFromMenu;

    public void clickSearchField(){
    searchField.click();
    }

    public void enterValue(){
        searchField.sendKeys("perfume");
    }

    public void clickOnOption(){
        menOption.click();
    }

    public void clickOnSearch(){
        clickSearchOption.click();
    }

    public void setItemNameOnDetail(){
        itemNameOnDetail.getText();
    }

    public void clickAddToCart(){
        addToCart.click();
    }

    public void setOnShoppingCart(){
        onShoppingCart.getText();
    }

    public void setMenuOption(){
        menOption.click();
    }

    public void setAddToCartFromMenu(){
        addToCartFromMenu.click();
    }

}
