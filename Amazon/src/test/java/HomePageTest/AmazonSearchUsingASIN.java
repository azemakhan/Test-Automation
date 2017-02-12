package HomePageTest;

import dataToSearch.ItemSearchUsingASIN;
import methods.CommonMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.Cart.UiCart;
import ui.UiSearch;

import java.io.IOException;

/**
 * Created by Khan on 2/11/2017.
 */
public class AmazonSearchUsingASIN extends CommonMethods {
    public UiSearch getSearchBar(){
        return PageFactory.initElements(driver, UiSearch.class);
    }
//    @DataProvider(name="dataASIN")
//    public Object[][] createData(){
//        return new Object[][] {
//                {"B01CJSF8IO"},
//                {"Samsung Galaxy S7 Factory Unlocked Phone 32 GB - International Version G930F - Black Oynx"}
//        };
//    }

    @Test
    public void dropDown() throws IOException {
        UiCart uiCart = PageFactory.initElements(driver,UiCart.class);
        ItemSearchUsingASIN items = new ItemSearchUsingASIN();
        String[] ASIN = items.getASIN();
        String[] productTitle = items.getProductTitle();
        String[] productCategory = items.getProductCategory();
        for (int i = 0; i < ASIN.length; i++) {
            searchUsingASIN(ASIN[i],productCategory[i],productTitle[i]);
            //add to cart
            addToCart();
            //assert cart
            Assert.assertTrue(uiCart.txtCartCount.getText().equals(Integer.toString(i+1)));

//            searchDropDownSelectOption(productCategory[i]);
//            getSearchBar().tfSearchBar.clear();
//            getSearchBar().tfSearchBar.sendKeys(ASIN[i], Keys.ENTER);
//            getSearchBar().lnkFirstSearchResult.click();
//            Assert.assertEquals(getSearchBar().txtProductTitle.getText(),productTitle[i]);
        }

        //searchDropDownSelectOption("search-alias=electronics");
        //getSearchBar().tfSearchBar.sendKeys(ASIN, Keys.ENTER);
        //getSearchBar().lnkFirstSearchResult.click();
        //String pTitle = "Samsung Galaxy S7 Factory Unlocked Phone 32 GB - International Version G930F - Black Oynx";
        //Assert.assertEquals(getSearchBar().txtProductTitle.getText(),pTitle);
    }


}


