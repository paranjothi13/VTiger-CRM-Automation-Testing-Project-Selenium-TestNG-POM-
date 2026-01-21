package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepo.Homepage;
import ObjectRepo.createLeadsPage;
import genericUtillity.BaseClass;
@Listeners(genericUtillity.ListenersImplementation.class)
public class TC_003 extends BaseClass{
	@Test(groups = {"Regression"})
	 public void LE_003() throws EncryptedDocumentException, IOException {
		  Homepage hp =new Homepage(d);
		  hp.getLeadsBtn().click();
		  createLeadsPage cp  = new createLeadsPage(d);
		  String lname = eUtil.getSingleCellValueInExcel("Leads", 7, 1);
		  String company = eUtil.getSingleCellValueInExcel("Leads", 7, 2);
		  String title = eUtil.getSingleCellValueInExcel("Leads", 7, 3);
		  String mobile = eUtil.getSingleCellValueInExcel("Leads", 7, 4);
		  String email = eUtil.getSingleCellValueInExcel("Leads", 7, 5);
		  String city = eUtil.getSingleCellValueInExcel("Leads", 7, 6);
		  String state = eUtil.getSingleCellValueInExcel("Leads", 7, 7);
		  cp.createLeadOperation(lname, company, title, mobile, email, city, state);
	  }
}
