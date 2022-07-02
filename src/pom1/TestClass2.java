package pom1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		File myfile= new File("E:\\excelpractice\\Zerodha.xlsx");
		Sheet Sheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		ArrayList<String> al = new ArrayList<String>();
		int rownum = Sheet.getLastRowNum();
		int colnum = Sheet.getRow(0).getLastCellNum();
		for(int i=1; i<=rownum ; i++)
		{	
			for(int j=0; j<=colnum-1; j++){
			String value = Sheet.getRow(i).getCell(j).getStringCellValue();
			al.add(value);}
					
			KiteLogIn login = new KiteLogIn(driver);
			login.sendUserName(al.get(0));
			login.sendPassword(al.get(1));
			login.clickLoginButton();
					
			KitePinPage1 pin = new KitePinPage1(driver);
			pin.sendPin(al.get(2));
			login.clickLoginButton();
					
			KiteHomepage validate = new KiteHomepage(driver);
			validate.validation(al.get(0),i);
					
			LogOutPage userlogout = new LogOutPage(driver);
			userlogout.ClickOnUserName();
			userlogout.ClickOnLogout();
			userlogout.changeuser();
			al.clear();   
			}
			}
		}
	


