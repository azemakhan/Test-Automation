package HomePageTest;

import base.CommonAPI;
import methods.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.UiHomePage;
import ui.UiSignIn;

/**
 * Created with IntelliJ IDEA.
 * User: Khan
 * Date: 2/2/17
 * Time: 7:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class AmazonSignInTest extends CommonMethods {
    public UiSignIn getMenu(){

        return PageFactory.initElements(driver,UiSignIn.class);
    }
 //   @Test
 //   public void signInUsingCorrectEmail(){
 //      getMenu().getSignIn();// clickByXpath(".//*[@id='nav-link-yourAccount']");
//        typeByXpath(".//*[@id='ap_email']","azeemakamran@gmail.com");
//        typeByXpath(".//*[@id='ap_password']","Password");
//        clickByXpath(".//*[@id='signInSubmit']");
//        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='auth-error-message-box']/div/div/ul/li/span")).getText().contains("Your password is incorrect"));
//   }
//        @Test
//       public void signInUsingCorrectEmail() {
//            getMenu().getSignIn();// clickByXpath(".//*[@id='nav-link-yourAccount']");
//        }

//    @Test
//    public void signInUsingCorrectEmail(){
//       getMenu().getSignInUsingCorrectEmail();// clickByXpath(".//*[@id='nav-link-yourAccount']");
//        typeByXpath(".//*[@id='ap_email']","azeemakamran@gmail.com");
//        typeByXpath(".//*[@id='ap_password']","ahad1234");
//        clickByXpath(".//*[@id='signInSubmit']");
//        Assert.assertTrue(getTextByXpath(".//*[@id='nav-link-yourAccount']/span[1]").contains("kamran"));
////    }
//    @Test
//    public void signInUsingCorrectCredentials(){
//        getMenu().getSignInUsingCorrectCredentials();
//    }
//    @Test
//    public void signInUsingInCorrectCredentials(){
//        getMenu().getSignInUsingInCorrectCredentials();
//    }
//    @Test
//    public void testSignInIncorrectCredentials(){
//        clickByXpath(".//*[@id='nav-link-yourAccount']");
//        typeByXpath(".//*[@id='ap_email']","incorrectEmail@incorrectDomain.com");
//        typeByXpath(".//*[@id='ap_password']","incorrectPassword");
//        clickByXpath(".//*[@id='signInSubmit']");
//        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='auth-error-message-box']/div/div/ul/li")).getText().contains("We cannot find an account with that e-mail address"));
//    }
    @Test
    public void signInUsingBlankCredentials(){
        signIn("","");
//        getMenu().getSignInUsingBlankCredentials();
        Assert.assertTrue(getTextByXpath(".//*[@id='auth-email-missing-alert']/div/div").contains("Enter your e-mail address or mobile phone number"));
    }
//    @Test
//    public void signInUsingBlankCredentials(){
//        clickByXpath(".//*[@id='nav-link-yourAccount']");
//        typeByXpath(".//*[@id='ap_email']","");
//        typeByXpath(".//*[@id='ap_password']","");
//        clickByXpath(".//*[@id='signInSubmit']");
//        Assert.assertTrue(getTextByXpath(".//*[@id='auth-email-missing-alert']/div/div").contains("Enter your e-mail address or mobile phone number"));
//    }
}
