package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CareerPage;

public class FullFlowTest extends BaseTest{


   @Test
    public void checkresult() throws InterruptedException {
       CareerPage page = new CareerPage(driver);
       util.ScrollAction.scroll(driver);
       page.careerClick();
       page.lifeatTenForceClick();
       util.ScrollAction.scroll(driver);
       page.twoInternClick();
       util.ScrollAction.scroll(driver);
       page.naviagteBack();
       page.jobOpening();
       String actual= page.getValue();
       String expected = "Feel free to send your CV to";
       Assert.assertEquals(actual,expected);

   }



}
