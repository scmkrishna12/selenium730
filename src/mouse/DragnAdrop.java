package mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class DragnAdrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		d.get("http://jqueryui.com/droppable/");
		d.manage().window().maximize();
		
		d.switchTo().frame(0);
		
		Sleeper.sleepTightInSeconds(3);
		WebElement src= d.findElement(By.id("draggable"));
		WebElement tar= d.findElement(By.id("droppable"));
		
		Actions dd=new Actions(d);
		
		Sleeper.sleepTightInSeconds(2);
		dd.dragAndDrop(src, tar).build().perform();
		

		

	}

}
