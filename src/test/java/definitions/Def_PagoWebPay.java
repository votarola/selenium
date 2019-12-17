package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Applicationlauncher;


public class Def_PagoWebPay {

    public static String comercio = "597038357948";
    public static String order = "23213";
    public static String monto = "321";

    public static Object compras[][] = {
            {"597038357948","1","1500"},
            {"597038357948","1","2000"},
            {"597038357921","1","2500"},
    };

    @Given("^quiero realizar un pago por webpay mall$")
    public void quiero_realizar_un_pago_por_webpay_mall() throws Throwable {


        Applicationlauncher.setUp();
        Applicationlauncher.driver.get("https://web3qa.test.transbank.cl:8443/ewebpay/jsf/welcome.jsf");


    }

    @When("^ingreso los montos y pago con \"([^\"]*)\"$")
    public void ingreso_los_montos_y_pago_con(String tarjeta) throws Throwable {
        String commerceCode = "";
        String buyOrder = "";
        String amount = "";

        WebDriverWait wait = new WebDriverWait(Applicationlauncher.driver, 15);

        try {
            Applicationlauncher.pageWebPay.clickPagoMall();

            for( int i=0; i < compras.length; i++ ) {
                commerceCode = (String) compras[i][0];
                buyOrder = (String) compras[i][1];
                amount = (String) compras[i][2];

                Applicationlauncher.pageWebPay.ingresarCodigoComercio(commerceCode);
                Applicationlauncher.pageWebPay.ingresarBuyOrder(buyOrder);
                Applicationlauncher.pageWebPay.ingresarAmount(amount);

                Applicationlauncher.pageWebPay.clickBtnSave();
                Thread.sleep(1500);
            }

            Applicationlauncher.pageWebPay.clickInitTransaction();
        } catch (Exception e) {
            e.printStackTrace();
            //driver.quit();
        }
    }

    @Then("^se realiza el pago$")
    public void se_realiza_el_pago() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /*public static void main(String[] args) throws InterruptedException {
        String commerceCode = "";
        String buyOrder = "";
        String amount = "";


        Applicationlauncher.setUp();

        WebDriverWait wait = new WebDriverWait(Applicationlauncher.driver, 15);

        try {
            Applicationlauncher.driver.get("https://web3qa.test.transbank.cl:8443/ewebpay/jsf/welcome.jsf");

            Applicationlauncher.pageWebPay.clickPagoMall();

            for( int i=0; i < compras.length; i++ ) {
                commerceCode = (String) compras[i][0];
                buyOrder = (String) compras[i][1];
                amount = (String) compras[i][2];

                Applicationlauncher.pageWebPay.ingresarCodigoComercio(commerceCode);
                Applicationlauncher.pageWebPay.ingresarBuyOrder(buyOrder);
                Applicationlauncher.pageWebPay.ingresarAmount(amount);

                Applicationlauncher.pageWebPay.clickBtnSave();
                Thread.sleep(1500);
            }

            Applicationlauncher.pageWebPay.clickInitTransaction();

           *//* WebElement btnCredito = wait.until(presenceOfElementLocated(By.xpath("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-payment/a[1]")));
            btnCredito.click();


            driver.findElement(By.id("visa-card-show")).sendKeys("377826100086878");
            driver.findElement(By.xpath("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/select[1]")).click();
            driver.findElement(By.xpath("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/select[1]/option[3]")).click();
            driver.findElement(By.xpath("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/select[2]")).click();
            driver.findElement(By.xpath("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/select[2]/option[5]")).click();
            driver.findElement(By.id("password-invalid")).sendKeys("1234");

            Thread.sleep(2000);

            driver.findElement(By.xpath("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/button")).click();
            driver.findElement(By.xpath("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/div/div/div[1]/select")).click();
            driver.findElement(By.xpath("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/div/div/div[1]/select/option[1]")).click();

            driver.findElement(By.xpath("/html/body/app-root/app-home/main/app-home-normal/main/div/div/div/app-credit/div/div/form/button")).click();

            //TODO frame
            WebElement frame = wait.until(presenceOfElementLocated(By.xpath("//*[@id='control']/frame[2]")));
            driver.switchTo().frame(frame);

            WebElement rutClient = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("rutClient")));
            rutClient.clear();
            rutClient.sendKeys("111111111");

            WebElement passwordClient = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("passwordClient")));
            passwordClient.clear();
            passwordClient.sendKeys("123");

            driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[9]/td/input[1]")).click();
            driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[4]/td/input")).click();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

            driver.findElement(By.id("j_idt49:j_idt54")).click();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }*//*

            //WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("h3>div")));
            //System.out.println(firstResult.getAttribute("textContent"));
        } catch (Exception e) {
            e.printStackTrace();
            //driver.quit();
        }

    }
*/
}
