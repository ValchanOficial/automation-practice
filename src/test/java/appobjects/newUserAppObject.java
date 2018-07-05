package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class newUserAppObject {
	private WebDriver driver;
	
	public newUserAppObject(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement emailNewUser() {
		return this.driver.findElement(By.id("email_create"));
	}
	public WebElement createAnAccount() {
		return this.driver.findElement(By.id("SubmitCreate"));
	}
	public WebElement title() {
		return this.driver.findElement(By.id("id_gender2"));
	}
	public WebElement firstName() {
		return this.driver.findElement(By.id("customer_firstname"));
	}
	public WebElement lastName() {
		return this.driver.findElement(By.id("customer_lastname"));
	}
	public WebElement password() {
		return this.driver.findElement(By.id("passwd"));
	}
	public WebElement days() {
		return this.driver.findElement(By.id("days"));
	}
	public WebElement month() {
		return this.driver.findElement(By.id("uniform-months"));
	}
	public WebElement year() {
		return this.driver.findElement(By.id("years"));
	}
	public WebElement address() {
		return this.driver.findElement(By.id("address1"));
	}
	public WebElement city() {
		return this.driver.findElement(By.id("city"));
	}
	public WebElement state() {
		return this.driver.findElement(By.id("id_state"));
	}
	public WebElement postCode() {
		return this.driver.findElement(By.id("postcode"));
	}
	public WebElement mobilePhone() {
		return this.driver.findElement(By.id("phone_mobile"));
	}
	public WebElement submitAccount() {
		return this.driver.findElement(By.id("submitAccount"));
	}
}