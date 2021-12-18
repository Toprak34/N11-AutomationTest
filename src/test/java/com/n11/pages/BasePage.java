package com.n11.pages;

import com.n11.utilies.BrowserUtils;
import com.n11.utilies.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);

    }

    @FindBy(css = "a[title=' Favorilerim / Listelerim']")
    public WebElement favAndListBtn;

    @FindBy(css = "a[class*='home']")
    public WebElement pageSubTitle;

    @FindBy(css = "a.menuTitle")
    public WebElement myAccountBtn;

    @FindBy(css = "span[class*='heart-favorites-black']")
    public WebElement favBtn;


    public void navigateToMyAccountPages(String pagesId) {
        String pagesIdLocator = "a[title='" + pagesId + "']";
        BrowserUtils.waitForClickablility(By.cssSelector(pagesIdLocator), 5).click();
        favBtn.click();
    }


    public String getPageSubTitle() {

        return pageSubTitle.getAttribute("title");
    }
}