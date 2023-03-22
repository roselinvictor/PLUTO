package com.journaldev.maven.classes;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Fees {
	
	WebDriver driver;
	HashMap<String,String> expectedHMap= new HashMap<String,String>();
	HashMap<String,String> actualHMap= new HashMap<String,String>();

	
	@Test (description="TC_006 Validation of the payfees",groups= {"Sanity","Regression"})
	public void fees_TC006()
	
	@BeforeClass	
	public void instantiateDriver()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	}
	public void launchBrowser(String url, RemoteWebDriver driver)
	{
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		driver.manage().window().maximize();
	}
	public void login(String name)
	{   
		driver.findElement(By.id("username")).sendKeys("ria1");
		driver.findElement(By.id("password")).sendKeys("Ria12345");
		driver.findElement(By.name("submit")).click();
		String expectedHMap = "ria1-Ria12345"
	    String actualHMap = driver.get(actualname);		
	    Assert.assertEquals(actualHMap,expectedHMap);
	    System.out.println("username,password");
	    
		
		
	}
	//span[normalize-space()='Fees']replaced with "+var+"
		//span[normalize-space()="var"]
		public void fees(String payfees)
		{
			driver.findElement(By.xpath("//span[normalize-space()='Fees']")).click();
			driver.findElement(By.xpath("//span[normalize-space()="+tabname+"]")).click();
			driver.findElement(By.xpath("//button[normalize-space()='fees']")).click();
		}
		//span[normalize-space()='Paynow']replaced with "+var+"
		//span[normalize-space()="var"
		public void payamount(String paynow) {
		}
		
		{
			String paynow;
			driver.findElement(By.xpath("//span[normalize-space()="+paynow+"]")).click();
			
		}
		//Using Select class for selecting value from dropdown
		WebElement ddown = driver.findElement(By.id("amount"));
		Select select = new Select(ddown);
		select.selectByIndex(5);
		select.selectByValue("1789");
		select.selectByVisibleText("$11");
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		public void fname void lname(String fname lname);
		{
			driver.findElement(By.id("name")).sendKeys("Roselin victor");
			String expectedfname = "Roselin victor"
			String actuallname = driver.get();
			Assert.assertEquals(expectedfname, actuallname);
		}
		
		//Using Select class for selecting value from dropdown
		public void card name(string cardname, string card number)
		{
		WebElement dropdown =driver.findelement(By.name("card_name"));
		Select select1 = new Select(dropdown);
		
		select.selectByIndex(3);
		select.selectByValue("03");
		select.selectByVisibleText("Master card");
		
		String expected cardname="Mastercard"
		{
			driver.findElement(By.id("cid")).sendKeys("2345623426");
			//Using Select class for selecting value from dropdown
			WebElement month = driver.findElement(By.xpath("//select[contains(@id,'cardMonth')]")).click();
			Select month = new Select(monthlist);
			select.selectByIndex(5);
			select.selectByValue("05");
			select.selectByVisibleText("May 05");
		    System.out.println(selectedmonth.getText());
		    List<WebElement> allValues = day.getoptions();
		    System.out.println(allvalues.size();i++);
		    for (int i=0:i<index.size();i++)
		    System.out.println(values.get(i).getText());
		    {
		    	WebElement year =driver.findElement(By.xpath("//select[contains(@name,'CCExpiresYear')]")).click();
			    Select Year = new Select(CCExpiresyear);
			    select.selectByVisibleText("2018");
			    select.selectByValue("18");
			    System.out.println(SelectCCEcpiresyear.getText());
			    List<WebElement> allValues = day.getoptions();
			    System.out.println(allvalues.size();i++);
			    for (int i=0:i<value.size();i++
			    System.out.println(values.get(i).getText());
			    
			    driver.findElement(By.name("3digitcode")).sendkeys("123");
			    
			    driver.findElement(By.xpath("//input[@value='submit']")).click();
			    
			    driver.close();
		    }
		}
		
		
		
		
				
		
}

	
	
	
	
	
	