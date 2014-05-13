package com.knight.spreadsheet;

import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;

public class CellReader 
{
	private List<CellType> cellTypes;
	private final String BLANK = "";
	
	public CellReader()
	{
		cellTypes = Arrays.asList(
						new CellTypeNumeric(),
						new CellTypeString(),
						new CellTypeBlank(),
						new CellTypeError()
						);
	}
	public String getValue(Cell cell) 
	{
		for (CellType cellType : cellTypes) 
		{
			if (cellType.isTypeMatch(cell))
				return cellType.getCellValue(cell);
		}
		return BLANK;
	}
}