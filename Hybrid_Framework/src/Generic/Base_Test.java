package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Framework_constant.FrameWork_Constants;

public class Base_Test implements FrameWork_Constants {
	public WebDriver driver;
@BeforeMethod
public void Openapp() {
	System.setProperty(Chrome_key,Chrome_value);
	 driver=new ChromeDriver();
	 driver.get(baseURL);
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	
}
@AfterMethod
public void closeapp() {
	
//driver.close();
}
}
