package com.knight.spreadsheet;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 */
public class CellLocator
{
	public Cell getCell(Row row, int column)
	{
		return row.getCell(column);
	}
}