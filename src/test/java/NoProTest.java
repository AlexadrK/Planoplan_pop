import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class NoProTest {
    public static WebDriver driver;
    public static MainPage mainPage;
    public static StorePage storePage;

    @BeforeMethod
    public void setUp() {
      //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aleksandr\\IdeaProjects\\Planoplan\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get("https://planoplan.com");
        mainPage = new MainPage(driver);
        mainPage.clickSignInButton1();
        mainPage.typeUserName("@mail");
        mainPage.typePassword("password");
        mainPage.clickSignInButton2();
        mainPage.clickLinkToStore();

    }

    @Test
    public void projectPlaceTest_ByQiwiWallet() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButtonNoPro();
        storePage.projectPlace();
        storePage.selectPaymentByQiwiWallet();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        Assert.assertEquals("ROBOKASSA - оплата с электронного кошелька QIWI", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("40", price);
    }

    @Test
    public void projectPlaceTest_ByYandexMoney() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButtonNoPro();
        storePage.projectPlace();
        storePage.selectPaymentByYandexMoney();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("ROBOKASSA - оплата с электронного кошелька «Яндекс.Деньги»", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("40", price);
    }

    @Test
    public void projectPlaceTest_ByWMR() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButtonNoPro();
        storePage.projectPlace();
        storePage.selectPaymentByWMR();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("ROBOKASSA - оплата с электронного кошелька WebMoney", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("40", price);
    }

    @Test
    public void projectPlaceTest_ByW1PaySend() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButtonNoPro();
        storePage.projectPlace();
        storePage.selectPaymentByW1PaySend();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("ROBOKASSA - оплата с электронного кошелька «Единый кошелек»", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("40", price);
    }

    @Test
    public void projectPlaceTest_ByAlfaBankPSR() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButtonNoPro();
        storePage.projectPlace();
        storePage.selectPaymentByAlfaBankPSR();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("ROBOKASSA - оплата через интернет-банк «Альфа-Клик»", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("40", price);
    }

    @Test
    public void projectPlaceTest_ByW1PaySendPSB() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButtonNoPro();
        storePage.projectPlace();
        storePage.selectPaymentByW1PaySendPSB();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("ROBOKASSA - оплата через интернет-банк Промсвязьбанка", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("40", price);
    }

    @Test
    public void projectPlaceTest_ByBankCardPSR() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButtonNoPro();
        storePage.projectPlace();
        storePage.selectPaymentByBankCardPSR();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("ROBOKASSA - оплата банковской картой", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("40", price);
    }

    @Test
    public void projectPlaceTest_ByCardHalvaPSR() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButtonNoPro();
        storePage.projectPlace();
        storePage.selectPaymentByCardHalvaPSR();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("ROBOKASSA - оплата картой Халва", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("40", price);
    }

    /*@Test
    public void projectPlaceTest_ByApplePayPSR() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButtonNoPro();
        storePage.projectPlace();
        storePage.selectPaymentByApplePayPSR();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("ROBOKASSA - оплата ......дописать", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("40", price);
    } */

    @Test
    public void projectPlaceTest_BySamsungPayPSR() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButtonNoPro();
        storePage.projectPlace();
        storePage.selectPaymentBySamsungPayPSR();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("ROBOKASSA - оплата с помощью Samsung Pay", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("40", price);
    }

    @Test
    public void projectPlaceTest_ByQiwi40PS() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButtonNoPro();
        storePage.projectPlace();
        storePage.selectPaymentByQiwi40PS();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("ROBOKASSA - оплата с электронного кошелька QIWI", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("40", price);
    }

    @Test
    public void projectPlaceTest_ByMixplatMTSPSR() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButtonNoPro();
        storePage.projectPlace();
        storePage.selectPaymentByMixplatMTSPSR();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("ROBOKASSA - оплата с баланса МТС", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("40", price);
    }

    @Test
    public void projectPlaceTest_ByMixplatBeelinePSR() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButtonNoPro();
        storePage.projectPlace();
        storePage.selectPaymentByMixplatBeelinePSR();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("ROBOKASSA - оплата с баланса Билайн", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("40", price);
    }

    @Test
    public void projectPlaceTest_ByMixplatTele2PSR() {
        StorePage storePage = new StorePage(driver);
        storePage.paymentFormButtonNoPro();
        storePage.projectPlace();
        storePage.selectPaymentByMixplatTele2PSR();
        storePage.acceptAgreeTerms();
        storePage.clickPayButton();
        String paymentHeading = storePage.getHeadingText();
        Assert.assertEquals("ROBOKASSA - оплата с баланса Tele2", paymentHeading);
        String price = storePage.getPriseText();
        Assert.assertEquals("40", price);
    }




    @Test
        public void texturePlaceTest() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.texturePlace();
            storePage.selectPaymentByQiwiWallet();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("ROBOKASSA - оплата с электронного кошелька QIWI", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("20.00 RUB", price);
        }

        @Test
       public void standartRenderTest() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.standartRender();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("40.00 RUB", price);

        }

        @Test
       public void hdRenderTest() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.hdRender();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("80.00 RUB", price);
        }

        @Test
       public void fullHdRenderTest() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.fullHdRender();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("160.00 RUB", price);
        }

        @Test
       public void fourKRenderTest() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.fourKRender();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("640.00 RUB", price);
        }

        @Test
       public void standartPanoramaTest() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.standartPanorama();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("150.00 RUB", price);
        }

        @Test
       public void improvedPanoramaTest() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.improvedPanorama();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("250.00 RUB", price);
        }

        @Test
       public void oneMonthProTest() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.oneMonthPro();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("700.00 RUB", price);
        }

        @Test
       public void sixMonthProTest() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.sixMonthPro();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("3,500.00 RUB", price);
        }

        @Test
       public void oneYearProTest() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.oneYearPro();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("6,300.00 RUB", price);
        }

        @Test
       public void oneMyPlanTest() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.oneMyPlan();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("2,999.00 RUB", price );
        }

//        @Test
//       public void threeMyPlanTest() {
//            StorePage storePage = new StorePage(driver);
//            storePage.paymentFormButtonNoPro();
//            storePage.threeMyPlan();
//            storePage.acceptAgreeTerms();
//            storePage.clickPayButton();
//            String paymentHeading = storePage.getHeadingText();
//            Assert.assertEquals("Оплата банковской картой", paymentHeading);
//            String price = storePage.getPriseText();
//            Assert.assertEquals("9,990.00 RUB", price );
//        }

//        @Test
//       public void threeAndPrintsMyPlanTest() {
//            StorePage storePage = new StorePage(driver);
//            storePage.paymentFormButtonNoPro();
//            storePage.threeAndPrintsMyPlan();
//            storePage.acceptAgreeTerms();
//            storePage.clickPayButton();
//            String paymentHeading = storePage.getHeadingText();
//            Assert.assertEquals("Оплата банковской картой", paymentHeading);
//            String price = storePage.getPriseText();
//            Assert.assertEquals("15,990.00 RUB", price );
//        }



        @Test
       public void starterPackDiscount60Test() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.starterPackDiscount60();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("780.00 RUB", price );
        }

        @Test
       public void proffPackDiscount60Test() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.proffPackDiscount60();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("2,880.00 RUB", price );
        }

        @Test
       public void tenStandartRendersDiscount10Test() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.tenStandartRendersDiscount10();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("360.00 RUB", price );
        }

        @Test
       public void tenHdRendersDiscount10Test() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.tenHdRendersDiscount10();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("720.00 RUB", price );
        }

        @Test
       public void tenFullHdRendersDiscount10Test() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.tenFullHdRendersDiscount10();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("1,440.00 RUB", price );
        }

        @Test
       public void tenFourKRendersDiscount10Test() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.tenFourKRendersDiscount10();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("5,760.00 RUB", price );
        }

        @Test
       public void tenProjectPlacesDiscount10Test() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.tenProjectPlacesDiscount10();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("180.00 RUB", price );
        }
        @Test
       public void tenTexturePlacesDiscount10Test() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.tenTexturePlacesDiscount10();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("180.00 RUB", price );
        }

        @Test
       public void tenStandartPanoramaDiscount10Test() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.tenStandartPanoramaDiscount10();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("1,350.00 RUB", price );
        }

        @Test
       public void tenImprovedPanoramaDiscount10Test() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.tenImprovedPanoramaDiscount10();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("2,250.00 RUB", price );
        }

        @Test
       public void twentyStandardRenderDiscount20Test() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.twentyStandardRenderDiscount20();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("640.00 RUB", price );
        }

        @Test
       public void twentyHdRenderDiscount20Test() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.twentyHdRenderDiscount20();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("1,280.00 RUB", price );
        }

        @Test
       public void twentyFullHdRenderDiscount20Test() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.twentyFullHdRenderDiscount20();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("2,560.00 RUB", price );
        }

        @Test
       public void fourKRendersDiscount20Test() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.fourKRendersDiscount20();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("10,240.00 RUB", price );
        }

        @Test
       public void twentyStandartPanoramaDiscount20Test() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.twentyStandartPanoramaDiscount20();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("2,400.00 RUB", price );
        }

        @Test
       public void twentyImprovedPanoramaDiscount20Test() {
            StorePage storePage = new StorePage(driver);
            storePage.paymentFormButtonNoPro();
            storePage.twentyImprovedPanoramaDiscount20();
            storePage.acceptAgreeTerms();
            storePage.clickPayButton();
            String paymentHeading = storePage.getHeadingText();
            Assert.assertEquals("Оплата банковской картой", paymentHeading);
            String price = storePage.getPriseText();
            Assert.assertEquals("4,000.00 RUB", price );
        }

        @AfterMethod
        public void tearDown () {
            driver.quit();
        }
    }



