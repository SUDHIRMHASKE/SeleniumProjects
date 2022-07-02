package pom1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestClass1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		FileInputStream fis = new FileInputStream("E:\\excelpractice\\Zerodha.xlsx");
		
		Sheet sheet = WorkbookFactory.create(fis).getSheet("Sheet1");
		
		String username = sheet.getRow(0).getCell(0).getStringCellValue();
		String password = sheet.getRow(0).getCell(1).getStringCellValue();
		String userpin = sheet.getRow(0).getCell(2).getStringCellValue();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		KiteLogIn login = new KiteLogIn(driver);
		login.sendUserName(username);
		login.sendPassword(password);
		login.clickLoginButton();
		
		KitePinPage1 pin = new KitePinPage1(driver);
		pin.sendPin(userpin);
		login.clickLoginButton();
		
		KiteHomepage validate = new KiteHomepage(driver);
		validate.validation(username,1);
		
		LogOutPage userlogout = new LogOutPage(driver);
		userlogout.ClickOnUserName();
		userlogout.ClickOnLogout();	


	}

}
