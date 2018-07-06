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
	public void personalInformation(String firstName, String lastName, String password, String day, String month, String year, String address, String city, String postcode, String mobile) {
		this.user.title().click();
		this.user.firstName().sendKeys(firstName);
		this.user.lastName().sendKeys(lastName);
		this.user.password().sendKeys(password);
		this.user.days().sendKeys(day);
		this.user.month().sendKeys(month);
		this.user.year().sendKeys(year);
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