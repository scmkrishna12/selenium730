package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		//Launch App
		WebDriver d=new ChromeDriver();
		d.get("http://www.google.com/");
		d.manage().window().maximize();
		
		d.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("selenium");
		
		d.findElement(By.xpath("html/body/div/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[2]/div/div/div/button")).click();

	}

}
