package ui.Homepage;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Khan on 2/9/2017.
 */
public class UiGlobalHeader extends CommonMethods {
    @FindBy(xpath = ".//*[@id='ac-globalnav']/div/ul[2]/li/a")
    List<WebElement> globalNav = new ArrayList<WebElement>();

    public void getMacMenuLink(){
        globalNav.get(1).click();
        Assert.assertTrue(driver.getTitle().contains("Mac"));
        }
    public void getIPadLink(){
        globalNav.get(2).click();
        Assert.assertTrue(driver.getTitle().contains("iPad"));
    }
    public void getIphoneLink(){
        globalNav.get(3).click();
        Assert.assertTrue(driver.getTitle().contains("iPhone"));//pagetitle
    }
    public void getWatchLink(){
        globalNav.get(4).click();
        Assert.assertTrue(driver.getTitle().contains("Watch"));// String pageTitle= driver.getTitle();


    }
    public void getTvLink(){
        globalNav.get(5).click();
        Assert.assertTrue(driver.getTitle().contains("TV"));

    }
    public void getSupportLink(){
        globalNav.get(7).click();
        Assert.assertTrue(driver.getTitle().contains("Support"));

    }
    public void getMusicLink(){
        globalNav.get(6).click();
        Assert.assertTrue(driver.getTitle().contains("Music"));
    }
}

