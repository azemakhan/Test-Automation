package ui;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Khan on 2/8/2017.
 */
public class UiHomePage extends CommonMethods {
    @FindBy(xpath = ".//*[@id='nav-xshop']/a")
    List<WebElement> lnkNavXShop = new ArrayList<WebElement>();

    public void getYourStore(){
        lnkNavXShop.get(0).click();
        Assert.assertEquals("Sign in",getTextByXpath(".//*[@id='a-page']/div[1]/div[3]/div/div/form/div/div/div/h1"));
    }
    public void getDealsStore(){
        lnkNavXShop.get(1).click();
        Assert.assertEquals("Today's Deals", getTextByXpath(".//*[@id='gbox-item-0.0.0']/div/div/div[1]/h1/div[1]"));
    }
    public void getGiftCards()
    {
        lnkNavXShop.get(2).click();
    }
    public void getSell()
    {
        lnkNavXShop.get(3).click();
    }
    public void getHelp()
    {
        lnkNavXShop.get(4).click();
    }
}