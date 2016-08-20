package mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Right_click {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		d.get("http://google.com");
		d.manage().window().maximize();
		
		//identify Gmail Link
		 WebElement src=d.findElement(By.xpath("html/body/div/div[3]/div[1]/div/div/div/div[1]/div[1]/a"));
		
		 Actions rc=new Actions(d);
			Sleeper.sleepTightInSeconds(3);
			
			rc.doubleClick(src).perform();
		
			
			
			
		

	}

}
