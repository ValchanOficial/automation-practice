package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class addProductToCartAppObject {
	private WebDriver driver;
	
	public addProductToCartAppObject(WebDriver driver) {
		this.driver = driver;
	}	
	public WebElement addToCart() {
		WebElement element = this.driver.findElement(By.className("button-container"));
		String js = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";
		((JavascriptExecutor) driver).executeScript(js, element);
		return element;
	}
	public WebElement total() {
		return this.driver.findElement(By.className("ajax_block_cart_total"));//$18.51
	}
	public WebElement proceedToCheckout() {
		return this.driver.findElement(By.className("btn btn-default button button-medium"));
	}
	public WebElement productNameCheck() {
		return this.driver.findElement(By.className("product-name"));//Faded Short Sleeve T-shirts
	}
	public WebElement proceedToCheckoutSummary() {
		return this.driver.findElement(By.className("button btn btn-default standard-checkout button-medium"));
	}
}