package com.knight.spreadsheet;

import org.apache.poi.ss.usermodel.Cell;

/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 *
 */
public interface CellType
{
	boolean isTypeMatch(Cell cell);

	String getCellValue(Cell cell);
}
