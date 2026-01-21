package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtillity.ExcelUtility;

public class WriteinCellExcelsheet  {

	public static void main(String[] args) throws Exception {
//	FileInputStream fis = new FileInputStream("C:\\Users\\asus\\OneDrive\\Desktop\\Book1.xlsx");
//     Workbook wb = WorkbookFactory.create(fis);
//     Sheet sh = wb.createSheet("Places");
//     Row r = sh.createRow(0);
//     Cell c = r.createCell(0);
//     c.setCellValue("Chennai");
//   FileOutputStream fos = new  FileOutputStream("C:\\Users\\asus\\OneDrive\\Desktop\\Book1.xlsx");
//   wb.write(fos);
		ExcelUtility eut=new ExcelUtility();
//		eut.writeDataToExcel("Leads", 7, 0,"Bengaluru");
		eut.getSingleCellValueInExcel("Leads", 0, 0);
	}

}
