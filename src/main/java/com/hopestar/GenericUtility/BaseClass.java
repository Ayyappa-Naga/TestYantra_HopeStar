package com.hopestar.GenericUtility;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Pom.pkg.HomePage;
import com.Pom.pkg.LoginPage;

public class BaseClass {
	public DataBase_Utility du = new DataBase_Utility();
	public WebDriver_Utility wu = new WebDriver_Utility();
	public ExcelUtility eu = new ExcelUtility();
	public Java_Utility ju = new Java_Utility();
	public File_Utility fu = new File_Utility();
	public WebDriver driver;
	public static WebDriver sdriver;
	String USERNAME;
	String PASSWORD;
	String URL;

	@BeforeSuite(alwaysRun = true)
	public void openDBConnection() throws SQLException {
		du.ConnectToDB();
		System.out.println("Connection Established");
	}

	/*
	 * @Parameters({"BROWSER"})
	 * 
	 * @BeforeClass(alwaysRun = true) public void launchBrowser(String BROWSER)
	 * throws Throwable { File_Utility fi = new File_Utility(); //String
	 * BROWSER=fi.readDataFromProFile("browser");
	 * 
	 * USERNAME=fi.readDataFromProFile("username");
	 * PASSWORD=fi.readDataFromProFile("password"); URL
	 * =fi.readDataFromProFile("url");
	 * 
	 * if(BROWSER.equalsIgnoreCase("chrome")) {
	 * 
	 * driver = new ChromeDriver(); }
	 * 
	 * else if(BROWSER.equalsIgnoreCase("firefox")) { driver = new FirefoxDriver();
	 * }
	 * 
	 * else if(BROWSER.equalsIgnoreCase("edge")) {
	 * 
	 * driver = new EdgeDriver(); } else {
	 * 
	 * driver = new ChromeDriver(); } System.out.println("browser launched");
	 * wu.maximize(driver); driver.get(URL); wu.implicitwait(driver);
	 * System.out.println("application launched"); }
	 */
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws Throwable {

		File_Utility fi = new File_Utility();
		String BROWSER = fi.readDataFromProFile("browser");

		USERNAME = fi.readDataFromProFile("username");
		PASSWORD = fi.readDataFromProFile("password");
		URL = fi.readDataFromProFile("url");

		if (BROWSER.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		}

		else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		else if (BROWSER.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();
		} else {

			driver = new ChromeDriver();
		}
		System.out.println("browser launched");
		sdriver = driver;
		wu.maximize(driver);
		driver.get(URL);
		wu.implicitwait(driver);
		System.out.println("application launched");
	}

	@BeforeMethod(alwaysRun = true)
	public void launchApplication() {
		LoginPage lp = new LoginPage(driver);
		lp.loginPage(USERNAME, PASSWORD);
		System.out.println("logged in Successfully");
	}

	@AfterMethod(alwaysRun = true)
	public void logout() {
		HomePage hp = new HomePage(driver);
		hp.logout();
		System.out.println("logged out of application");
	}

	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
		System.out.println("browser Closed ");
	}

	@AfterSuite(alwaysRun = true)
	public void closeDBConnection() throws SQLException {
		du.connectionClose();
		System.out.println("Connection Closed");
	}

}
