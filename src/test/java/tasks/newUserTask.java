package tasks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import appobjects.newUserAppObject;

public class newUserTask {
	private newUserAppObject user;
	
	public newUserTask(WebDriver driver){
		this.user = new newUserAppObject(driver);
	}
	public void newAccount(String email) {
		this.user.emailNewUser().sendKeys(email);
		this.user.createAnAccount().click();
	}
	public void personalInformation(String firstName, String lastName, String password, String address, String city, String postcode, String mobile) {
		this.user.title().click();
		this.user.firstName().sendKeys(firstName);
		this.user.lastName().sendKeys(lastName);
		this.user.password().sendKeys(password);
		this.user.days().sendKeys(Keys.ARROW_DOWN);
		this.user.days().sendKeys(Keys.ENTER);
		this.user.month().sendKeys(Keys.ARROW_DOWN);
		this.user.month().sendKeys(Keys.ENTER);
		this.user.year().sendKeys(Keys.ARROW_DOWN);
		this.user.year().sendKeys(Keys.ENTER);
		this.user.address().sendKeys(address);
		this.user.city().sendKeys(city);
		this.user.state().sendKeys(Keys.ARROW_DOWN);
		this.user.state().sendKeys(Keys.ENTER);
		this.user.postCode().sendKeys(postcode);
		this.user.country().sendKeys(Keys.ARROW_DOWN);
		this.user.country().sendKeys(Keys.ENTER);
		this.user.mobilePhone().sendKeys(mobile);
	}
	public void submitAccount() {
		this.user.submitAccount().click();
	}
}