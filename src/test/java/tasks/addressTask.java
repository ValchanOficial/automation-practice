package tasks;

import org.openqa.selenium.WebDriver;
import appobjects.addressAppObject;

public class addressTask {
	private addressAppObject address;
	
	public addressTask(WebDriver driver){
		this.address = new addressAppObject(driver);
	}
	public void proceed() {
		this.address.proceed().click();
	}
}