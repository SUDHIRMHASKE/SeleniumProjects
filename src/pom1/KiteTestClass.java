package pom1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		File myfile= new File("E:\\excelpractice\\Zerodha.xlsx");
		Row row = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0);
		String username = row.getCell(0).getStringCellValue();
		String password = row.getCell(1).getStringCellValue();
		String userpin=row.getCell(2).getStringCellValue();
		
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
		userlogout.changeuser();
		
	}

}
