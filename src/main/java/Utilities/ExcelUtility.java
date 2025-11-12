package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String readDataFromExcel(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		String cell = row.getCell(cellNum).toString();
		
		return cell;
	}
	
	 public void setDataToExcelFile(String sheetName, int rowNum, int colNum, String data) throws EncryptedDocumentException, IOException
	    {
	    	String filePath="./src/test/resources/TestData.xlsx";
			FileInputStream fis=new FileInputStream(filePath);
			
			Workbook book=WorkbookFactory.create(fis);
			
			Sheet sheet=book.getSheet(sheetName);
			if(sheet==null)
			{
				sheet=book.createSheet(sheetName);
			}
			
			Row row=sheet.getRow(rowNum);
			if(row==null)
			{
				row=sheet.createRow(rowNum);
			}
			
			Cell cell=row.createCell(colNum);
			cell.setCellValue(data);
			
			FileOutputStream fos=new FileOutputStream(filePath);
			book.write(fos);
			book.close();
			fis.close();
			fos.close();
			
			

	    }

}
