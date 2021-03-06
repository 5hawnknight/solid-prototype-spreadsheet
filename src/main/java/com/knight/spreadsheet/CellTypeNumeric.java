package com.knight.spreadsheet;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;

/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 *
 */
public class CellTypeNumeric implements CellType
{
	@Override
	public boolean isTypeMatch(Cell cell)
	{
		return Cell.CELL_TYPE_NUMERIC == cell.getCellType();
	}

	@Override
	public String getCellValue(Cell cell)
	{
		return StringUtils.trimToEmpty(Double.toString(cell.getNumericCellValue()));
	}
}