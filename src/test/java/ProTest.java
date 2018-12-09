import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ProTest {

    public static WebDriver driver;
    public static MainPage mainPage;
    public static StorePage storePage;

    @BeforeMethod
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aleksandr\\IdeaProjects\\Planoplan\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get("https://planoplan.com");
        mainPage = new MainPage(driver);
        mainPage.clickSignInButton1();
        mainPage.typeUserName("alexander.kashin@planoplan.com");
        mainPage.typePassword("662340");
        mainPage.clickSignInButton2();
        mainPage.clickLinkToProStore();
    }

    @Test
    public void projectPlaceTest() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButton();
        storePage.projectPlace();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("Оплата банковской картой", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("10.00 RUB", price);
}

    @Test
    public void texturePlaceTest() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButton();
        storePage.texturePlace();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("Оплата банковской картой", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("10.00 RUB", price);
    }

    @Test
    public void standartRenderTest() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButton();
        storePage.standartRender();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("Оплата банковской картой", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("20.00 RUB", price);
    }

    @Test
    public void hdRenderTest() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButton();
        storePage.hdRender();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("Оплата банковской картой", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("40.00 RUB", price);
    }

    @Test
    public void fullHdRenderTest() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButton();
        storePage.fullHdRender();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("Оплата банковской картой", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("80.00 RUB", price);
    }

    @Test
    public void fourKRenderTest() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButton();
        storePage.fourKRender();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("Оплата банковской картой", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("320.00 RUB", price);
    }

    @Test
    public void standartPanoramaTest() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButton();
        storePage.standartPanorama();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("Оплата банковской картой", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("75.00 RUB", price);
    }

    @Test
    public void improvedPanoramaTest() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButton();
        storePage.improvedPanorama();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("Оплата банковской картой", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("125.00 RUB", price);
    }
    @Test
    public void oneMonthProTest() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButton();
        storePage.oneMonthPro();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("Оплата банковской картой", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("350.00 RUB", price);
    }

    @Test
    public void sixMonthProTest() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButton();
        storePage.sixMonthPro();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("Оплата банковской картой", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("1,750.00 RUB", price);
    }

    @Test
    public void oneYearProTest() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButton();
        storePage.oneYearPro();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("Оплата банковской картой", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("3,150.00 RUB", price);
    }


    @Test
    public void proVidjetPlaceTest() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButton();
        storePage.proVidjetPlace();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("Оплата банковской картой", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("25.00 RUB", price);
    }

    @Test
    public void proVidjetTwoDPlanTest() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButton();
        storePage.proVidjetTwoDPlan();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("Оплата банковской картой", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("50.00 RUB", price);
    }

    @Test
    public void proVidjetVirtualTourTest() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButton();
        storePage.proVidjetVirtualTour();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("Оплата банковской картой", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("150.00 RUB", price);//price per 1 camera
    }

    @Test
    public void proVidjet3D360Test() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButton();
        storePage.proVidjet3D360();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("Оплата банковской картой", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("10.00 RUB", price); //price per 1 frame
    }


    @Test
    public void proVidjetViewFromUpTest() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButton();
        storePage.proVidjetViewFromUp();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("Оплата банковской картой", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("75.00 RUB", price);
    }

    @Test
    public void proVidjetThreeDViewTest() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButton();
        storePage.proVidjetThreeDView();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("Оплата банковской картой", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("75.00 RUB", price);
    }

    @Test
    public void proVidjetQrCodeTest() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButton();
        storePage.proVidjetQrCode();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("Оплата банковской картой", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("1,250.00 RUB", price);
    }

    @Test
    public void proVidjetMyDecorationTest() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButton();
        storePage.proVidjetMyDecoration();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("Оплата банковской картой", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("5,000.00 RUB", price);
    }

    @Test
    public void proVidjetVrFlatTest() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButton();
        storePage.proVidjetVrFlat();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("Оплата банковской картой", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("10,000.00 RUB", price);
    }

    @Test
    public void proVidjetFreelancerRenderTest() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButton();
        storePage.proVidjetFreelancerRender();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("Оплата банковской картой", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("1,000.00 RUB", price);
    }

    @AfterMethod
    public void tearDown () {
        driver.quit();
        }

}
