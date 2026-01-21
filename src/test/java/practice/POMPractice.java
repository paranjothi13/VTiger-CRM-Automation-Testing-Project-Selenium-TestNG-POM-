package practice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepo.Homepage;
import ObjectRepo.LoginPage;
import ObjectRepo.createContacts;
import ObjectRepo.createLeadsPage;
import genericUtillity.ExcelUtility;
import genericUtillity.PropertiesUtility;

public class POMPractice {
	public static void main(String[] args) throws IOException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://localhost:8888/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		PropertiesUtility propUtil = new PropertiesUtility();
	     LoginPage log= new LoginPage(d);
	     String uname=propUtil.getDatafromPropertiesFile("username");
	      String word=propUtil.getDatafromPropertiesFile("password");
	     log.loginPageOperation(uname,word);
	    Homepage h = new Homepage(d);
	    h.getLeadsBtn().click();
	    ExcelUtility eutil = new ExcelUtility();
   createLeadsPage cl= new createLeadsPage(d);
   String faname=eutil.getSingleCellValueInExcel("Leads",1,1);
	 String laname=eutil.getSingleCellValueInExcel("Leads",1,2);
	 String company=eutil.getSingleCellValueInExcel("Leads",1,3);
	     cl.createLeadOperation(faname,laname,company);
	     h.getContactsBtn().click();
	     String fname=eutil.getSingleCellValueInExcel("Contacts",1,1);
		 String lname=eutil.getSingleCellValueInExcel("Contacts",1,2);
		 String title=eutil.getSingleCellValueInExcel("Contacts",1,3);
	     createContacts crecont = new createContacts(d);
	     crecont.createContactsOperation(fname,lname,title);
	}
}
