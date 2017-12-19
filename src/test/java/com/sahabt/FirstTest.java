package com.sahabt;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstTest {
    WebDriver driver;




    public String driverName = "webdriver.chrome.driver";
    public String driverPath = "driver/chromedriver.exe";
    public String url = "http://www.hepsiburada.com";


    @Before
    public void setup() {
        System.setProperty(driverName, driverPath);
        driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.get("http://www.hepsiburada.com");
        click(By.cssSelector(".insider-opt-in-disallow-button"));
    }

    public void login(String email, String password) throws InterruptedException {
        click(By.cssSelector("#myAccount .cart-copy:nth-of-type(2)"));
//        wait(1000);
//        driver.findElement(By.id("login")).click();
        Thread.sleep(1000);
        click(By.cssSelector("#login"));
        click(By.cssSelector(".login-selections .control-group:nth-of-type(1) .text"));
        sendKey(By.id("email"), email);
        sendKey(By.id("password"), password);
        click(By.cssSelector("#form-login button"));

    }
    public void createUser(String password, String repeat) throws InterruptedException {
        click(By.cssSelector("#myAccount .cart-copy:nth-of-type(2)"));
        Thread.sleep(1000);
        click(By.cssSelector("#register"));
        sendKey(By.id("firstname"),"ali");
        sendKey(By.id("lastname"),"asdf");
        sendKey(By.id("email-register"),"aykut456@gmail.com");
        sendKey(By.cssSelector("#password-register"),password);
        sendKey(By.cssSelector("#password-repeat"),repeat);
        click(By.cssSelector(".form-actions"));

    }

    public void mouse() throws InterruptedException {
        click(By.cssSelector("#elektronik span"));
        Thread.sleep(1000);
        click(By.cssSelector(".nav-home > [data-bind] > [href=\"\\/bilgisayarlar-c-2147483646\"]:nth-of-type(1)"));
        click(By.cssSelector("[href=\"\\/cevre-birimleri-c-3013120\"]"));
        click(By.cssSelector("[href=\"\\/mouse-c-52\"]"));
//        click(By.cssSelector(".ins-cancel"));
        click(By.cssSelector("[class=\"page-2 \"]"));
        click(By.cssSelector("[class=\"page-3 \"]"));
        click(By.cssSelector("[class=\"page-4 \"]"));
        click(By.cssSelector("[class=\"page-5 \"]"));
        click(By.cssSelector("[class=\"page-6 \"]"));
        click(By.cssSelector("[class=\"page-7 \"]"));
        click(By.cssSelector("[href=\"\\/trust-ziva-21947-optical-kablolu-mouse-p-HBV000007EOAW\"] .product-title .hb-pl-cn"));
        click(By.cssSelector("#productDescription"));
        driver.findElement(By.xpath("//span[@id='offering-price']/span[.='70']"));
        System.out.println("Fiyat görünür");
        driver.findElement(By.xpath("/html//a[@id='productPaymentInstallment']"));
        click(By.xpath("/html//a[@id='productPaymentInstallment']"));
        System.out.println("Taksit seçenekleri mevcut");
    }
    public void search(){
        find(By.id("productSearch")).sendKeys("ayakkabı");
        submit(By.id("productSearch"));

        click(By.cssSelector("[href=\"\\/erkek-giyim-modelleri-c-12087177\"] span"));
        click(By.cssSelector("[href=\"\\/ayakkabi-c-60000117\"]"));
//        click(By.cssSelector(".ins-cancel"));
        click(By.cssSelector("[href=\"\\/erkek-gunluk-ayakkabilar-c-60000126\"]"));
        click(By.cssSelector(".fiyat .left:nth-of-type(1) .input"));
        sendKey((By.cssSelector(".fiyat .left:nth-of-type(1) .input")),"250");
        sendKey((By.cssSelector(".left:nth-of-type(3) .input")),"500");
        click(By.cssSelector("[for=\"attr-satici-Hepsiburada\"]"));
        click(By.cssSelector("[for=\"brand-voileblanche\"]"));
        click(By.cssSelector("[for=\"attr-numara-44\"]"));
        click(By.cssSelector("[for=\"attr-renk-Kahverengi\"]"));
        click(By.cssSelector(".product-title span"));
        driver.findElement(By.xpath("/html//div[@id='badges']//img[@src='https://images.hepsiburada.net/hbv2/ProductDetails/storefront_widgets_small/freeshipping_1511595771936.png']"));
    }
    public void addbasket() throws InterruptedException {
        Thread.sleep(1000);
        find(By.id("productSearch")).sendKeys("BD300723");
        submit(By.id("productSearch"));
        click(By.cssSelector(".product-title span"));
        Thread.sleep(1000);
//        driver.findElement(By.cssSelector(".ins-cancel"));
  //      click(By.cssSelector(".ins-cancel"));
    //    Thread.sleep(1000);
        click(By.cssSelector(".addToCartButton [type=\"button\"]:nth-of-type(1)"));
        driver.findElements(By.cssSelector(".quantity-wrapper .input-group [type=\"button\"]:nth-child(3)")); }
    public void gobasket1(){
        click(By.cssSelector(".quantity-wrapper .input-group [type=\"button\"]:nth-child(3)"));}
    public void gobasket2(){

        click(By.cssSelector(".quantity-wrapper .input-group [type=\"button\"]:nth-child(3)"));
        System.out.println("Sepette 3 ürün var");

        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'Kargo Bedava')]"));
        Assert.assertTrue("Text not found!", list.size() > 0);
        System.out.println("ücretsiz kargo!!");

    }

    public void apple () throws InterruptedException {
        find(By.id("productSearch")).sendKeys("HBV000007PV9M");
        Thread.sleep(5000);
        click(By.cssSelector(".rfk_image"));
        click(By.cssSelector(".addToCartButton [type=\"button\"]:nth-of-type(1)"));
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.findElement(By.cssSelector(".btn-primary"));
        click(By.cssSelector(".btn-primary"));
    }
    public void completeshopping() throws InterruptedException {
        find(By.id("first-name")).sendKeys("aykut");
        find(By.id("last-name")).sendKeys("turan");
        click(By.cssSelector(".address-form .control-group:nth-child(4) .filter-option"));
        click(By.cssSelector(".address-form .control-group:nth-child(4) [rel=\"10\"] .text"));
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".address-form .control-group:nth-child(5) .filter-option"));
        click(By.cssSelector(".address-form .control-group:nth-child(5) .filter-option"));
        Thread.sleep(5000);
        click(By.cssSelector(".address-form .control-group:nth-child(5) [rel=\"3\"] .text"));
        sendKey(By.id("address"),"6.cadde 120/A");
        sendKey(By.id("address-name"),"nowhere");
        sendKey(By.id("zip-code"),"34250");
        sendKey(By.id("phone"),"05075468502");
        //click(By.cssSelector(".btn-primary"));
    }
    public void payingtime(){
        click(By.cssSelector(".btn-primary"));

        driver.findElement(By.cssSelector(".list-item:nth-of-type(2) [href=\"javascript\\:\\/\\/\"]"));
        System.out.println("Havale seçeneği mevcut");
        find(By.id("card-no")).sendKeys("5235 2900 6000 0000");
        find(By.id("holder-Name")).sendKeys("ali ayşe");
        click(By.cssSelector(".controls:nth-of-type(1) .filter-option"));

        click(By.cssSelector(".controls:nth-of-type(1) [rel=\"9\"] [tabindex]"));

        click(By.cssSelector(".controls:nth-of-type(2) .filter-option"));

        click(By.cssSelector(".controls:nth-of-type(2) [rel=\"8\"] .text"));
        find(By.id("cvc")).sendKeys("202");

        driver.findElement(By.cssSelector("[data-bind=\"text\\: installmentText\\, attr\\: \\{ \\'for\\'\\: \\'installment-\\' \\+ installment\\(\\) \\}\"]"));
        System.out.println("Ödeme seçenekleri bulundu");
        driver.findElement(By.cssSelector(".proceed-container .full:nth-of-type(1) .text"));
        System.out.println("Devam et butonu mevcut");

        click(By.cssSelector(".proceed-container .full:nth-of-type(1) .text"));
        System.out.println("Ödeme tamamlandı");



    }
    public void moveToElement(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }



    public void thread(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public String getTitle() {
        return driver.getTitle();
    }
    public void click(By by) {driver.findElement(by).click();}
    public void submit(By by) {driver.findElement(by).submit();}
    public void sendKey(By by, String value) {
        driver.findElement(by).sendKeys(value);
    }
    public WebElement find(By by) {
        return driver.findElement(by);
    }
}





