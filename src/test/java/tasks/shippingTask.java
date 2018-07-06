package tasks;

import org.openqa.selenium.WebDriver;
import appobjects.shippingAppObject;

public class shippingTask {
	private shippingAppObject shipping;
	
	public shippingTask(WebDriver driver){
		this.shipping = new shippingAppObject(driver);
	}
	public void agreeTerms() {
		this.shipping.check().click();
	}
	public void proceed() {
		this.shipping.proceed().click();
	}
}