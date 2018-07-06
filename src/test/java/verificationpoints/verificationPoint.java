package verificationpoints;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;
import framework.report;
import framework.screenshot;

public class verificationPoint {
	private String CHECK_ORDER = "Your order on My Store is complete.";
	private WebDriver driver;
	
	public verificationPoint(WebDriver driver) {
		this.driver = driver;
	}
	private boolean pageContains(String text){
		return this.driver.getPageSource().contains(text);
	}
	public void checkProduct(String name) {
		if(this.pageContains(name)) {
			report.log(Status.PASS, "Validação - Produto correto.", screenshot.capture(driver));
		} else {
			report.log(Status.FAIL, "Validação - Produto incorreto.", screenshot.capture(driver));
		}
	}
	public void checkOrder() {
		if(this.pageContains(CHECK_ORDER)) {
			report.log(Status.PASS, "Validação - Compra realizada com sucesso.", screenshot.capture(driver));
		} else {
			report.log(Status.FAIL, "Validação - Falha ao comprar.", screenshot.capture(driver));
		}
	}
	public void checkTotal(String total) {
		if(this.pageContains(total)) {
			report.log(Status.PASS, "Validação - Valor total da compra correto.", screenshot.capture(driver));
		} else {
			report.log(Status.FAIL, "Validação - Valor total da compra incorreto.", screenshot.capture(driver));
		}
	}
	public void checkAddress(String address, String city) {
		if(this.pageContains(address) && this.pageContains(city)) {
			report.log(Status.PASS, "Validação - O endereço está correto.", screenshot.capture(driver));
		} else {
			report.log(Status.FAIL, "Validação - O endereço está incorreto.", screenshot.capture(driver));
		}
	}
}