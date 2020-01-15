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

    @FindBy(id = "visa-card-show")
    private WebElement btnTarjetaCredito;


    @FindBy(xpath = "//*[@id=\"password-invalid\"]")
    private WebElement btncvv;

    @FindBy(xpath = ("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/select[1]"))
    private WebElement click1;

    @FindBy(xpath = ("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/select[1]/option[3]"))
    private WebElement click2;

    @FindBy(xpath = ("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/select[2]"))
    private WebElement click3;

    @FindBy(xpath = ("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/select[2]/option[5]"))
    private WebElement click4;

    @FindBy(xpath = ("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/button"))
    private WebElement btnContinuarTX;

    @FindBy(xpath = ("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/button"))
    private WebElement btnContinuarTX2;

    @FindBy(xpath = ("//*[@id='control']/frame[2]"))
    private WebElement frame;

    @FindBy(name = ("rutClient"))
    private WebElement rutClient;

    @FindBy(name = ("passwordClient"))
    private WebElement passw;

    @FindBy(xpath = ("/html/body/div/form/table/tbody/tr[9]/td/input[1]"))
    private WebElement btnAceptar;

    @FindBy(xpath = ("/html/body/div/form/table/tbody/tr[4]/td/input"))
    private WebElement btnAceptar2;

    @FindBy(xpath = ("//*[@id=\"j_idt49:j_idt54\"]"))
    private WebElement btnACK;




    WebDriverWait wait = new WebDriverWait(Applicationlauncher.driver, 15);

    public boolean clickPagoMall(){
        try{
            wait.until(ExpectedConditions.visibilityOf(btnPagoMall));
            btnPagoMall.click();
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }

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

    public void clickbtnCredito() {
        wait.until(ExpectedConditions.visibilityOf(btnCredito));
        btnCredito.click();
    }

    public void btnTarjetaCredito(String tc) {
        wait.until(ExpectedConditions.visibilityOf(btnTarjetaCredito));
        btnTarjetaCredito.clear();
        btnTarjetaCredito.sendKeys(tc);
    }

    public void btncvv(String cvv) {
        wait.until(ExpectedConditions.visibilityOf(btncvv));
        btncvv.sendKeys(cvv);
    }

    public void clickclick1(){
        wait.until(ExpectedConditions.visibilityOf(click1));
        click1.click();
    }

    public void clickclick2(){
        wait.until(ExpectedConditions.visibilityOf(click2));
        click2.click();
    }

    public void clickclick3(){
        wait.until(ExpectedConditions.visibilityOf(click3));
        click3.click();
    }

    public void clickclick4(){
        wait.until(ExpectedConditions.visibilityOf(click4));
        click4.click();
    }

    public void clickbtnContinuarTX(){
        wait.until(ExpectedConditions.visibilityOf(btnContinuarTX));
        btnContinuarTX.click();
    }

    public void clickbtnContinuarTX2(){
        wait.until(ExpectedConditions.visibilityOf(btnContinuarTX2));
        btnContinuarTX2.click();
    }

    public void switchToFrame(){
        wait.until(ExpectedConditions.visibilityOf(frame));
        Applicationlauncher.driver.switchTo().frame(frame);

    }

    public void clickrutClient(String rut){
        wait.until(ExpectedConditions.visibilityOf(rutClient));
        rutClient.clear();
        rutClient.sendKeys(rut);
    }

    public void clickpasswordClient(String pass){
        wait.until(ExpectedConditions.visibilityOf(passw));
        passw.clear();
        passw.sendKeys(pass);
    }

    public void clickbtnAceptar(){
        wait.until(ExpectedConditions.visibilityOf(btnAceptar));
        btnAceptar.click();
    }

    public void clickbtnAceptar2(){
        wait.until(ExpectedConditions.visibilityOf(btnAceptar2));
        btnAceptar2.click();
    }

    public void clickbtnACK(){
        wait.until(ExpectedConditions.visibilityOf(btnACK));
        btnACK.click();
    }


}