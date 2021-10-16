package com.ddf.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	 public static void main(String[] args) throws InterruptedException {  
         
	       // System Property for Chrome Driver   
	        System.setProperty("webdriver.chrome.driver", "D:\\Java jars TQ\\Chromedriver\\Chrome\\chromedriver.exe");  
	  
	        // Instantiate a ChromeDriver class.      
	        WebDriver driver=new ChromeDriver();  
	  
	        // Launch Website  
	        driver.navigate().to("https://register.rediff.com/register/register.php?FormName=user_details");   
	  
	        Thread.sleep(3000);
	//Using Select class for selecting value from dropdown  
	      
	Select dropdown = new Select(driver.findElement(By.id("country")));  
	dropdown.selectByVisibleText("Australia");  
	  Thread.sleep(3000);
	    // Close the Browser  
	        driver.close();  
	  
	  
	    }  
}
