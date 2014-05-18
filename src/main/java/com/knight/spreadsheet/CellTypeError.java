package com.knight.spreadsheet;

import org.apache.poi.ss.usermodel.Cell;

/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 *
 */
public class CellTypeError implements CellType
{
	public boolean isTypeMatch(Cell cell)
	{
		return Cell.CELL_TYPE_ERROR == cell.getCellType();
	}

	public String getCellValue(Cell cell)
	{
		return "";
	}
}
