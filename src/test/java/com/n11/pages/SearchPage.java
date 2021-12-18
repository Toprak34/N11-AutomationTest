package com.n11.pages;

import com.n11.utilies.BrowserUtils;
import com.n11.utilies.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage extends BasePage {

    public SearchPage() {
        PageFactory.initElements(Driver.get(), this);

    }

    @FindBy(xpath = "//a[text()='2']")
    public WebElement secondPageBtn;

    @FindBy(css = "input[id='currentPage']")
    public WebElement pageNumber;

    @FindBy(css = "span[class='textImg followBtn']")
    public List<WebElement> addToFavoritesBtn;

    @FindBy(css = "h3.productName")
    public List<WebElement> products;

    @FindBy(css = "div.resultText")
    public WebElement resultText;

    public void ProductsPagesBtn(String number) {
        String productsPages = "//a[text()='" + number + "']";
        BrowserUtils.waitForClickablility(By.xpath(productsPages), 5).click();

    }

    public String getResult(){
        return resultText.getText();
    }

}
