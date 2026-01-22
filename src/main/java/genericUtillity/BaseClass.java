package genericUtillity;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ObjectRepo.Homepage;
import ObjectRepo.LoginPage;
public class BaseClass {
	public SelenniumUtility sUtil=  new SelenniumUtility();
	public PropertiesUtility pUtil=new PropertiesUtility();
	public ExcelUtility eUtil= new ExcelUtility();
	public WebDriver d;
	public static WebDriver sDriver;  // listeners
	 @BeforeSuite
  public void createDbConnection() {
	  System.out.println("create DB conection");
  }
	 @Parameters("Bro")
  @BeforeClass(alwaysRun=true)  //for group level execution we pass this execution
  public void launchBrowser(@Optional("chrome") String Browser) throws Exception{
		 if(Browser.equals("chrome"))
	  d = new ChromeDriver();
		 else if (Browser.equalsIgnoreCase("edge")) {
			    System.setProperty("webdriver.edge.driver", ".\\src\\main\\resources\\Drivers\\msedgedriver.exe"); // we need to set path for edge browser like this
			    d = new EdgeDriver();
			}
		 else if(Browser.equals("firefox"))
			 d=new FirefoxDriver();
		 else
			 d=new ChromeDriver();
		 sDriver=d;
	  sUtil.implicitWait(d, 10);
	  sUtil.maximizeWindow(d);
	  String Url = pUtil.getDatafromPropertiesFile("url");
	  sUtil.accessApplication(d,Url);
	  System.out.println("browser launched successfully");
  }
  @BeforeMethod(alwaysRun=true)
  public void loginOpr() throws IOException {
	  LoginPage l= new LoginPage(d);
	  String uname=pUtil.getDatafromPropertiesFile("username");
	  String pword=pUtil.getDatafromPropertiesFile("password");
	  l.getUsernameTxt().sendKeys(uname);
	  l.getPasswordTxt().sendKeys(pword);
	  l.getLoginBtn().click();
	  System.out.println("Login done successfully");
  }
  @AfterMethod(alwaysRun=true)
  public void logoutopr() throws Exception {
	  Homepage hp = new Homepage(d);
	  hp.logoutOperation(d);
	  System.out.println("LogOut done Successfully");
  }
  @AfterClass(alwaysRun=true)
  public void closeBrowser() {
	  d.quit();
	  System.out.println("Browser closed successfully");
  }
  @AfterSuite
  public void closeDbConnection() {
	  System.out.println("Db connection is closed");
  }
}
