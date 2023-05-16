package ApachiPOi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachiPOi {
	
	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\Users\\UD20461958\\OneDrive - Wipro\\Documents\\Udaya Kumar - Case Studies\\Case Studies\\1st Day - Case Study\\Case Study - Testing Approches.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheetAt = wb.getSheetAt(0);
		
		XSSFCell cell = sheetAt.getRow(0).getCell(0);
		System.out.println("data from excel: " + cell);
		
		XSSFCell cell2 = sheetAt.getRow(0).getCell(1);
		System.out.println("From Data---->" + cell2);
		
		wb.close();
		
	}

}
