package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class grd {
	
	@Test
	public void loginTest() throws MalformedURLException, Exception
	{
		
		
		DesiredCapabilities cap=null;
	
		cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("qedge.ram@gmail.com");
		driver.findElement(By.id("next")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("Passwd")).sendKeys("dfdsfdsfdsfds");
		driver.findElement(By.id("signIn")).click();
		
		
	}

	
	






}
