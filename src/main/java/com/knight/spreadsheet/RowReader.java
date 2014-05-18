package com.knight.spreadsheet;

import java.util.HashMap;
import java.util.Map;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 *
 */
public class RowReader
{
	private XSSFSheet sheet;

	public RowReader(XSSFSheet sheet)
	{
		this.sheet = sheet;
	}

	public Map<String, String> readRow(Row row)
	{
		Map<String, String> dataMap = new HashMap<String, String>();
		Row header = sheet.getRow(0);

		int numberHeaderCells = header.getPhysicalNumberOfCells();

		for (int index = 0; index < numberHeaderCells; index++)
		{
			String celldata = "";
			Cell headerCell = header.getCell(index);
			String headerData = headerCell.getStringCellValue();

			Cell cell = new CellLocator().getCell(row, index);
			celldata = new CellReader().getValue(cell);

			dataMap.put(headerData, celldata);
		}
		return dataMap;
	}
}