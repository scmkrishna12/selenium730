package sample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element_exist {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		d.get("http://google.com");
		d.manage().window().maximize();
		
		//webpage html source code
       String str=		d.getPageSource();
       
       System.out.println(str);
       
       if(str.contains("Gmail"))
       {
    	   System.out.println("element is exist");
       }

       else
       {
    	   System.out.println("element is  not exist");
       }   
       
       
	}

}
