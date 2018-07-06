package tasks;

import org.openqa.selenium.WebDriver;
import appobjects.paymentAppObject;

public class paymentTask {
	private paymentAppObject payment;
	
	public paymentTask(WebDriver driver){
		this.payment = new paymentAppObject(driver);
	}
	public void payByBankWire() {
		this.payment.payByBankWire().click();
	}
	public void proceed() {
		this.payment.proceed().click();
	}
}