package genericUtillity;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This an utilty class Which uses to load  cell values in Excel
 * @author Class
 * @version 25-12-13
 */

public class ExcelUtility {
	/**
	 * This a generic method to fetch single cell data from Excel file
	 * @param sheetName
	 * @param rowindex
	 * @param cellindex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
   public String getSingleCellValueInExcel(String sheetname,int rowindex,int cellindex) throws EncryptedDocumentException, IOException {
	   FileInputStream fis =new FileInputStream(IpathUtility.excelPath);
	    Workbook wb= WorkbookFactory.create(fis);
	    Cell cell = wb.getSheet(sheetname).getRow(rowindex).getCell(cellindex);
	    DataFormatter df = new DataFormatter();
	    String value = df.formatCellValue(cell);
	    return value;
   }
   /**
    * This method used to return multiple values in an Excel Sheet.
    * @param sheetName
    * @param startingrowIndex
    * @param startingcellIndex
    * @return
 * @throws IOException 
 * @throws EncryptedDocumentException 
    */
   public ArrayList<String> getMultipleCellValues(String sheetname,int startingrowIndex,int startingcellIndex) throws EncryptedDocumentException, IOException  {
	   FileInputStream fis =new  FileInputStream(IpathUtility.excelPath);
	   Workbook wb = WorkbookFactory.create(fis);
	   Sheet sh2 = wb.getSheet("Bird");
	   DataFormatter df=new DataFormatter();
	   ArrayList<String>a =new ArrayList<String>();
	   for(int i=startingrowIndex;i<=sh2.getLastRowNum();i++) {
		   Row r = sh2.getRow(i);
		   for(int j=startingcellIndex;j<r.getLastCellNum();j++) {
			   Cell c = r.getCell(j);
			   String value=df.formatCellValue(c);
			   a.add(value);
		   }
	   }
	   return a;
   }
   /**
    * This method is used to write data in Excel File.
    * @param sheetname
    * @param rowIndex
    * @param cellIndex
    * @param value
    * @throws EncryptedDocumentException
    * @throws IOException
    */
   public void writeDataToExcel(String sheetname,int rowIndex,int cellIndex,String value ) throws EncryptedDocumentException, IOException {
	  FileInputStream fis = new FileInputStream(IpathUtility.excelPath);
	  Workbook wb = WorkbookFactory.create(fis);
	  Sheet sh = wb.getSheet(sheetname);
	  Row r = sh.createRow(rowIndex);
	  Cell c = r.createCell(cellIndex);
	  c.setCellValue(value);
	  FileOutputStream fos = new FileOutputStream(IpathUtility.excelPath);
	  wb.write(fos);
   }
}
