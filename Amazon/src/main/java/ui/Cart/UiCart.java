package ui.Cart;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Khan on 2/11/2017.
 */
public class UiCart extends CommonMethods {
    @FindBy(xpath = ".//*[@id='add-to-cart-button']")
    public WebElement btnAddToCart;
    @FindBy(xpath = ".//*[@id='nav-cart-count']")
    public WebElement txtCartCount;
}
