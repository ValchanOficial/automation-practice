package verificationpoints;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;
import framework.report;
import framework.screenshot;

public class verificationPoint {
	private static final String PRODUCT_NAME = "Faded Short Sleeve T-shirts";
	private static final String CHECK_ORDER = "Your order on My Store is complete.";
	private static final String CHECK_TOTAL = "$18.51";
	private WebDriver driver;
	
	public verificationPoint(WebDriver driver) {
		this.driver = driver;
	}
	private boolean pageContains(String text){
		return this.driver.getPageSource().contains(text);
	}
	public void checkProduct(String name) {
		if(name == PRODUCT_NAME) {
			report.log(Status.PASS, "Produto correto.", screenshot.capture(driver));
		} else {
			report.log(Status.FAIL, "Produto incorreto.", screenshot.capture(driver));
		}
	}
	public void checkOrder() {
		if(this.pageContains(CHECK_ORDER)) {
			report.log(Status.PASS, "Compra realizada com sucesso.", screenshot.capture(driver));
		} else {
			report.log(Status.FAIL, "Falha ao comprar.", screenshot.capture(driver));
		}
	}
	public void checkTotal(String total) {
		if(total == CHECK_TOTAL) {
			report.log(Status.PASS, "Valor total da compra correto.", screenshot.capture(driver));
		} else {
			report.log(Status.FAIL, "Valor total da compra incorreto.", screenshot.capture(driver));
		}
	}
	public void checkAddress() {
		report.log(Status.PASS, "ADDRESS.", screenshot.capture(driver));
	}
}