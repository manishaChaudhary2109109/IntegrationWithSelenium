package TestingLoginCredentials;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.TestMethodWithDataProviderMethodWorker;

import ExcelUtility.ReadExcelFile;

public class LoginCredentialTest {
	
	 public   String excelPathName = "C:\\Users\\Manisha\\Desktop\\UserCredentials.xlsx";
	 public String sheetName = "Sheet1"; 
	
	
	 @Test(dataProvider = "UserDataCredentials")
	 public void  Test1(String Username, String Password){
		 
		 System.out.println(Username + "|"+Password);
		 
		 
		 
	 }
	
	@DataProvider(name = "UserDataCredentials")
	public  Object[][] getCellData(){
			
		    Object[][] data = testData(excelPathName, sheetName);
		    return data;
		
	}
	
	
	
public  static Object[][] testData(String excelPathName, String sheetName)
	{
	

	ReadExcelFile excelRead = new ReadExcelFile(excelPathName, sheetName);
	
	int RowCount = excelRead.getRowCount();
	
	int ColumnCount = excelRead.getColumnCount();
	
	Object data[][] = new Object[RowCount-1][ColumnCount];
	
	for(int i=1; i< RowCount; i++)
	{
		for(int j=0; j< ColumnCount; j++)
		{
			
			String cellData = excelRead.CellDataValue(i, j);
			
			data[i-1][j] = cellData;
		}
		
	}
	

	return data;
	
	
	
	
	
	
	
}
	
	

}

