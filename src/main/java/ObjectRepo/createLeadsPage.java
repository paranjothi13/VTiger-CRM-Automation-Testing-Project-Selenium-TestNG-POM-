package ObjectRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import genericUtillity.SelenniumUtility;
public class createLeadsPage {
 @FindBy(xpath="//img[@title='Create Lead...']")
 private WebElement createLeadsBtn;
 @FindBy(xpath="//input[@name='firstname']")      
 private WebElement firstnameTxt;
 @FindBy(xpath="//input[@name='lastname']")
 private WebElement lastnameTxt;
 @FindBy(xpath="//input[@name='company']")
 private WebElement companyTxt;
 @FindBy(xpath="//input[@name='designation']")
 private WebElement titleTxt;
 @FindBy(xpath="//select[@name='leadsource']")
 private WebElement leadsourceDrop;
 @FindBy(xpath="//input[@name='mobile']")
 private WebElement mobileTxt;
 @FindBy(xpath="//input[@name='email']")
 private WebElement emailTxt;
 @FindBy(xpath="//input[@value='U']")
 private WebElement assignedToBtn;
 @FindBy(xpath="//input[@name='country']")
 private WebElement countryTxt;
 @FindBy(xpath="//input[@name='city']")
 private WebElement cityTxt;
 @FindBy(xpath="//input[@name='state']")
 private WebElement stateTxt;
 @FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
 private WebElement saveBtn;
 public createLeadsPage(WebDriver driver) {
	 PageFactory.initElements(driver,this);
 }
 public WebElement getCreateLeadsBtn() {
	return createLeadsBtn;
 }
 public WebElement getFirstnameTxt() {
	return firstnameTxt;
 }
 public WebElement getTitleTxt() {
	 return titleTxt;
 }
 public WebElement getLastnameTxt() {
	return lastnameTxt;
 }
 public WebElement getCompanyTxt() {
	return companyTxt;
 }
 public WebElement getLeadsourceDrop() {
	return leadsourceDrop;
 }
 public WebElement getMobileTxt() {
	return mobileTxt;
 }
 public WebElement getEmailTxt() {
	return emailTxt;
 }
 public WebElement getAssignedToBtn() {
	return assignedToBtn;
 }
 public WebElement getCountryTxt() {
	return countryTxt;
 }
 public WebElement getCityTxt() {
	return cityTxt;
 }
 public WebElement getStateTxt() {
	return stateTxt;
 }
 public WebElement getSaveBtn() {
	return saveBtn;
 }
 
 public void createLeadOperation(String firstname,String lastname,String company) {
	 getCreateLeadsBtn().click();
	 getFirstnameTxt().sendKeys(firstname);
	 getLastnameTxt().sendKeys(lastname);
	 SelenniumUtility sutil = new SelenniumUtility();
		sutil.selectByOption(assignedToBtn,"Partner");
	 getCompanyTxt().sendKeys(company);
	 getAssignedToBtn().click();
	 getSaveBtn().click();
 }
 public void createLeadOperation(String Lastname,String company,String mobile,String title,String leadsource) {
	 getCreateLeadsBtn().click();
	 getLastnameTxt().sendKeys(Lastname);
	 getCompanyTxt().sendKeys(company);
	 getTitleTxt().sendKeys(title);
	 getLeadsourceDrop().sendKeys(leadsource);
	SelenniumUtility sutil = new SelenniumUtility();
	sutil.selectByOption(assignedToBtn,"Partner");
     getMobileTxt().sendKeys(mobile);
     getSaveBtn().click();
 }
 public void createLeadOperation(String lastname,String company,String title,String mobile,String email,String city,String state) {
	 getCreateLeadsBtn().click();
	 getLastnameTxt().sendKeys(lastname);
	 getCompanyTxt().sendKeys(company);
	 getTitleTxt().sendKeys(title);
	 getMobileTxt().sendKeys(mobile);
	 getEmailTxt().sendKeys(email);
	 SelenniumUtility sutil = new SelenniumUtility();
		sutil.selectByOption(assignedToBtn,"Partner");
	 getCityTxt().sendKeys(city);
	 getStateTxt().sendKeys(state);
	 getAssignedToBtn().click();
	 getSaveBtn().click();
 }
 
}
