package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BrowserLaunch {

	public static void main(String[] args) throws IOException {
	
		
	// 1. Mention excel file path
	File f = new File("E:\\Coding\\Files\\Maven11am\\ExcelSheets\\Book1.xlsx");
	
	// 2. To read the excel file
	FileInputStream fis = new FileInputStream(f); // throws - FileNotFoundException
		
	//3. TO read the exact file format (.xlsx)
	XSSFWorkbook w = new XSSFWorkbook(fis); //throws - IOException
	
	//4. To get shrrt from workbook
	XSSFSheet mySheet = w.getSheetAt(2); //GetsheetAt
	
	//
	for (int i = 0; i < mySheet.getPhysicalNumberOfRows(); i++) {
		
		
		XSSFRow r = mySheet.getRow(i);
		
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			
		XSSFCell c = r.getCell(j);	
			
		System.out.println(c);
		
		}
	}
	
	
	
	
	
	
	
	
	/***
	//5. To get row from sheet
	XSSFRow particularRow = mySheet.getRow(0);
	
	//6. To get cell from cell
	XSSFCell particularCell = particularRow.getCell(1);
	
	
	System.out.println(particularCell);
	
	
	/*****
	
	
	
	
	
		
		/**********************************************
	//System.setProperty("webdriver.chrome.driver" , )
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/");
	
	WebElement email = driver.findElement(By.id("email"));
	//email.sendKeys("Selenium");
	passText("selenium", email);
	
	
	WebElement pass = driver.findElement(By.name("pass"));
	//pass.sendKeys("123567");
	passText("1234", pass); 
	************************************/
	}

	
}
