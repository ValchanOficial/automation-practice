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
	public String productTotal() {
		return product.productsTotal().getText();//$16.51
	}
	public String shippingTotal() {
		return product.shippingTotal().getText();//$2.00
	}
	public String total() {
		return product.total().getText();//$18.51
	}
	public void checkout() {
		product.proceedToCheckout().click();
	}
	public String checkProductName() {
		return product.productNameCheck().getText();//Faded Short Sleeve T-shirts
	}
}