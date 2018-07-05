package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class paymentAppObject {
	private WebDriver driver;
	
	public paymentAppObject(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement totalProduct() {
		return this.driver.findElement(By.id("total_product"));
	}
	public WebElement totalShipping() {
		return this.driver.findElement(By.id("total_shipping"));
	}
	public WebElement totalPrice() {
		return this.driver.findElement(By.id("total_price"));
	}
	public WebElement payByBankWire() {
		return this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]"));
	}
	public WebElement proceed() {
		return this.driver.findElement(By.id("button btn btn-default button-medium"));
	}
}