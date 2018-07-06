package testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;
import framework.drivers;
import framework.report;
import framework.screenshot;
import tasks.addProductToCartTask;
import tasks.addressTask;
import tasks.newUserTask;
import tasks.paymentTask;
import tasks.shippingTask;
import verificationpoints.verificationPoint;

public class buyProductTestCase {
	private WebDriver driver;
	private addProductToCartTask add;
	private addressTask address;
	private newUserTask newUser;
	private paymentTask payment;
	private shippingTask shipping;
	private verificationPoint verificationPoint;
	
	@Before
	public void setUp() {
		report.startTest("Teste - Realizar uma compra com sucesso.");
		driver = drivers.getFirefoxDriver();
		add = new addProductToCartTask(driver);
		address = new addressTask(driver);
		newUser = new newUserTask(driver);
		payment = new paymentTask(driver);
		shipping = new shippingTask(driver);
		verificationPoint = new verificationPoint(driver);
	}
	@Test
	public void testMain() {
		driver.get("http://automationpractice.com/index.php?");
		driver.manage().window().maximize();
		report.log(Status.INFO, "O website foi carregado.", screenshot.capture(driver));
		add.addProductToCart();
		String name = add.productName();
		String total = add.total();
		add.checkout();
		verificationPoint.checkProduct(name);
		add.checkoutSummary();
		newUser.newAccount("teste@val.com");
		newUser.personalInformation("Teste", "Teste da Valeria", "123456789", "11  ", "September ", "2018  ", "2018", "Teste", "123456", "1589653285");
		verificationPoint.checkAddress();
		address.proceed();
		shipping.agreeTerms();
		shipping.proceed();
		verificationPoint.checkTotal(total);
		payment.payByBankWire();
		payment.proceed();
		verificationPoint.checkOrder();
		}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}