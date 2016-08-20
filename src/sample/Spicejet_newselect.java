package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet_newselect {

	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		//Launch App
		WebDriver d=new ChromeDriver();
		d.get("http://www.spicejet.com/");
		d.manage().window().maximize();
		
		
		//OneWay search
		Thread.sleep(2000);
		//oneway radio btn
		d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//leaving from
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		//click on hyd
		d.findElement(By.linkText("Hyderabad (HYD)")).click();
		
		Thread.sleep(2000);
		//click on Banglore
		d.findElement(By.linkText("Bengaluru (BLR)")).click();
		//Date
		d.findElement(By.linkText("20")).click();
		Thread.sleep(2000);
		//Adults
		new Select(d.findElement(By.id("ctl00_mainContent_ddl_Adult"))).
						selectByVisibleText("4 Adults");
		Thread.sleep(2000);
		//Children
		new Select(d.findElement(By.id("ctl00_mainContent_ddl_Child"))).
							selectByVisibleText("2 Children");
		Thread.sleep(2000);
		//find flights
		d.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
