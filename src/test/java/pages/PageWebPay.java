package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Applicationlauncher;

public class PageWebPay {

    public static WebDriver driver;

    @FindBy(id = "j_idt10:j_idt14")
    private WebElement btnPagoMall;

    @FindBy(id = "j_idt34:ewptdCommerceCode")
    private WebElement CommerceCode;

    @FindBy(id = "j_idt34:ewptdBuyOrder")
    private WebElement BuyOrder;

    @FindBy(id = "j_idt34:ewptdAmount")
    private WebElement Amount;

    @FindBy(id = "j_idt34:j_idt43")
    private WebElement btnSave;

    @FindBy(id = "ewebpayTestForm:j_idt32")
    private WebElement initTransaction;

    @FindBy(xpath = ("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-payment/a[1]"))
    private WebElement btnCredito;



    WebDriverWait wait = new WebDriverWait(Applicationlauncher.driver, 15);

    public void clickPagoMall(){
        wait.until(ExpectedConditions.visibilityOf(btnPagoMall));
        btnPagoMall.click();
    }

    public void ingresarCodigoComercio(String comercio){
        wait.until(ExpectedConditions.visibilityOf(CommerceCode));
        CommerceCode.clear();
        CommerceCode.sendKeys(comercio);
    }

    public void ingresarBuyOrder(String order){
        wait.until(ExpectedConditions.visibilityOf(BuyOrder));
        BuyOrder.clear();
        BuyOrder.sendKeys(order);
    }

    public void ingresarAmount(String monto){
        wait.until(ExpectedConditions.visibilityOf(Amount));
        Amount.clear();
        Amount.sendKeys(monto);
    }

    public void clickBtnSave(){
        wait.until(ExpectedConditions.visibilityOf(btnSave));
        btnSave.click();
    }

    public void clickInitTransaction(){
        wait.until(ExpectedConditions.visibilityOf(initTransaction));
        initTransaction.click();
    }

    public void clickbtnCredito(){
        wait.until(ExpectedConditions.visibilityOf(btnCredito));
        btnCredito.click();
    }

    @FindBy(id = "visa-card-show")
    private WebElement btnTarjetaCredito;

    public void btnTarjetaCredito(String tc) {
        wait.until(ExpectedConditions.visibilityOf(btnTarjetaCredito));
        btnTarjetaCredito.clear();
        btnTarjetaCredito.sendKeys(tc);
    }

    @FindBy(id = "password-invalid")
    private WebElement btncvv;

    public void btncvv(String cvv) {
        wait.until(ExpectedConditions.visibilityOf(btncvv));
        btncvv.sendKeys(cvv);
    }

    @FindBy(xpath = ("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/select[1]"))
    private WebElement click1;

    public void clickclick1(){
        wait.until(ExpectedConditions.visibilityOf(click1));
        click1.click();
    }

    @FindBy(xpath = ("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/select[1]/option[3]"))
    private WebElement click2;

    public void clickclick2(){
        wait.until(ExpectedConditions.visibilityOf(click2));
        click2.click();
    }

    @FindBy(xpath = ("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/select[2]"))
    private WebElement click3;

    public void clickclick3(){
        wait.until(ExpectedConditions.visibilityOf(click3));
        click3.click();
    }

    @FindBy(xpath = ("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/select[2]/option[5]"))
    private WebElement click4;

    public void clickclick4(){
        wait.until(ExpectedConditions.visibilityOf(click4));
        click4.click();
    }

    @FindBy(xpath = ("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/button"))
    private WebElement btnContinuarTX;

    public void clickbtnContinuarTX(){
        wait.until(ExpectedConditions.visibilityOf(btnContinuarTX));
        btnContinuarTX.click();
    }


   /*


            WebElement btncvv = wait.until(presenceOfElementLocated(By.id("password-invalid")));
            btncvv.click();
            Thread.sleep(1500);
            btncvv.sendKeys("1234");

            driver.findElement(By.xpath("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/select[1]")).click();
            driver.findElement(By.xpath("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/select[1]/option[3]")).click();
            driver.findElement(By.xpath("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/select[2]")).click();
            driver.findElement(By.xpath("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/select[2]/option[5]")).click();

            Thread.sleep(1500);*/


}
