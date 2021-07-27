package com.cucumber.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BaseClass {
	

	protected static WebDriverWait wait=null;
	public static WebDriver driver;
	public static Properties prop;

	public BaseClass() {
		
		//calling file from configure properties
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Baba Rahul\\Desktop\\java\\Cucumber_Group_Hackathon\\src\\main\\java\\com\\cucumber\\base\\config.properties");
				prop.load(ip);
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	//public  WebDriver initialization() {
		public static void initialization() {
			
			String browserName = prop.getProperty("browser");
			
			if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","G:\\chrome\\chromedriver.exe");
				driver = new ChromeDriver();
				
			}
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//return driver;
		
}
	/*	public void launchURL() {
			driver.get(prop.getProperty("url"));
		}
		*/
	/*public void getTitle() {
		String title = driver.getTitle();
        Assert.assertEquals(title, "Your Store");
        
	}
	*/
	
	public void Close() {
		driver.quit();
	}
	



}
