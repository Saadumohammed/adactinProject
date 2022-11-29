package com.adactin.runner;

import java.util.concurrent.TimeUnit;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ELCOT\\eclipse-workspace\\Adactin.Framework\\src\\test\\java\\com\\adaction\\feature\\adactin.feature",
glue = "com.adactin.stepdefinition", monochrome= true, dryRun = false, 
strict = true,
tags="@tag1",plugin = {"html:reports/HtmlReport","pretty","json:reports/JsonReports.json","com.cucumber.listener.ExtentCucumberFormatter:reports/ExtentReport.html"}
)
//
public class RunnerClass {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();

	}
	
	

}
