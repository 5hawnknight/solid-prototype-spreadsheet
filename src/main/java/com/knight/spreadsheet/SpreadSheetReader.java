package com.knight.spreadsheet;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SpreadSheetReader 
{
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	
	public SpreadSheetReader()
	{
		try
		{
			//URL url = getClass().getClassLoader().getResource(System.getProperty("spreadsheet"));
			//FileInputStream file = new FileInputStream(new File(url.toURI().getPath()));
			//this.workbook = new XSSFWorkbook(path)
			this.workbook = new XSSFWorkbook(new FileInputStream(new File("src/test/resources/spreadsheet.xlsx")));
		} 
		catch (Exception e)
		{
			this.workbook = new XSSFWorkbook();
		}
		this.sheet = workbook.getSheetAt(0);
	}
	public Map<String, String> getData(String jiraIssue)
	{		
		Row row = new RowLocator(sheet).locateRowBy(jiraIssue);
		return new RowReader(sheet).readRow(row);
	}
}