package SeleniumQA_Pracs.SeleniumQA_Pracs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apache_poi_Readdemo {

	public static void main (String [] args) throws IOException{
		//Path of the excel file
		FileInputStream fs = new FileInputStream("\\Users\\kiran\\eclipse-workspace\\SeleniumQA_Pracs\\src\\test\\java\\Resource\\ApacheRead.xlsx");
		//Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(sheet.getRow(0).getCell(0));
		Row row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(1);
		System.out.println(sheet.getRow(0).getCell(1));
		Row row2 = sheet.getRow(1);
		Cell cell2 = row2.getCell(1);
		System.out.println(sheet.getRow(1).getCell(0));
		Row row3 = sheet.getRow(1);
		Cell cell3 = row3.getCell(1);
		System.out.println(sheet.getRow(1).getCell(1));
		Row row4 = sheet.getRow(1);
		Cell cell4 = row3.getCell(1);
		System.out.println(sheet.getRow(2).getCell(0));
		Row row5 = sheet.getRow(1);
		Cell cell5 = row3.getCell(1);
		System.out.println(sheet.getRow(2).getCell(1));
		//String cellval = cell.getStringCellValue();
		//System.out.println(cellval);
		}

}
