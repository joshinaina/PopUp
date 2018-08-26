package popupss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class popupmessage {
	
	@Test
	
	
	
	
	public void wordpresslogin() {
		
		
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\LittleMonkey\\Desktop\\software\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		driver.findElement(By.id("user_login")).sendKeys("username");
		
		driver.findElement(By.id("user_pass")).sendKeys("password");
		
		driver.findElement(By.id("wp-submit")).click();
		
	}
	
	@DataProvider(name="wordpressData")
	
	public void loginToWordPress(String username,String password)
	{
		
	}
	
	public Object[][] passData()
	
	{
		
		Object[][] data=new Object[3][2];
		
		data[0][0]="admin1";
		
		
		data[0][1]="demo1";
		
		data[1][0]="admin";
		
		data[1][1]="demo123";
		
		data[2][0]="admin2";
		
		data[2][1]="demo1234";
		
		return data;
		
		}
	
	
	

}
