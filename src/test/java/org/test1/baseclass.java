package org.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public  class baseclass {
	
public static	WebDriver driver;
	
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhinesh\\eclipse-workspace\\dinesh\\NEWFOLDER\\testng\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	public void launchurl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
public void fill(WebElement element,String text) {
	element.sendKeys(text);
	
}
public void buttonclick(WebElement element) {
	element.click();
}
public void selectbyindex(WebElement element ,int idx) {
	Select s=new Select(element);
	s.selectByIndex(idx);

}
public void selectbyvalue(WebElement element ,String igx) {
	Select s=new Select(element);
	s.selectByValue(igx);

}
public void selectbyvisibletext(WebElement element,String txt) {
	Select s=new Select(element);
	s.selectByVisibleText(txt);
			
}

public String exceldata(int rowNO,int coloumnNO) throws IOException {
	 File f=new File("C:\\Users\\Dhinesh\\eclipse-workspace\\dinesh\\NEWFOLDER\\testng\\excel\\New Microsoft Office Excel Worksheet.xlsx ");
FileInputStream strem=new FileInputStream(f);
Workbook workbook=new XSSFWorkbook(strem);
Sheet sheet = workbook.getSheet("sheet1");
Row row = sheet.getRow(rowNO);
{
	Cell cell = row.getCell(coloumnNO);
	String value="";
	int cellType = cell.getCellType();
	if (cellType==1) {
		 value = cell.getStringCellValue();
		
	}
	else if (DateUtil.isCellDateFormatted(cell)) {
		Date date = cell.getDateCellValue();
		SimpleDateFormat sim=new SimpleDateFormat("dd-mm-yyyy");
	 value = sim.format(date);	
	}
	else {
		double d = cell.getNumericCellValue();
        long l=(long)d;
         value = String.valueOf(l);

	}
return value;

}

	 
	 
}



}
