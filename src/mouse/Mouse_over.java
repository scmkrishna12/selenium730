package mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Mouse_over {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		d.get("http://emirates.com");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(4);
		//xpath for Destinations
		WebElement src= d.findElement(By.xpath("html/body/form/header/div[2]/nav/div/ul/li[4]/a/span[1]"));
		//xpath for Book
		WebElement src12=d.findElement(By.xpath("html/body/form/header/div[2]/nav/div/ul/li[1]/a/span[1]"));
		
		Actions mo=new Actions(d);
		Sleeper.sleepTightInSeconds(3);
		
		mo.moveToElement(src).moveToElement(src12).build().perform();
		
		
		
		
		

	}

}
