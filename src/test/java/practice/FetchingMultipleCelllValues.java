package practice;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtillity.ExcelUtility;

public class FetchingMultipleCelllValues {

	public static void main(String[] args) throws Exception{
//     FileInputStream fis = new FileInputStream("C:\\Users\\asus\\Downloads\\Book1.xlsx");
//     Workbook wb=WorkbookFactory.create(fis);
//     Sheet sh = wb.getSheet("Bird");
//     DataFormatter df = new DataFormatter();
//    // ArrayList<String> a = new ArrayList<String>();
//     for(int i=0;i<=sh.getLastRowNum();i++) {
//    	 Row r =sh.getRow(i);
//    	 for(int j=0;j<r.getLastCellNum();j++) {
//    		 Cell cell =r.getCell(j);
//    		 String value=df.formatCellValue(cell);
//    		 System.out.print(" "+value);
//    		// a.add(value);
//    	 }
//    	 System.out.println();
//     }
  ExcelUtility eut=new ExcelUtility();
  ArrayList<String> multipleCellValues = eut.getMultipleCellValues("Contacts",1,0);
     System.out.println(multipleCellValues);
	}

}
