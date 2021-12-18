package com.n11.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class MyAccountsPage extends BasePage {

    @FindBy(css = "h3.productName")
    public List<WebElement> favProduct;

    @FindBy(xpath = "//span[text()='Sil']")
    public WebElement deleteFavProduct;

    @FindBy(css = "div[class*='emptyWatchList']")
    public WebElement emptyFav;

    @FindBy(xpath = "//span[text()='Tamam']")
    public WebElement deleteMessage;

    public String favProduct() {

        return favProduct.get(0).getText();
    }



}

