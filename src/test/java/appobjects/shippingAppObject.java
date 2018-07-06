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
		return this.driver.findElement(By.id("cgv"));
	}
	public WebElement proceed() {
		return this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button"));
	}
}