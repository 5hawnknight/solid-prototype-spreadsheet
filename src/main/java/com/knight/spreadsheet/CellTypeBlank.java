package com.knight.spreadsheet;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;

public class CellTypeBlank implements CellType 
{
	public boolean isTypeMatch(Cell cell) {
		return Cell.CELL_TYPE_BLANK == cell.getCellType();
	}

	public String getCellValue(Cell cell) {
		return StringUtils.trimToEmpty(cell.getStringCellValue());
	}
}