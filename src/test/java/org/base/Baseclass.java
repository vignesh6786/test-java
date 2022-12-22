package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;
	
	public static void launchBrower() {
		//WebDriver driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();
		
	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
		
	}
		
	public static void launchurl() {
		driver.get("https://www.facebook.com/");
		
	}	

		
				
				
				

	}


