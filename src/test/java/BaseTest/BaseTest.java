package BaseTest;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest {
	
	public WebDriver driver=null;
	public FileInputStream fis=null;
	public Properties prop;
	public ExtentReports report=null;
	public ExtentTest test=null;
	/*
	
	 * methodname:loadConfig
	 * description:this is to load properties file
	 * return:null
	 */
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void loadConfig() {
		try {
			fis=new FileInputStream("config.properties");
			prop=new Properties();
			prop.load(fis);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void initiateDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	
	public void launchUrl() {
		driver.get("https://www.expedia.ca/?pwaLob=wizard-hotel-pwa");
	}
	
	public void  waitUntilClickable(WebElement element , int time) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,time );
			wait.until(ExpectedConditions.elementToBeClickable(element));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public boolean isElementPresent(WebElement element, int time) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,time );
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		}catch(Exception e) {
			return false;
		}
	}
				

	
}
