package practice;
import org.testng.annotations.Test;
import ObjectRepo.Homepage;
import ObjectRepo.createLeadsPage;
import genericUtillity.BaseClass;
import genericUtillity.ExcelUtility;

public class TC_001  extends BaseClass{
	@Test
	public void testCase1() throws Exception{
    Homepage h = new Homepage(d);
    h.getLeadsBtn().click();
    ExcelUtility eutil = new ExcelUtility();
    String fname=eutil.getSingleCellValueInExcel("Leads", 1, 1);
    String lname=eutil.getSingleCellValueInExcel("Leads", 1, 2);
    String company=eutil.getSingleCellValueInExcel("Leads", 1, 3);
    createLeadsPage cpage = new createLeadsPage(d);
    cpage.createLeadOperation(fname, lname, company);
    
  //  d.close();
}
}