package methods;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import ui.Cart.UiCart;
import ui.UiSearch;
import ui.UiSignIn;

/**
 * Created by Khan on 2/8/2017.
 */
public class CommonMethods extends CommonAPI {
    public String userName = "amazonUsername";
    public String password = "amazonPassword";

    public void signIn(String userName, String password){
        UiSignIn uiSignIn = PageFactory.initElements(driver, UiSignIn.class);
        uiSignIn.lnkSignIn.click();
        uiSignIn.txtEmail.sendKeys(userName);
        uiSignIn.txtPass.sendKeys(password);
        uiSignIn.btnSignIn.click();
    }
    public void signIn(){
        UiSignIn uiSignIn = PageFactory.initElements(driver, UiSignIn.class);
        uiSignIn.lnkSignIn.click();
        uiSignIn.txtEmail.sendKeys(userName);
        uiSignIn.txtPass.sendKeys(password);
        uiSignIn.btnSignIn.click();
    }
    public void searchDropDownSelectOption(String value){
        selectDropDownValueByXPATH(value, ".//*[@id='searchDropdownBox']");
    }
    public void searchUsingASIN(String ASIN, String pCategory, String pTitle){
        UiSearch uiSearch = PageFactory.initElements(driver, UiSearch.class);
        uiSearch.searchDropDownSelectOption(pCategory);
        uiSearch.tfSearchBar.clear();
        uiSearch.tfSearchBar.sendKeys(ASIN, Keys.ENTER);
        uiSearch.lnkFirstSearchResult.click();
        Assert.assertEquals(uiSearch.txtProductTitle.getText(),pTitle);
    }
    public void dismissPrimeOffer(){
        clickIfElementPresent(driver.findElement(By.xpath(".//*[@id='result_0']/div/div[3]/div[1]/a")));
    }

    public void addToCart(){
        UiCart uiCart = PageFactory.initElements(driver, UiCart.class);
        uiCart.btnAddToCart.click();
        //dismissPrimeOffer();
    }


}
