package HomePageTest;

import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.Homepage.UiGlobalHeader;

/**
 * Created by Khan on 2/5/2017.
 */
    public class HeaderMenuTest extends CommonMethods {
    public UiGlobalHeader getMenu() {

        return PageFactory.initElements(driver, UiGlobalHeader.class);
    }
//  @Test //first through page title
//    public void testMacMenuLink (){
//     getMenu().getMacMenuLink();// clickByXpath(".//*[@id='ac-globalnav']/div/ul[2]/li[2]/a");
//     String PageTitle= driver.getTitle();
//     Assert.assertTrue(driver.getTitle().contains("Mac"));
// }

//   @Test //by using page factory
//     public void TestMacMenuLink(){
//      getMenu().getMacMenuLink();
// }

//   @Test
//    public void testIPadLink (){
//     getMenu().getIPadLink();//clickByXpath(".//*[@id='ac-globalnav']/div/ul[2]/li[3]/a");
// }

//    @Test
//      public void testIphone (){
//        getMenu().getIphoneLink();// clickByXpath(".//*[@id='ac-globalnav']/div/ul[2]/li[4]/a");
// }

//    @Test
//      public void testIphoneLink() {
//        getMenu().getIphoneLink();//clickByXpath(".//*[@id='ac-globalnav']/div/ul[2]/li[4]/a");
//        Assert.assertEquals("iPhone", getTextByXpath(".//*[@id='main']/header/div/h2[1]"));//page element or web element
// }
//
//    @Test
//        public void testWatchLink (){
//         getMenu().getWatchLink();//clickByXpath(".//*[@id='ac-globalnav']/div/ul[2]/li[5]/a");
// }
//    @Test
//       public void testTvLink() {
//        clickByXpath(".//*[@id='ac-globalnav']/div/ul[2]/li[6]/a");
//        Assert.assertEquals("The future of television is here.", getTextByXpath(".//*[@id='main']/section[1]/div/h1"));
// }

//    @Test
//      public void testTvLink (){
//        getMenu().getTvLink();// clickByXpath(".//*[@id='ac-globalnav']/div/ul[2]/li[6]/a");
// }
//    @Test
//      public void testSupportLink (){
//       clickByXpath(".//*[@id='ac-globalnav']/div/ul[2]/li[8]/a");
//       Assert.assertEquals("Welcome to Apple Support", getTextByXpath("html/body/div[5]/section[1]/div/div/div[2]/div/h1"));
// }

//    @Test
//      public void testSupportLink (){
//       getMenu().getSupportLink();// clickByXpath(".//*[@id='ac-globalnav']/div/ul[2]/li[8]/a");
// }

//    @Test
//     public void testMusicLink (){
//      getMenu().getMusicLink();//  clickByXpath(".//*[@id='ac-globalnav']/div/ul[2]/li[7]/a");
//   }
}
