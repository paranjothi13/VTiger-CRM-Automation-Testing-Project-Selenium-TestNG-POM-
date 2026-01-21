package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepo.Homepage;
import ObjectRepo.createContacts;
import genericUtillity.BaseClass;
@Listeners(genericUtillity.ListenersImplementation.class)
public class TC_004 extends BaseClass {
	@Test(groups = {"Smoke"},retryAnalyzer = genericUtillity.RetryAnalyzerImplementation.class)
public void con_001() throws EncryptedDocumentException, IOException {
	Homepage hp = new Homepage(d);
	hp.contactclick();
	createContacts cp = new createContacts(d);
	String fname = eUtil.getSingleCellValueInExcel("Contacts", 1, 1);
	String lname = eUtil.getSingleCellValueInExcel("Contacts", 1, 2);
	String title = eUtil.getSingleCellValueInExcel("Contacts", 1, 3);
	cp.createContactsOperation(fname,lname, title);
	
}
}
