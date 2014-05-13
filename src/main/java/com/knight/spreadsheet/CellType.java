package com.knight.spreadsheet;

import org.apache.poi.ss.usermodel.Cell;

public interface CellType {
	boolean isTypeMatch(Cell cell);
	String getCellValue(Cell cell);
}
