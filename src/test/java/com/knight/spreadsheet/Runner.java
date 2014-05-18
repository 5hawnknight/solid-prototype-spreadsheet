package com.knight.spreadsheet;

import java.util.Map;

/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 *
 */
public class Runner
{
	public static void main(String[] args)
	{
		Map<String, String> data = new SpreadSheetReader()
										.withWorkBookLocation("src/test/resources/spreadsheet.xlsx")
										.withSheetName("Sheet 1")
										.withRowSequence("A1")
										.getData();
		
		System.out.println(data.toString());
		System.out.println(data.get("d1"));
	}
}