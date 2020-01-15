package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Applicationlauncher;
import utils.UtilsDriver;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class Def_PagoWebPay {
    private static DateTime UsoCom;

    //public static String comercio = "597038357948";
    //public static String order = "23213";
    //public static String monto = "321";
    public static String tc = "377826100086878";
    public static String cvv = "5678";
    public static String rut = "111111111";
    public static String pass = "123";

    public static Object[][] compras = {
            {"597038357948", "11", "1500"},
            {"597038357948", "21", "2000"},
            {"597038357921", "31", "2500"},
            {"597038357921", "41", "8500"},
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
            boolean btnPago = Applicationlauncher.pageWebPay.clickPagoMall();
            Assert.assertTrue("Boton pago Webpay", btnPago);
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
            UtilsDriver.screenshot(Applicationlauncher.driver,"Print");
            Applicationlauncher.pageWebPay.clickInitTransaction();

        } catch (Exception e) {
            e.printStackTrace();
            UtilsDriver.screenshot(Applicationlauncher.driver,"NoSuchElementException");
            //driver.quit();
        }
    }

    @Then("^se realiza el pago$")
    public void se_realiza_el_pago() throws Throwable {


        // Write code here that turns the phrase above into concrete actions

        Applicationlauncher.pageWebPay.clickbtnCredito();
        UtilsDriver.screenshot(Applicationlauncher.driver,"Print");
        Applicationlauncher.pageWebPay.btnTarjetaCredito(tc);
        UtilsDriver.screenshot(Applicationlauncher.driver,"Print");
        Thread.sleep(2000);
        Applicationlauncher.pageWebPay.clickclick1();
        Applicationlauncher.pageWebPay.clickclick2();
        Applicationlauncher.pageWebPay.clickclick3();
        Applicationlauncher.pageWebPay.clickclick4();
        Applicationlauncher.pageWebPay.btncvv(cvv);
        UtilsDriver.screenshot(Applicationlauncher.driver,"Print");
        Thread.sleep(3000);
        Applicationlauncher.pageWebPay.clickbtnContinuarTX();
        UtilsDriver.screenshot(Applicationlauncher.driver,"Print");
        Applicationlauncher.pageWebPay.clickbtnContinuarTX2();
        Applicationlauncher.pageWebPay.switchToFrame();
        Applicationlauncher.pageWebPay.clickrutClient(rut);
        Applicationlauncher.pageWebPay.clickpasswordClient(pass);
        UtilsDriver.screenshot(Applicationlauncher.driver,"Print");
        Applicationlauncher.pageWebPay.clickbtnAceptar();
        UtilsDriver.screenshot(Applicationlauncher.driver,"Print");
        Applicationlauncher.pageWebPay.clickbtnAceptar2();
        Thread.sleep(5000);
        Applicationlauncher.pageWebPay.clickbtnACK();
        Thread.sleep(15000);
        UtilsDriver.screenshot(Applicationlauncher.driver,"Print");


        WebDriverWait wait = new WebDriverWait(Applicationlauncher.driver, 30);
        wait.until(presenceOfElementLocated(By.xpath("//*[@id='j_idt15_header']/span")));
        wait.until(presenceOfElementLocated(By.xpath("//*[@id='ewpDetailOutput_data']/tr[1]")));


        String[][] detalleMontosWebPay = UtilsDriver.montosConfirmadosWebPay( compras.length,  compras[0].length);
        for(int i = 0; i < compras.length; i++){
            for (int j = 0; j <7; j++){
                System.out.print(detalleMontosWebPay[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}

