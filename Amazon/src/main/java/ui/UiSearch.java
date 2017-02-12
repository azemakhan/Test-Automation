package ui;

import base.CommonAPI;
import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Khan on 2/11/2017.
 */
public class UiSearch extends CommonMethods {
    @FindBy(xpath = ".//*[@id='twotabsearchtextbox']")
    public WebElement tfSearchBar;

    @FindBy(xpath = ".//*[@id='result_0']/div/div[3]/div[1]/a")
    public WebElement lnkFirstSearchResult;

    @FindBy(xpath = ".//*[@id='productTitle']")
    public WebElement txtProductTitle;
}
