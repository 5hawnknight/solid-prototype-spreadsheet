package com.knight.spreadsheet;

import java.util.Map;

/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 *
 */
public interface Reader
{
	Object withWorkBookLocation(String file);

	Object withSheetName(String sheet);

	Object withRowSequence(String sequence);

	Map<String, String> getData();
}
