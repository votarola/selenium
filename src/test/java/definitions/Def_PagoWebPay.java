package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Applicationlauncher;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;


public class Def_PagoWebPay {

    public static String comercio = "597038357948";
    public static String order = "23213";
    public static String monto = "321";
    public static String tc = "377826100086878";
    public static String cvv = "1234";
    public static String rut = "111111111";
    public static String pass = "123";


    public static Object[][] compras = {
            {"597038357948", "1", "1500"},
            {"597038357948", "1", "2000"},
            {"597038357921", "1", "2500"},
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

            for (int i = 0; i < compras.length; i++) {
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
            Thread.sleep(1500);

        } catch (Exception e) {
            e.printStackTrace();
            //driver.quit();
        }
    }

    @Then("^se realiza el pago$")
    public void se_realiza_el_pago() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        Applicationlauncher.pageWebPay.clickbtnCredito();
        Applicationlauncher.pageWebPay.btnTarjetaCredito(tc);
        Thread.sleep(2000);
        Applicationlauncher.pageWebPay.clickclick1();
        Applicationlauncher.pageWebPay.clickclick2();
        Applicationlauncher.pageWebPay.clickclick3();
        Applicationlauncher.pageWebPay.clickclick4();
        Applicationlauncher.pageWebPay.btncvv(cvv);
        Thread.sleep(2000);
        Applicationlauncher.pageWebPay.clickbtnContinuarTX();
        Applicationlauncher.pageWebPay.clickbtnContinuarTX2();
        Applicationlauncher.pageWebPay.switchToFrame();
        Applicationlauncher.pageWebPay.clickrutClient(rut);
        Applicationlauncher.pageWebPay.clickpasswordClient(pass);
        Applicationlauncher.pageWebPay.clickbtnAceptar();
        Applicationlauncher.pageWebPay.clickbtnAceptar2();
        Applicationlauncher.pageWebPay.clickbtnACK();

    }
}