package com.Vtiger.CRM.Generic.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Test_Data_Utility {
	
	public String getDataFromExcel(String SheetName,int RowNum,int CellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis =new FileInputStream("./TestData/V_tiger_testscriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String Excel_data = wb.getSheet(SheetName).getRow(RowNum).getCell(CellNum).toString();
		return Excel_data;
			}
	
}
