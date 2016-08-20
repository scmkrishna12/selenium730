package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown_testing {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		d.get("http://amazon.com");
		d.manage().window().maximize();
		
		
		 WebElement drop= d.findElement(By.id("searchDropdownBox"));
		  
		 List<WebElement> items= drop.findElements(By.tagName("option"));
		 System.out.println(items.size());
		 
		 for(int i=0;i<items.size();i++)
		 {
			 System.out.println(items.get(i).getText());
		 }
		 
		 
		 
		 
		 
	}

}
