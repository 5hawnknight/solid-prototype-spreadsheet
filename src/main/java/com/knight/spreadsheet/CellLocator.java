package com.knight.spreadsheet;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class CellLocator {

	public Cell getCell(Row row, int column) 
	{
		return row.getCell(column);
	}
}