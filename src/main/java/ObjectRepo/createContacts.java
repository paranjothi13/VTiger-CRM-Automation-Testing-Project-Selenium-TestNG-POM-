package ObjectRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class createContacts {
	@FindBy(xpath="//img[@title='Create Contact...']")
	 private WebElement createContactBtn;
	@FindBy(xpath="//input[@name='firstname']")
	 private WebElement firstnameTxt;
	@FindBy(xpath="//select[@name='leadsource']")
	 private WebElement leadSourceDrop;
	@FindBy(xpath="//input[@name='mobile']")
	 private WebElement mobileTxt;
	@FindBy(xpath="//input[@value='U']")
	 private WebElement asssignedToBtn;
	@FindBy(xpath="//input[@name='lastname']")
	 private WebElement lastnameTxt;
	@FindBy(xpath="//input[@name='title']")
	 private WebElement titleTxt;
	@FindBy(xpath="//input[@name='department']")
	 private WebElement departmentTxt;
	@FindBy(xpath="//input[@name='email']")
	 private WebElement emailTxt;
	@FindBy(xpath="//input[@name='mailingcity']")
	 private WebElement mailingcityTxt;
	@FindBy(xpath="//input[@name='mailingstate']")
	 private WebElement mailingstateTxt;
	@FindBy(xpath="//input[@name='mailingcountry']")
	 private WebElement mailingcountryTxt;
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
	 private WebElement saveBtn;
	public createContacts(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getCreateContactBtn() {
		return createContactBtn;
	}
	public WebElement getFirstnameTxt() {
		return firstnameTxt;
	}
	public WebElement getLeadSourceDrop() {
		return leadSourceDrop;
	}
	public WebElement getMobileTxt() {
		return mobileTxt;
	}
	public WebElement getAsssignedToBtn() {
		return asssignedToBtn;
	}
	public WebElement getLastnameTxt() {
		return lastnameTxt;
	}
	public WebElement getTitleTxt() {
		return titleTxt;
	}
	public WebElement getDepartmentTxt() {
		return departmentTxt;
	}
	public WebElement getEmailTxt() {
		return emailTxt;
	}
	public WebElement getMailingcityTxt() {
		return mailingcityTxt;
	}
	public WebElement getMailingstateTxt() {
		return mailingstateTxt;
	}
	public WebElement getMailingcountryTxt() {
		return mailingcountryTxt;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public void createContactsOperation(String firstname,String lastname,String title) {
		getCreateContactBtn().click();
		getFirstnameTxt().sendKeys(firstname);
		getLastnameTxt().sendKeys(lastname);
		getTitleTxt().sendKeys(title);
		getSaveBtn().click();
	}
	public void createContactsOperation(String lastname,String department,String email,String mobile) {
		getCreateContactBtn().click();
		getLastnameTxt().sendKeys(lastname);
		getDepartmentTxt().sendKeys(department);
		getEmailTxt().sendKeys(email);
		getMobileTxt().sendKeys(mobile);
		getSaveBtn().click();
	}
	public void createContactsOperation(String lastname,String department,String email,String city,String state,String country) {
		getCreateContactBtn().click();
		getLastnameTxt().sendKeys("lastname");
		getDepartmentTxt().sendKeys(department);
		getEmailTxt().sendKeys(email);
		getMailingcityTxt().sendKeys(city);
		getMailingstateTxt().sendKeys(state);
		getMailingcountryTxt().sendKeys(country);
	}
}
