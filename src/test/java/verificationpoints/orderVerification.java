package verificationpoints;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;

public class orderVerification {
	private WebDriver driver;
	public orderVerification(WebDriver driver) {
		this.driver = driver;
	}
		//verificationPoint
		public void checkOrder() {
			//verifica��oComAssertTrue
			assertTrue(this.driver.getPageSource().contains("Your order on My Store is complete."));
		}
}