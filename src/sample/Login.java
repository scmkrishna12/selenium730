package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		//Launch App
		WebDriver d=new ChromeDriver();
		d.get("http://professional.demo.orangehrmlive.com/");
		d.manage().window().maximize();
		
		//Login APP
		
		
		Thread.sleep(3000);
		d.findElement(By.id("txtUsername")).sendKeys("Admin");
		d.findElement(By.id("txtPassword")).sendKeys("admin");
		d.findElement(By.name("Submit")).click();
		
		//Logout App
		Thread.sleep(3000);
		d.findElement(By.id("welcome")).click();
		d.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		//close App
		
		d.close();
	

	}

}

