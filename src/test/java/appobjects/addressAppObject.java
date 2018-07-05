package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addressAppObject {
	private WebDriver driver;
	
	public addressAppObject(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement proceed() {
		return this.driver.findElement(By.id("button btn btn-default button-medium"));
	}
	//falta completar	
}