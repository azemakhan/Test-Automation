package ui;

import methods.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by Khan on 2/8/2017.
 */
public class UiSignIn extends CommonMethods{
    @FindBy(xpath = ".//*[@id='nav-link-yourAccount']")
    public WebElement lnkSignIn;
    @FindBy(xpath = ".//*[@id='signInSubmit']")
    public WebElement btnSignIn;
    @FindBy(how = How.XPATH, using=".//*[@id='ap_email']")
    public WebElement txtEmail;
    @FindBy(how = How.XPATH, using=".//*[@id='ap_password']")
    public WebElement txtPass;



    public void getSignIn(){
        lnkSignIn.click();
        Assert.assertTrue(getTextByXpath(".//*[@id='a-page']/div[1]/div[3]/div/div/form/div/div/div/h1").contains("Sign in"));
    }
//    public void getSignInUsingCorrectEmail(){
//        lnkSignIn.click();
//        txtEmail.sendKeys("azeemakamran@gmail.com");//typeByXpath(".//*[@id='ap_email']","azeemakamran@gmail.com");
//        txtPass.sendKeys("Password");// typeByXpath(".//*[@id='ap_password']","Password");
//        btnSignIn.click();//clickByXpath(".//*[@id='signInSubmit']");
//        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='auth-error-message-box']/div/div/ul/li/span")).getText().contains("Your password is incorrect"));
//    }
//    public void getSignInUsingCorrectCredentials(){
//        lnkSignIn.click();
//        txtEmail.sendKeys("azeemakamran@gmail.com");//typeByXpath(".//*[@id='ap_email']","azeemakamran@gmail.com");
//        txtPass.sendKeys("ahad1234");// typeByXpath(".//*[@id='ap_password']","ahad1234");
//        btnSignIn.click();//clickByXpath(".//*[@id='signInSubmit']");
//        Assert.assertTrue(getTextByXpath(".//*[@id='nav-link-yourAccount']/span[1]").contains("kamran"));
//    }
//    public void getSignInUsingInCorrectCredentials(){
//        lnkSignIn.click();
//        txtEmail.sendKeys("incorrectEmail@incorrectDomain.com");//typeByXpath(".//*[@id='ap_email']","incorrectEmail@incorrectDomain.com");
//        txtPass.sendKeys("incorrectPassword");// typeByXpath(".//*[@id='ap_password']","incorrectPassword");
//        btnSignIn.click();//clickByXpath(".//*[@id='signInSubmit']");
//        Assert.assertTrue(getTextByXpath(".//*[@id='auth-error-message-box']/div/div/ul/li").contains("We cannot find an account with that e-mail address"));
//    }
    public void getSignInUsingBlankCredentials(){
        lnkSignIn.click();
        txtEmail.sendKeys("");//typeByXpath(".//*[@id='ap_email']","incorrectEmail@incorrectDomain.com");
        txtPass.sendKeys("");// typeByXpath(".//*[@id='ap_password']","incorrectPassword");
        btnSignIn.click();//clickByXpath(".//*[@id='signInSubmit']");
        Assert.assertTrue(getTextByXpath(".//*[@id='auth-email-missing-alert']/div/div").contains("Enter your e-mail address or mobile phone number"));
    }
}
