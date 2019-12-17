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




/*

            for( int i=0; i < compras.length; i++ ) {
        commerceCode = (String) compras[i][0];
        buyOrder = (String) compras[i][1];
        amount = (String) compras[i][2];
        WebElement CommerceCode = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("j_idt34:ewptdCommerceCode")));
        CommerceCode.clear();
        CommerceCode.sendKeys(commerceCode);

        WebElement BuyOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("j_idt34:ewptdBuyOrder")));
        BuyOrder.clear();
        BuyOrder.sendKeys(buyOrder);

        WebElement Amount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("j_idt34:ewptdAmount")));
        Amount.clear();
        Amount.sendKeys(amount);

        WebElement btnSave = wait.until(presenceOfElementLocated(By.id("j_idt34:j_idt43")));
        btnSave.click();
        Thread.sleep(1500);
    }

    WebElement initTransaction = wait.until(presenceOfElementLocated(By.id("ewebpayTestForm:j_idt32")));
            initTransaction.click();
*/

}
