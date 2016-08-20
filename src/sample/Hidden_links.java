package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_links {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		d.get("http://google.com");
		d.manage().window().maximize();
		
		
		List<WebElement> links= d.findElements(By.tagName("a"));
		System.out.println("total links======"+links.size());
		
		
		int count=0;
		
		for(int i=0;i<links.size();i++)
		{
			
			if( !  links.get(i).getText().isEmpty())
			{
				
				count++;  //count=count+1
				
			}
		}
		
		System.out.println("Total Visible Links===="+count);
		System.out.println("Total Hidden Links====="+(links.size()-count));
	
	}

}



