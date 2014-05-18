package com.knight.spreadsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author shawnknight
 *
 */
public class SpreadSheetReader implements Reader
{
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	private String sequence;

	public SpreadSheetReader()
	{
		workbook = new XSSFWorkbook();
		sheet = workbook.createSheet().createRow(0).createCell(0).getSheet();
	}

	public SpreadSheetReader withWorkBookLocation(String file)
	{
		try
		{
			this.workbook = new XSSFWorkbook(
					new FileInputStream(new File(file)));
		}
		catch (NullPointerException | IOException npe) { }
		return this;
	}

	public SpreadSheetReader withSheetName(String name)
	{
		this.sheet = ObjectUtils.defaultIfNull(workbook.getSheet(name),
		workbook.createSheet().createRow(0).createCell(0).getSheet());
		return this;
	}

	public SpreadSheetReader withRowSequence(String sequence)
	{
		this.sequence = sequence;
		return this;
	}

	public Map<String, String> getData()
	{
		System.out.println(sheet.toString());
		Row row = new RowLocator(sheet).locateRowBy(sequence);
		return new RowReader(sheet).readRow(row);
	}
}