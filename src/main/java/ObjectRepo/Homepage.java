package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtillity.SelenniumUtility;

public class Homepage {
@FindBy(xpath="//a[text()='Contacts']")
private WebElement contactsBtn;
@FindBy(xpath="//a[@href='index.php?module=Leads&action=index']")
private WebElement leadsBtn;
@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
private WebElement iconBtn;
@FindBy(xpath="//a[@href='index.php?module=Users&action=Logout']")
private WebElement logoutBtn;

public Homepage(WebDriver d) {
	PageFactory.initElements(d,this);
}

public WebElement getContactsBtn() {
	return contactsBtn;
}

public WebElement getLeadsBtn() {
	return leadsBtn;
}
public  WebElement getIconBtn() {
	return iconBtn;
}
public WebElement getLogoutBtn() {
	return logoutBtn;
}

public void logoutOperation(WebDriver d) {
   SelenniumUtility sUtil = new SelenniumUtility();
   sUtil.mouseHoverAction(d, iconBtn);
   getLogoutBtn().click();
}
public void contactclick() {
	getContactsBtn().click();
}
public void leadclick() {
	getLeadsBtn().click();
}
}
