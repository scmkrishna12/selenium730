package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Radiobutton2 {
	
  @Test
  public void f() {
	 // System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
	  
	  FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
	
		//xpath of the complete block of 2 radio groups
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
			
		//loop for 2 groups
		for(int k=1;k<=2;k++)
			{
			   //identify the group radio buttons
			   List<WebElement> radio=block.findElements(By.name("group"+k));
			  
			   //loop for group radio buttons( 3)
			   for(int i=0;i<radio.size();i++)
		 	   {
				   radio.get(i).click();
				  
				   //loop for print group all radio btns values after click radio button
				   for(int j=0;j<radio.size();j++)
				   {
					   System.out.println(radio.get(j).getAttribute("value")+"---"
							   		+radio.get(j).getAttribute("checked"));
				   }
				   System.out.println("########################");
				}
			}
			
  }
  

  
}
