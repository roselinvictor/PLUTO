package com.journaldev.maven.classes;

	import java.io.IOException;
import java.util.HashMap;

import javax.security.auth.spi.LoginModule;

import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.journaldev.maven.classes.pages.AppLibrary;
import com.journaldev.maven.classes.pages.LoginPage;
import com.journaldev.maven.lib.BaseClass;

	public class LoginTest<HomePage> extends BaseClass {
		
		
		HashMap<String,String> expectedHMap= new HashMap<String,String>();
		HashMap<String,String> actualHMap= new HashMap<String,String>();
		
		@Parameters({"username","password"})
		@Test(description="TC_001 Login with valid creds",groups= {"Sanity","Regression"})
		public void validateBooking_TC001(String username,String password)
		{
			LoginModule loginPage = new LoginPage(driver);
			HomePage homePage = loginPage.login(username,password);
			AssertJUnit.assertTrue(homePage.getcurrentTitle().contains("home"));
		}
		@Parameters({"username","invpassword"})
		@Test(description="TC_002 Login with invalid creds",groups= {"Sanity","Regression"})
		public void validateBooking_TC002_invalid_creds(String username,String invpassword)
		{
			LoginPage loginPage = new LoginPage(driver);
		    loginPage.login(username,invpassword);
		    String actual = loginPage.getLoginErrMessage();
			String expected="Wrong username and password.";
			AssertJUnit.assertEquals(actual,expected);
		}
		
		@DataProvider(name="DP")
		public String[][] feedDP() throws IOException
		{
			String filePath = System.getProperty("user.dir")+ "//inputData.xlsx";
			String data[][] = AppLibrary.readXlsx(filePath);
			return data;
		}
		
		@Test(dataProvider="DP",description="TC_003 Login with valid creds via xlsx",groups= {"Sanity","Regression"})
		public void validateBooking_TC003_xlsx(String username,String password,String expectedMsg)
		{
			LoginPage loginPage = new LoginPage(driver);
			HomePage homePage = loginPage.login(username,password);
			 

}
