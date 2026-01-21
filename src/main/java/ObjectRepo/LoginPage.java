package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(xpath="//input[@name='user_name']")
private WebElement usernameTxt;
@FindBy(xpath="//input[@name='user_password']")
private WebElement passwordTxt;
@FindBy(xpath="//input[@id='submitButton']")
private WebElement loginBtn;
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getUsernameTxt() {
	return usernameTxt;
}
public WebElement getPasswordTxt() {
	return passwordTxt;
}
public WebElement getLoginBtn() {
	return loginBtn;
}
public void loginPageOperation(String username,String password) {
	getUsernameTxt().sendKeys( username);
	getPasswordTxt().sendKeys(password);
	getLoginBtn().click();
}
}
