package tasks;

import org.openqa.selenium.WebDriver;
import appobjects.addProductToCartAppObject;

public class addProductToCartTask {
	private addProductToCartAppObject product;
	
	public addProductToCartTask(WebDriver driver){
		this.product = new addProductToCartAppObject(driver);
	}
	public void addProductToCart() {
		product.addToCart().click();
	}
	public String total() {
		return product.total().getText();//$18.51
	}
	public void checkout() {
		product.proceedToCheckout().click();
	}
	public void checkoutSummary() {
		product.proceedToCheckoutSummary().click();
	}
	public String productName() {
		return product.productNameCheck().getText();
	}
}