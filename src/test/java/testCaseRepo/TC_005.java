package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepo.Homepage;
import ObjectRepo.createContacts;
import genericUtillity.BaseClass;
@Listeners(genericUtillity.ListenersImplementation.class)
public class TC_005 extends BaseClass {
	@Test(groups = {"Smoke","Sanity"},retryAnalyzer = genericUtillity.RetryAnalyzerImplementation.class)
  public void CON_002() throws EncryptedDocumentException, IOException {
	  Homepage hp = new Homepage(d);
	  hp.contactclick();
	  String lname = eUtil.getSingleCellValueInExcel("Contacts", 4, 1);
	  String department= eUtil.getSingleCellValueInExcel("Contacts", 4, 2);
	  String email = eUtil.getSingleCellValueInExcel("Contacts", 4, 3);
	  String mobile = eUtil.getSingleCellValueInExcel("Contacts", 4, 4);
	  createContacts cc = new createContacts(d);
	  cc.createContactsOperation(lname, department, email, mobile);
	  
  }
}
