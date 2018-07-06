package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addProductToCartAppObject {
	private WebDriver driver;

	public addProductToCartAppObject(WebDriver driver) {
		this.driver = driver;
	}	
	public WebElement addToCart() {
		this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]")).click();
		return this.driver.findElement(By.id("add_to_cart"));
	}
	public WebElement total() {
		return this.driver.findElement(By.id("total_price"));
	}
	public WebElement proceedToCheckout() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a")));
		return element;
	}
	public WebElement productNameCheck() {
		return this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[3]/h1"));
	}
	public WebElement proceedToCheckoutSummary() {
		return this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]"));
	}
}