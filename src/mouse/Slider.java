package mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Slider {

	public static void main(String[] args) {
		
		//WebDriver d=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		d.get("http://jqueryui.com/slider/#slider-vertical");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		d.switchTo().frame(0);
		//identify slider point
		WebElement src= d.findElement(By.xpath(".//*[@id='slider-vertical']/span"));
		
		int y=  src.getLocation().y;
	
		Actions sldr=new Actions(d);
		Sleeper.sleepTightInSeconds(2);
		
		sldr.dragAndDropBy(src, 60, y).build().perform();
		
		
	
		
		
		
		
		
		

	}

}











