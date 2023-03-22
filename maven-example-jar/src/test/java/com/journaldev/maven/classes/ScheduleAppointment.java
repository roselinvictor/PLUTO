package com.journaldev.maven.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScheduleAppointment {
	
	@Test

	public void validateBooking()
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("ria1");
		driver.findElement(By.id("password")).sendKeys("ria12345");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("/span[normalize-space()='Schedule Appointment']")).click();
		driver.findElement(By.xpath("//input[@value='Create new appointment']")).click();
		driver.findElement(By.xpath("//h4[normalize-space()='Dr.Beth']/ancestor::ul/following-sibling::button")).click();
		
		
		
		
		
		
		
		
	}

}
