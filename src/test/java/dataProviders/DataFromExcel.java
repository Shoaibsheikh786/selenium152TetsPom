package dataProviders;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataFromExcel {
	
	@Test(enabled=false)
	public void testData(String username, String password)
	{
		System.out.println("My username is "+username);
		System.out.println("My password is "+password);
	}
	@Test(enabled=false)
	public void readData() throws EncryptedDocumentException, IOException
	{
		//1. find the location of the excel file 
		File file =new File("./myData.xlsx");
		//2. mention the type of file 
		Workbook wb=WorkbookFactory.create(file);
		//3. mention the sheet , we can have mut. sheets
		
		 Sheet sheet=wb.getSheetAt(0);
		 //4. get the row, all the data in the row 
		 
           Row row=sheet.getRow(3);
           //5. get Cell data, row contains multiple cells 
            Cell cell=row.getCell(0);
            Cell cell2=row.getCell(1);
            
            System.out.print(cell+"  ");
            System.out.println(cell2);
		 
		
		//
	}
	@DataProvider
	public String[][] readEntireData() throws EncryptedDocumentException, IOException
	{  
		String[][]arr;
		//1. find the location of the excel file 
		File file =new File("./myData.xlsx");
		//2. mention the type of file 
		Workbook wb=WorkbookFactory.create(file);
		//3. mention the sheet , we can have mut. sheets
		
		 Sheet sheet=wb.getSheetAt(0);
		 //4. get the row, all the data in the row 
		 int trows=sheet.getLastRowNum();
		 arr=new String[trows][2];
		 
		 //size of stirng 10, 2 
          for(int i=0;i<sheet.getLastRowNum();i++)
          {
        	  Row row=sheet.getRow(i);
        	   
        	  for(int j=0;j<row.getLastCellNum();j++)
        	  {
        		  Cell cell=row.getCell(j);   
        		//  System.out.print(cell+"  ");
        		  arr[i][j]= cell.toString();
        	  }
        	 
          }
        
          return arr;
		//
	}
	
	@Test(dataProvider="readEntireData")
	public void test3(String user,String pass)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(user);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	

	}
	
	


}
