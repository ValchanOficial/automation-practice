package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class shippingAppObject {
	private WebDriver driver;
	
	public shippingAppObject(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement check() {
		return this.driver.findElement(By.id("uniform-cgv check"));
	}
	public WebElement proceed() {
		return this.driver.findElement(By.id("button btn btn-default standard-checkout button-medium proceed"));
	}
}