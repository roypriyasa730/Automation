package dataDrivenTesting;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadDataFromExcelRow {
	 public static void main(String[] args) throws IOException, InterruptedException {

	        FileInputStream fis = new FileInputStream(
	                "./src/test/resources/Testsdata/customerapitestingdata.xlsx");
	        File file = new File ("./src/test/resources/Testsdata/customerapitestingdata.xlsx");
	        Desktop.getDesktop().open(file);

	        XSSFWorkbook workbook = new XSSFWorkbook(fis);

	        Sheet sheet = workbook.getSheet("Sheet1");

	        // Read row 1, column 0
	        String username = sheet.getRow(1).getCell(0).getStringCellValue();

	        // Read row 1, column 1
	        String password = sheet.getRow(1).getCell(1).getStringCellValue();

	        // Read row 1, column 2
	        String email = sheet.getRow(1).getCell(2).getStringCellValue();

	        System.out.println(username);
	        System.out.println(password);
	        System.out.println(email);
Thread.sleep(5000);
	        workbook.close();
	        fis.close();
	    }

}
