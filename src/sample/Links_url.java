package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_url {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		d.get("http://google.com");
		d.manage().window().maximize();
		
		
		List<WebElement> links= d.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			
			if( ! links.get(i).getText().isEmpty())
			{
			links.get(i).click();
			String url= d.getCurrentUrl();
			System.out.println(url);
			d.navigate().back();
			
			links= d.findElements(By.tagName("a"));
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
