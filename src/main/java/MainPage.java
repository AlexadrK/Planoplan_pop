import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    //private By signInButton1 = By.xpath("//*[@id=\"header\"]/div[2]/ul/li[7]/a/span");//кнопка вызывающая окно логина
    private By signInButton1 = By.xpath("//*[@id=\"header\"]/div/ul/li[7]/a/span");//кнопка вызывающая окно логина
    private By signInButton2 = By.xpath("//*[@id=\"login_submit\"]/span/span");//кнопка подтверждения пароля
    private By userNameField = By.xpath("//*[@id=\"login_mail\"]");//поле логина
    private By passwordField = By.xpath("//*[@id=\"login_pass\"]");//поле пароля

    private By linkToStore = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/center/div/div[2]/a");//переход в магазин
    private By linkToProStore = By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div[2]/a");//переход в Pro магазин

    public  MainPage clickSignInButton1() {
        driver.findElement(signInButton1).click();
        return new MainPage(driver);
    }

    public MainPage clickSignInButton2() {
        driver.findElement(signInButton2).click();
        return new MainPage(driver);
    }

    public MainPage typeUserName(String username) {
        driver.findElement(userNameField).sendKeys(username);
        return this;
    }

    public MainPage typePassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public MainPage clickLinkToStore(){
        driver.findElement(linkToStore).click();
        return this;
    }
    public MainPage clickLinkToProStore(){
        driver.findElement(linkToProStore).click();
        return this;
    }

}

