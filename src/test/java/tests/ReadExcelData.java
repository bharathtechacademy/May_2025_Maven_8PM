package tests;

import java.util.List;
import java.util.Map;

import utilities.ExcelUtil;

public class ReadExcelData {

	public static void main(String[] args) {
		List<Map<String,String>> data = ExcelUtil.readData("TestData.xlsx", "Sheet1");
		
		System.out.println(data);
		
		String [][] testData = ExcelUtil.readExcelData("TestData.xlsx", "Sheet1");
	}

}
