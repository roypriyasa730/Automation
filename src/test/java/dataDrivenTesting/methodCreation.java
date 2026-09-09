package dataDrivenTesting;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class methodCreation {
		
		public String readDataFromProperty(String key) throws IOException {
			FileInputStream fis= new FileInputStream("./src/test/resources/Testsdata/config.properties");
			Properties p= new Properties();
			p.load(fis);
			String data = p.getProperty(key);
			return data;
		}
		
		 public double NumericalDataFromExcel(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
				FileInputStream fis= new FileInputStream("./src/test/resources/Testdata/datas.xlsx");
				Workbook wb= WorkbookFactory.create(fis);
				double data = wb.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
				return data;
			}
		     
		     public String StringDataFromExcel(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
		 		FileInputStream fis= new FileInputStream("./src/test/resources/Testdata/datas.xlsx");
		 		Workbook wb= WorkbookFactory.create(fis);
		 		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		 		return data;
		 	}

		    
				public String readDataFromExcel(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
					FileInputStream fis= new FileInputStream("./src/test/resources/Testdata/datas.xlsx");
					Workbook work= WorkbookFactory.create(fis);
					String name = work.getSheet("sheetname").getRow(row).getCell(cell).getStringCellValue();
					return(name);
					
						
				}

	}

