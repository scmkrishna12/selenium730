package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath12 {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		d.get("http://google.com");
		d.manage().window().maximize();
		
		
		d.findElement(By.xpath("//input[@id='lst-ib' and @type='text']")).sendKeys("olympics");

	}

}
