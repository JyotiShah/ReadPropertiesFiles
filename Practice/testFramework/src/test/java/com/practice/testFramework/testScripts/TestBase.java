package com.practice.testFramework.testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.practice.testFramework.helper.ObjectReader;
import com.practice.testFramework.helper.PropertiesReader;

public class TestBase {

	public static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
			ObjectReader.reader = new PropertiesReader();
			setupDriver();
			getUrl(ObjectReader.reader.getURL());
	}
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	
	public void setupDriver(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void getUrl(String url) {
		driver.get(url);
	}
}
