package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtillity.ExcelUtility;

public class AccessExcelsheet {

	public static void main(String[] args) throws Exception {
//		FileInputStream fis = new FileInputStream("C:\\Users\\asus\\Downloads\\Book1.xlsx");
//		Workbook wb=WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Animal");
//		Row r =sh.getRow(1);
//		Cell c =r.getCell(2);
////		String value=c.getStringCellValue();
//	  DataFormatter df =  new DataFormatter();
//	  String value=df.formatCellValue(c);
//	  System.out.println(value);
    ExcelUtility euti=new ExcelUtility();
    String val1=euti.getSingleCellValueInExcel("Animal", 0, 0);
   String val2= euti.getSingleCellValueInExcel("Fish",0,0);
   System.out.println(val1);
   System.out.println(val2);
	}

}
