package com.Actitime.generic.Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
	/**
	 * This is a generic class design to read data from property file.
	 * @param key
	 * @return
	 * @throws IOException
	 */
		  public String readDataFromProperty(String key) throws IOException {
				FileInputStream fis= new FileInputStream("./src/test/resources/Testsdata/config.properties");
				Properties p= new Properties();
				p.load(fis);
				String data = p.getProperty(key);
				return (data);
	}
		  /**
		   * this is a generic class design to read data from excel file for string value.
		   * @param sheetName
		   * @param row
		   * @param cell
		   * @return
		   * @throws EncryptedDocumentException
		   * @throws IOException
		   */
		  public String StringDataFromExcel(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
		 		FileInputStream fis= new FileInputStream("./src/test/resources/Testsdata/customerapitestingdata.xlsx");
		 		Workbook wb= WorkbookFactory.create(fis);
		 		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		 		return data;
		 	}
         /**
          * this is a generic design to read data from excel file for Numeric value.
          * @param sheetName
          * @param row
          * @param cell
          * @return
          * @throws EncryptedDocumentException
		  * @throws IOException
          */
		  public double NumericalDataFromExcel(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
				FileInputStream fis= new FileInputStream("./src/test/resources/Testsdata/customerapitestingdata.xlsx");
				Workbook wb= WorkbookFactory.create(fis);
				double data = wb.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
				return data;
			}
		  
		  /*
		   * This is a generic method used to update data into excel
		   */
		  
	}