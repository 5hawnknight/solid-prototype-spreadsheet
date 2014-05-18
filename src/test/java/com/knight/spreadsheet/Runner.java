package com.knight.spreadsheet;

import java.util.Map;

public class Runner
{

	public static void main(String[] args)
	{
		Map<String, String> data = new SpreadSheetReader()
				.withWorkBookLocation("src/test/resources/spreadsheet.xlsx")
				.withSheetName("Sheet 2").withRowSequence("2.0").getData();
	}

}
