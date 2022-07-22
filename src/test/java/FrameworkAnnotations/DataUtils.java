package FrameworkAnnotations;

import java.io.IOException;
import java.util.Hashtable;

public class DataUtils {
	private static int TestCaseStartnumber; 
	private static int KeyStartRowNumber;
	private static int ValueStartRowNumber; 
	private static Hashtable<String,String> table; 
	
	
	public static Hashtable<String, String> getTestData(Xls_reader xls, String sheetName, String testName) throws IOException{
		
		TestCaseStartnumber=xls.getRowData(testName); 
		KeyStartRowNumber=TestCaseStartnumber+1; 
		ValueStartRowNumber=KeyStartRowNumber+1; 
		
		int totalKeysColumn=xls.columnLastCellNumber(KeyStartRowNumber); 
		
		table=new Hashtable<String,String>(); 
		for(int cellnumber=0; cellnumber<totalKeysColumn;cellnumber++) {
			String keys=xls.getCellData(sheetName, KeyStartRowNumber, cellnumber); 
			String values= xls.getCellData(sheetName, ValueStartRowNumber, cellnumber);
			table.put(keys, values); 
			System.out.println(table);
		}
		return table;
	}

}
