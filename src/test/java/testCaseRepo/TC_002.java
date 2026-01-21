package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepo.Homepage;
import ObjectRepo.createLeadsPage;
import genericUtillity.*;
@Listeners(genericUtillity.ListenersImplementation.class)
public class TC_002 extends BaseClass{
	@Test(groups = {"Smoke"},retryAnalyzer=genericUtillity.RetryAnalyzerImplementation.class)
	public void LE_002() throws EncryptedDocumentException, IOException{
		Homepage hp = new Homepage(d);
//		int i=1;
//		if(i<=3) {
//			i++;
//			Assert.fail();
//		}
		hp.getLeadsBtn().click();
		createLeadsPage cp  = new createLeadsPage(d);
		String lname = eUtil.getSingleCellValueInExcel("Leads", 4, 1);
		String company = eUtil.getSingleCellValueInExcel("Leads", 4, 2);
		String title= eUtil.getSingleCellValueInExcel("Leads", 4, 3);
		String leadsource = eUtil.getSingleCellValueInExcel("Leads", 4, 4);
		String mobile = eUtil.getSingleCellValueInExcel("Leads", 4, 5);
		Assert.fail();
		cp.createLeadOperation(lname, company, mobile, title, leadsource);
	}

}
