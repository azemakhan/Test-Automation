package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: Khan
 * Date: 2/2/17
 * Time: 6:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class CommonAPI {
    public static WebDriver driver = null;

    @Parameters({"url","browserName"})
    @BeforeMethod
    public void setUp(String url, String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
        System.setProperty("webdriver.chrome.driver", "../Generic/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    public void clickByXpath(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public void typeByXpath(String locator, String text){
        driver.findElement(By.xpath(locator)).sendKeys(text);
    }
    public String getTextByXpath(String locator){

        return driver.findElement(By.xpath(locator)).getText();
    }
    public void selectDropDownValueByXPATH(String value, String path){
        Select dropdown = new Select(driver.findElement(By.xpath(path)));
        dropdown.selectByValue(value);
    }
    public boolean isElementPresent(WebElement webElement) {
        try {
            if (webElement.isDisplayed()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            return false;
        }
    }
    public void clickIfElementPresent(WebElement webElement){
        if(isElementPresent(webElement)==true) {
            webElement.click();
        }
    }

}

