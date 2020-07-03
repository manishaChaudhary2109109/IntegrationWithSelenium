package ExcelUtility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	
	
	public ReadExcelFile(String excelFilePath, String sheetName)
	{
		
		try {
			workbook = new XSSFWorkbook(excelFilePath);
			sheet = workbook.getSheet(sheetName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public static int getRowCount()
	{
	
	int rowCount = sheet.getPhysicalNumberOfRows();	
		
	return rowCount;	
	}
	
	
	public static int getColumnCount()
	{
		
		int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		return columnCount;
		
	}
	
	
	public static String CellDataValue(int row, int column)
	{
		
		String CellValue = sheet.getRow(row).getCell(column).getStringCellValue();
		
		return CellValue;
	}
	
	
	
	
	
	
	
	

}
