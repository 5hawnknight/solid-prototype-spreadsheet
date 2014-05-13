package com.knight.spreadsheet;

import java.util.Map;

public class Runner {

	public static void main(String[] args) {
		SpreadSheetReader ssr = new SpreadSheetReader();
		Map<String,String> map = ssr.getData("00100A");
		System.out.println(map.toString());
		

	}

}
