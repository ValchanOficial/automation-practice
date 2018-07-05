package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addProductToCartAppObject {
	private WebDriver driver;
	
	public addProductToCartAppObject(WebDriver driver) {
		this.driver = driver;
	}	
	public WebElement addToCart() {
		return this.driver.findElement(By.className("button-container"));
	}
	public WebElement productsTotal() {
		return this.driver.findElement(By.className("ajax_block_products_total"));//$16.51
	}
	public WebElement shippingTotal() {
		return this.driver.findElement(By.className("ajax_cart_shipping_cost"));//$2.00
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
}