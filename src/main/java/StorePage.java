import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class StorePage {
    private WebDriver driver;

    public StorePage(WebDriver driver) {
        this.driver = driver;
    }

    //private By paymentFormButton = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select"); //кнопка выпадающего списка с лотами
    //private By paymentFormButton = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div[2]/a"); //кнопка выпадающего списка с лотами старое
    private By paymentFormButton = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]");//кнопка выпадающего списка с лотами
    private By paymentFormButtonNoPro = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select"); //кнопка выпадающего списка с лотами не про акк

    //private By paymentMethodButton = By.xpath("//*[@id=\"payment_form\"]/fieldset[4]/div[1]/div[2]/select");//кнопка выпадающего списка методов оплаты
    //private By paymentHeading = By.xpath("/html/body/div/div[1]/h1"); //смотрим страницу оплаты для всех один код
    private By paymentHeading = By.xpath("/html/head/title");
    //private By prise = By.xpath("/html/body/div/div[1]/div[3]/div[2]/strong");//смотрим цену лота для всех один код
    private  By prise = By.xpath("//*[@id=\"payment-info\"]/table/tbody/tr[4]/td[2]/span/span[1]");//смотрим цену лота для всех один код

    // не про аккаунт локаторы
    private By projectPlace = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[1]/option[1]");
    //private By projectPlacePrise = By.xpath("/html/body/div/div[1]/div[3]/div[2]/strong");//смотрим цену лота по старому
    private By texturePlace = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[1]/option[2]");
    // private By texturePlacePrise = By.xpath("/html/body/div/div[1]/div[3]/div[2]/strong");//смотрим цену лота по старому
    private By standartRender = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[2]/option[1]");
    private By hdRender = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[2]/option[2]");
    private By fullHdRender = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[2]/option[3]");
    private By fourKRender = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[2]/option[4]");
    private By standartPanorama = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[3]/option[1]");
    private By improvedPanorama = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[3]/option[2]");
    private By oneMonthPro = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[4]/option[1]");
    private By sixMonthPro = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[4]/option[2]");
    private By oneYearPro = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[4]/option[3]");
    //private By disignMyPlanPro = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[5]/option[1]");
    //*[@id="payment_form"]/fieldset[2]/div/div[2]/select/optgroup[5]/option
    private By oneMyPlan = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[5]/option");
    private By threeMyPlan = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[5]/option[2]");
    private By threeAndPrintsMyPlan = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[5]/option[3]");
    private By starterPackDiscount60 = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[6]/option[1]");
    private By proffPackDiscount60 = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[6]/option[2]");
    private By tenStandartRendersDiscount10 = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[6]/option[3]");
    private By tenHdRendersDiscount10 = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[6]/option[4]");
    private By tenFullHdRendersDiscount10 = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[6]/option[5]");
    private By tenFourKRendersDiscount10 = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[6]/option[6]");
    private By tenProjectPlacesDiscount10 = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[6]/option[7]");
    private By tenTexturePlacesDiscount10 = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[6]/option[8]");
    private By tenStandartPanoramaDiscount10 = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[6]/option[9]");
    private By tenImprovedPanoramaDiscount10 = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[6]/option[10]");
    private By twentyStandardRenderDiscount20 = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[6]/option[11]");
    private By twentyHdRenderDiscount20 = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[6]/option[12]");
    private By twentyFullHdRenderDiscount20 = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[6]/option[13]");
    private By fourKRendersDiscount20 = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[6]/option[14]");
    private By twentyStandartPanoramaDiscount20 = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[6]/option[15]");
    private By twentyImprovedPanoramaDiscount20 = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[6]/option[16]");

//уникальные для про аккаунта локаторы

    private By proVidjetPlace = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[5]/option[1]");
    //private By vidjetPlacePrise = By.xpath("/html/body/div/div[1]/div[3]/div[2]/strong");//смотрим цену лота по старому
    private By proVidjetTwoDPlan = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[5]/option[2]");
    private By proVidjetVirtualTour = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[5]/option[3]");
    private By proVidjet3D360 = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[5]/option[4]");
    private By proVidjetViewFromUp = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[5]/option[5]");
    private By proVidjetThreeDView = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[5]/option[6]");
    private By proVidjetQrCode = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[5]/option[7]");
    private By proVidjetMyDecoration = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[5]/option[8]");
    private By proVidjetVrFlat = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[5]/option[9]");
    private By proVidjetFreelancerRender = By.xpath("//*[@id=\"payment_form\"]/fieldset[2]/div/div[2]/select/optgroup[6]/option");

    //выбор метода оплаты
    private By paymentByQiwiWallet = By.xpath("//*[@id=\"payment_form\"]/fieldset[4]/div[1]/div[2]/select/optgroup[1]/option[1]");
    private By paymentByYandexMoney = By.xpath("//*[@id=\"payment_form\"]/fieldset[4]/div[1]/div[2]/select/optgroup[1]/option[2]");
    private By paymentByWMR = By.xpath("//*[@id=\"payment_form\"]/fieldset[4]/div[1]/div[2]/select/optgroup[1]/option[3]");
    private By paymentByW1PaySend = By.xpath("//*[@id=\"payment_form\"]/fieldset[4]/div[1]/div[2]/select/optgroup[1]/option[4]");

    private By paymentByAlfaBankPSR = By.xpath("//*[@id=\"payment_form\"]/fieldset[4]/div[1]/div[2]/select/optgroup[2]/option[1]");
    private By paymentByW1PaySendPSB = By.xpath("//*[@id=\"payment_form\"]/fieldset[4]/div[1]/div[2]/select/optgroup[2]/option[2]");

    private By paymentByBankCardPSR = By.xpath("//*[@id=\"payment_form\"]/fieldset[4]/div[1]/div[2]/select/optgroup[3]/option[1]");
    private By paymentByCardHalvaPSR = By.xpath("//*[@id=\"payment_form\"]/fieldset[4]/div[1]/div[2]/select/optgroup[3]/option[2]");
    private By paymentByApplePayPSR = By.xpath("//*[@id=\"payment_form\"]/fieldset[4]/div[1]/div[2]/select/optgroup[3]/option[3]");
    private By paymentBySamsungPayPSR = By.xpath("//*[@id=\"payment_form\"]/fieldset[4]/div[1]/div[2]/select/optgroup[3]/option[4]");

    private By paymentByQiwi40PS = By.xpath("//*[@id=\"payment_form\"]/fieldset[4]/div[1]/div[2]/select/optgroup[4]/option");

    private By paymentByMixplatMTSPSR = By.xpath("//*[@id=\"payment_form\"]/fieldset[4]/div[1]/div[2]/select/optgroup[5]/option[1]");
    private By paymentByMixplatBeelinePSR = By.xpath("//*[@id=\"payment_form\"]/fieldset[4]/div[1]/div[2]/select/optgroup[5]/option[2]");
    private By paymentByMixplatTele2PSR = By.xpath("//*[@id=\"payment_form\"]/fieldset[4]/div[1]/div[2]/select/optgroup[5]/option[3]");


    //кнопки подтверждения в сторе
    private By agreeTerms = By.xpath("//*[@id=\"iagreeterms\"]");
    private By payButton = By.xpath("//*[@id=\"submitArea\"]/label/div/span");


    public String getHeadingText() {
        return driver.findElement(paymentHeading).getAttribute("text");    // получаем заголовок с старницы билинга
    }

    public String getPriseText() {
        return driver.findElement(prise).getText();             // получаем строку с ценой лота на странице билинга
    }

    public StorePage paymentFormButton() {
        driver.findElement(paymentFormButton).click();           //жмём кнопку выпадающего меню лотов
        return new StorePage(driver);
    }

// не про аккаунт методы

    public StorePage paymentFormButtonNoPro() {
        driver.findElement(paymentFormButtonNoPro).click();         //Открываем список лотов
        return new StorePage(driver);
    }

    public MainPage projectPlace() {
        driver.findElement(projectPlace).click();                   //Выбираем лот - место под проект
        return new MainPage(driver);
    }
//    public String getProjectPlacePrise() {
//        return driver.findElement(projectPlacePrise).getText();// по старому
//    }

    public MainPage texturePlace() {
        driver.findElement(texturePlace).click();
        return new MainPage(driver);
    }

    public MainPage standartRender() {
        driver.findElement(standartRender).click();
        return new MainPage(driver);
    }

    public StorePage hdRender() {
        driver.findElement(hdRender).click();
        return new StorePage(driver);
    }

    public StorePage fullHdRender() {
        driver.findElement(fullHdRender).click();
        return new StorePage(driver);
    }

    public StorePage fourKRender() {
        driver.findElement(fourKRender).click();
        return new StorePage(driver);
    }

    public StorePage standartPanorama() {
        driver.findElement(standartPanorama).click();
        return new StorePage(driver);
    }

    public StorePage improvedPanorama() {
        driver.findElement(improvedPanorama).click();
        return new StorePage(driver);
    }

    public StorePage oneMonthPro() {
        driver.findElement(oneMonthPro).click();
        return new StorePage(driver);
    }

    public StorePage sixMonthPro() {
        driver.findElement(sixMonthPro).click();
        return new StorePage(driver);
    }

    public StorePage oneYearPro() {
        driver.findElement(oneYearPro).click();
        return new StorePage(driver);
    }

    public StorePage oneMyPlan() {
        driver.findElement(oneMyPlan).click();
        return new StorePage(driver);
    }

    /*public StorePage threeMyPlan() {
        driver.findElement(threeMyPlan).click();
        return new StorePage(driver);
    }*/

    /*public StorePage threeAndPrintsMyPlan() {
        driver.findElement(threeAndPrintsMyPlan).click();
        return new StorePage(driver);
    */


    public StorePage starterPackDiscount60() {
        driver.findElement(starterPackDiscount60).click();
        return new StorePage(driver);
    }

    public StorePage proffPackDiscount60() {
        driver.findElement(proffPackDiscount60).click();
        return new StorePage(driver);
    }

    public StorePage tenStandartRendersDiscount10() {
        driver.findElement(tenStandartRendersDiscount10).click();
        return new StorePage(driver);
    }

    public StorePage tenHdRendersDiscount10() {
        driver.findElement(tenHdRendersDiscount10).click();
        return new StorePage(driver);
    }

    public StorePage tenFullHdRendersDiscount10() {
        driver.findElement(tenFullHdRendersDiscount10).click();
        return new StorePage(driver);
    }

    public StorePage tenFourKRendersDiscount10() {
        driver.findElement(tenFourKRendersDiscount10).click();
        return new StorePage(driver);
    }

    public StorePage tenProjectPlacesDiscount10() {
        driver.findElement(tenProjectPlacesDiscount10).click();
        return new StorePage(driver);
    }

    public StorePage tenTexturePlacesDiscount10() {
        driver.findElement(tenTexturePlacesDiscount10).click();
        return new StorePage(driver);
    }

    public StorePage tenStandartPanoramaDiscount10() {
        driver.findElement(tenStandartPanoramaDiscount10).click();
        return new StorePage(driver);
    }

    public StorePage tenImprovedPanoramaDiscount10() {
        driver.findElement(tenImprovedPanoramaDiscount10).click();
        return new StorePage(driver);
    }

    public StorePage twentyStandardRenderDiscount20() {
        driver.findElement(twentyStandardRenderDiscount20).click();
        return new StorePage(driver);
    }

    public StorePage twentyHdRenderDiscount20() {
        driver.findElement(twentyHdRenderDiscount20).click();
        return new StorePage(driver);
    }

    public StorePage twentyFullHdRenderDiscount20() {
        driver.findElement(twentyFullHdRenderDiscount20).click();
        return new StorePage(driver);
    }

    public StorePage fourKRendersDiscount20() {
        driver.findElement(fourKRendersDiscount20).click();
        return new StorePage(driver);
    }

    public StorePage twentyStandartPanoramaDiscount20() {
        driver.findElement(twentyStandartPanoramaDiscount20).click();
        return new StorePage(driver);
    }

    public StorePage twentyImprovedPanoramaDiscount20() {
        driver.findElement(twentyImprovedPanoramaDiscount20).click();
        return new StorePage(driver);
    }

    // про аккаунт

    public StorePage proVidjetPlace() {
        driver.findElement(proVidjetPlace).click();
        return new StorePage(driver);
    }

    public StorePage proVidjetTwoDPlan() {
        driver.findElement(proVidjetTwoDPlan).click();
        return new StorePage(driver);
    }

    public StorePage proVidjetVirtualTour() {
        driver.findElement(proVidjetVirtualTour).click();
        return new StorePage(driver);
    }

    public StorePage proVidjet3D360() {
        driver.findElement(proVidjet3D360).click();
        return new StorePage(driver);
    }

    public StorePage proVidjetViewFromUp() {
        driver.findElement(proVidjetViewFromUp).click();
        return new StorePage(driver);
    }

    public StorePage proVidjetThreeDView() {
        driver.findElement(proVidjetThreeDView).click();
        return new StorePage(driver);
    }

    public StorePage proVidjetQrCode() {
        driver.findElement(proVidjetQrCode).click();
        return new StorePage(driver);
    }

    public StorePage proVidjetMyDecoration() {
        driver.findElement(proVidjetMyDecoration).click();
        return new StorePage(driver);
    }

    public StorePage proVidjetVrFlat() {
        driver.findElement(proVidjetVrFlat).click();
        return new StorePage(driver);
    }

    public StorePage proVidjetFreelancerRender() {
        driver.findElement(proVidjetFreelancerRender).click();
        return new StorePage(driver);
    }

    //выбираем метод оплаты

    public StorePage selectPaymentByQiwiWallet() {
        driver.findElement(paymentByQiwiWallet).click();
        return new StorePage(driver);
    }

    public StorePage selectPaymentByYandexMoney() {
        driver.findElement(paymentByYandexMoney).click();
        return new StorePage(driver);
    }

    public StorePage selectPaymentByWMR() {
        driver.findElement(paymentByWMR).click();
        return new StorePage(driver);
    }

    public StorePage selectPaymentByW1PaySend() {
        driver.findElement(paymentByW1PaySend).click();
        return new StorePage(driver);
    }

    public StorePage selectPaymentByAlfaBankPSR() {
        driver.findElement(paymentByAlfaBankPSR).click();
        return new StorePage(driver);
    }


    public StorePage selectPaymentByW1PaySendPSB() {
        driver.findElement(paymentByW1PaySendPSB).click();
        return new StorePage(driver);
    }

    public StorePage selectPaymentByBankCardPSR() {
        driver.findElement(paymentByBankCardPSR).click();
        return new StorePage(driver);
    }

    public StorePage selectPaymentByCardHalvaPSR() {
        driver.findElement(paymentByCardHalvaPSR).click();
        return new StorePage(driver);
    }

    public StorePage selectPaymentByApplePayPSR() {
        driver.findElement(paymentByApplePayPSR).click();
        return new StorePage(driver);
    }

    public StorePage selectPaymentBySamsungPayPSR() {
        driver.findElement(paymentBySamsungPayPSR).click();
        return new StorePage(driver);
    }

    public StorePage selectPaymentByQiwi40PS () {
        driver.findElement(paymentByQiwi40PS).click();
        return new StorePage(driver);
    }

    public StorePage selectPaymentByMixplatMTSPSR () {
        driver.findElement(paymentByMixplatMTSPSR).click();
        return new StorePage(driver);
    }

    public StorePage selectPaymentByMixplatBeelinePSR () {
        driver.findElement(paymentByMixplatBeelinePSR).click();
        return new StorePage(driver);
    }

    public StorePage selectPaymentByMixplatTele2PSR () {
        driver.findElement(paymentByMixplatTele2PSR).click();
        return new StorePage(driver);
    }



//    public String getOneYearProPrise() {
//        return driver.findElement(oneYearProPrise).getText();
//    }

    /*public StorePage vidjetPlace() {
        driver.findElement(vidjetPlace).click();
        return new StorePage(driver);
    }

    public String getVidjetPlacePrise() {
        return driver.findElement(vidjetPlacePrise).getText();*/



    /*public StorePage twoDPlan () {
        driver.findElement(twoDPlan).click();
        return new StorePage (driver);
    }

    public StorePage virtualTour () {
        driver.findElement(virtualTour).click();
        return new StorePage (driver);
    }

    public StorePage threD () {
        driver.findElement(theeD).click();
        return new StorePage (driver);
    }

    public StorePage vievFromUp () {
        driver.findElement(viewFromUp).click();
        return new StorePage (driver);
    }

    public StorePage threeDViev () {
        driver.findElement(threeDView).click();
        return new StorePage (driver);
    }

    public StorePage qrCode () {
        driver.findElement(qrCode).click();
        return new StorePage (driver);
    }

    public StorePage myDecoration () {
        driver.findElement(myDecoration).click();
        return new StorePage (driver);
    }

    public StorePage vrFlat () {
        driver.findElement(vrFlat).click();
        return new StorePage (driver);
    }

    public StorePage freelancerRender () {
        driver.findElement(freelancerRender).click();
        return new StorePage (driver);
    }*/

    public StorePage acceptAgreeTerms() {
        driver.findElement(agreeTerms).click(); //ставим галку в чекбокс
        return new StorePage(driver);
    }

    public StorePage clickPayButton(){
        driver.findElement(payButton).click(); //кликаем на кнопку купить
        return new StorePage(driver);
    }


}
