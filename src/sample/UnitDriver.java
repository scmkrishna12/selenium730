package sample;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class UnitDriver {

	
	public static void main(String[] args) {
		
		HtmlUnitDriver d=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		d.get("http://google.com");
		
		System.out.println(d.getTitle());
		
	}

}
