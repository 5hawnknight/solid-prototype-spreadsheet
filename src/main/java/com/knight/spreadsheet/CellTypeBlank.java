package com.knight.spreadsheet;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;

/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 *
 */
public class CellTypeBlank implements CellType
{
	@Override
	public boolean isTypeMatch(Cell cell)
	{
		return Cell.CELL_TYPE_BLANK == cell.getCellType();
	}

	@Override
	public String getCellValue(Cell cell)
	{
		return StringUtils.trimToEmpty(cell.getStringCellValue());
	}
}