package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepo.Homepage;
import ObjectRepo.createLeadsPage;
import genericUtillity.BaseClass;
@Listeners(genericUtillity.ListenersImplementation.class)
public class TC_001 extends BaseClass{
@Test(groups = {"Regression","Sanity"},retryAnalyzer = genericUtillity.RetryAnalyzerImplementation.class)
	public void LE_001() throws EncryptedDocumentException, IOException {
	Homepage hp = new Homepage(d);
	hp.getLeadsBtn().click();
	createLeadsPage cp  = new createLeadsPage(d);
	String fname=eUtil.getSingleCellValueInExcel("Leads", 1, 1);
	String lname=eUtil.getSingleCellValueInExcel("Leads", 1, 2);	String company=eUtil.getSingleCellValueInExcel("Leads", 1, 3);
	Assert.fail();
	cp.createLeadOperation(fname,lname,company);
	}

 
}
