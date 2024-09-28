package Utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtility {

	String path="";	
	

	public ExcelUtility(String excelFilePath)
	{
		this.path=excelFilePath;
	}

	public int getRowCount(String sheetName) throws IOException 
	{
		FileInputStream inputStream = new FileInputStream(path); 
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream); 
		XSSFSheet sheet = workbook.getSheet(sheetName); 
		int rows = sheet.getLastRowNum(); 
		return rows;
	} 
	
	public int getColumnCount(String sheetName, int rowNum) throws Exception 
	{
		FileInputStream inputStream = new FileInputStream(path); 
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream); 
		XSSFSheet sheet = workbook.getSheet(sheetName);
		XSSFRow row = sheet.getRow(rowNum);
		int cellcount = row.getLastCellNum(); 
		return cellcount; 
	}

	
	public String getCellData(String sheetName,int rowNum,int colNum) throws Exception 
	{
		FileInputStream inputStream = new FileInputStream(path); 
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream); 
		XSSFSheet sheet = workbook.getSheet(sheetName);
		XSSFRow row = sheet.getRow(rowNum);
		XSSFCell cellValue = row.getCell(colNum); 
		String data = cellValue.toString(); 
		return data;
	}
	
	
}
