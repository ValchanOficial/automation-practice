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
		return this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button"));
	}
}