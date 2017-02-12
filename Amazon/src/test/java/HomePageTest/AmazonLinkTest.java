package HomePageTest;

import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.UiHomePage;

/**
 * Created by Khan on 2/5/2017.
 */
public class AmazonLinkTest extends CommonMethods {
    public UiHomePage getMenu(){

        return PageFactory.initElements(driver,UiHomePage.class);
    }
    @Test
    public void testMyStoreLink(){
        UiHomePage uiHomePage = PageFactory.initElements(driver,UiHomePage.class);
        uiHomePage.getYourStore();
    }
    @Test
    public void testDealsStoreLink() {

        getMenu().getDealsStore();
    }
    @Test
    public void testGiftCardsLink() {
        getMenu().getGiftCards();//clickByXpath(".//*[@id='nav-xshop']/a[3]");
        Assert.assertTrue(getTextByXpath(".//*[@id='refinements']/div[1]").contains("Show results for"));
    }
    @Test
    public void testSellLink() {
        getMenu().getSell();//clickByXpath(".//*[@id='nav-xshop']/a[4]");
        Assert.assertTrue(getTextByXpath(".//*[@id='top']/div[1]/div/div[1]/div/h1/span[2]").contains("Reach millions of customers by selling on Amazon.ca"));


    }
    @Test
    public void testHelpLink() {
        getMenu().getHelp();//clickByXpath(".//*[@id='nav-xshop']/a[5]");
        Assert.assertTrue(getTextByXpath("html/body/div[2]/div[3]/div/div[2]/p").contains("Find more solutions"));


    }
}

