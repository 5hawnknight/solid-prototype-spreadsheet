package com.knight.spreadsheet;

import java.util.Iterator;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class RowLocator 
{
	private XSSFSheet sheet;
	private Iterator<Row> rowIterator;
	
	public RowLocator(XSSFSheet sheet)
	{
		this.sheet = sheet;
		this.rowIterator = sheet.rowIterator(); 
	}
	public Row locateRowBy(String searchValue)
	{
		 while (rowIterator.hasNext())
         {
             Row row = rowIterator.next();
             Cell cell = row.cellIterator().next();
             String cellValue = cell.getStringCellValue();
            
             if(StringUtils.equalsIgnoreCase(searchValue, cellValue))
            	 return row;      
         }
		 return getBlankRow();
	}
	private Row getBlankRow()
	{
		return sheet.getRow(sheet.getLastRowNum());
	}
}