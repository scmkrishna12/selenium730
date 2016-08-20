package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Alerts {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		d.get("http://www.spicejet.com/");
		d.manage().window().maximize();
		//click find flights button
		d.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		Sleeper.sleepTightInSeconds(2);
	  
		String str=	d.switchTo().alert().getText();
	    System.out.println(str);
	  
	  Sleeper.sleepTightInSeconds(2);
	  
	  d.switchTo().alert().accept();
	}

}
