package com.knight.spreadsheet;

import org.apache.poi.ss.usermodel.Cell;

/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 *
 */
public class CellTypeError implements CellType
{
	@Override
	public boolean isTypeMatch(Cell cell)
	{
		return Cell.CELL_TYPE_ERROR == cell.getCellType();
	}

	@Override
	public String getCellValue(Cell cell)
	{
		return "";
	}
}
