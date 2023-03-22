package com.journaldev.maven.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Payfees {
	
	@Test(description="TC_006 Validation of the payfees",groups= {"Sanity","Regression"})
	public void Payfeespage_TC006()
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("ria1");
		driver.findElement(By.id("password")).sendKeys("Ria12345");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Fees']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Pay Now']")).click();
	    driver.findElement(By.id("amount")).sendKeys("$11");
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.findElement(By.id("name")).sendKeys("Roselin victor");
		driver.findElement(By.id("card_name")).sendKeys("visa");
		driver.findElement(By.id("cid")).sendKeys("2345623426");
		driver.findElement(By.id("cardmonth")).sendKeys("march");
		driver.findElement(By.id("cardyear")).sendKeys("2024");
		driver.findElement(By.id("cvv")).sendKeys("123");
		driver.findElement(By.xpath("//input[@value='submit']")).click();
		driver.close();
		
		
		
		
		
	}
	

}
