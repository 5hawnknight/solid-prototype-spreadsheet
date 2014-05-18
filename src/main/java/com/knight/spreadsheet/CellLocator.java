package com.knight.spreadsheet;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

/**
 * @author Shawn Knight
 * 
 *
 */
public class CellLocator
{

	public Cell getCell(Row row, int column)
	{
		return row.getCell(column);
	}
}