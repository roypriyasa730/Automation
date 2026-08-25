package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;


public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Testsdata/customerapitestingdata.xlsx");
		 Workbook workbook = new XSSFWorkbook(fis);

	        Sheet sheet = workbook.getSheet("Sheet1");

	        for (Row row : sheet) {

	            for (Cell cell : row) {

	                System.out.print(cell.toString() + "\t");
	            }

	            System.out.println();
	        }

	        workbook.close();
	        fis.close();
	    
	}

}
