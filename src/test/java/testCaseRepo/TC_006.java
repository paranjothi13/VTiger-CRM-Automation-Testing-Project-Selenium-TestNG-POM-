package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ObjectRepo.Homepage;
import ObjectRepo.createContacts;
import genericUtillity.BaseClass;

public class TC_006 extends BaseClass {
@Test(groups = {"Regression"},retryAnalyzer = genericUtillity.RetryAnalyzerImplementation.class)
public void CON_003() throws EncryptedDocumentException, IOException {
	Homepage hp = new Homepage(d);
	hp.contactclick();
	createContacts cc = new createContacts(d);
	String lname = eUtil.getSingleCellValueInExcel("Contacts", 7, 1);
	String department = eUtil.getSingleCellValueInExcel("Contacts", 7, 2);
	String email = eUtil.getSingleCellValueInExcel("Contacts", 7, 3);
	String city  = eUtil.getSingleCellValueInExcel("Contacts", 7, 4);
	String state = eUtil.getSingleCellValueInExcel("Contacts", 7, 5);
	String country = eUtil.getSingleCellValueInExcel("Contacts", 7, 6);
	cc.createContactsOperation(lname, department, email, city, state, country);
}
}
