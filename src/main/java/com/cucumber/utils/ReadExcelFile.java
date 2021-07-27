package com.cucumber.utils;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelFile {
    

	private static ReadExcelFile file = null;
	public XSSFWorkbook workbook;

	public Object[][] ReadExcelFile(String filePath, String fileName, String sheetName) throws IOException {

		File file = new File(filePath + "\\" + fileName);

		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook = null;
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		if (fileExtensionName.equals(".xlsx")) {
			workbook = new XSSFWorkbook(inputStream);
		} else if (fileExtensionName.equals(".xls")) {
			workbook = new HSSFWorkbook(inputStream);
		}
		Sheet sheet = workbook.getSheet(sheetName);
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		Row row1 = sheet.getRow(0);
		int colCount = row1.getLastCellNum();
		//int rowCount = sheet.getLastRowNum();
		Object[][] data = new Object[rowCount][colCount];
		for (int i = 0; i < rowCount; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				DataFormatter formatter = new DataFormatter();
				String strValue = formatter.formatCellValue(row.getCell(j));
				data[i][j] = strValue;
				// System.out.print(data[i][j]+" ");
			}
			// System.out.println();
		}
		return data;
	}
/*
		public static void main(String args[]) throws IOException {
		
		ReadExcelFile objExcelFile = new ReadExcelFile();		
		String filePath = "C:\Users\Lenovo\Desktop\selenium workspace\cucumber_hackton2\testdata";
	
		objExcelFile.ReadExcelFile(filePath, "TC_001.xlsx", "Sheet1");		
		}
		*/

}
