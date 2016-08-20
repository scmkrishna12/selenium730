package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxesTesting1 {
	
	
	@Test
	public void  checkBoxesTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://echoecho.com/htmlforms09.htm");
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List<WebElement> check=block.findElements(By.tagName("input"));
	
		//  (  OR )  identify the xpath for block
		 
		//	List<WebElement> check=driver.findElements(By.xpath
		     //     ("//td[@class='table5']/input[@type='checkbox']"));
		
		System.out.println(check.size());
		for(int i=0;i<check.size();i++)
		{
			System.out.println(check.get(i).getAttribute("value")+"--"
		                        +check.get(i).getAttribute("checked"));
		}
		
		
		
		
		
		
		
	}

}
