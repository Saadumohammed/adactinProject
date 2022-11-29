package AdactinProject.Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinSeleniumFramework {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("mohammedsadiq");
		driver.findElement(By.id("password")).sendKeys("Mohammedsadiq@123");
		driver.findElement(By.id("login")).click();
		
		WebElement Location = driver.findElement(By.cssSelector(".search_combobox"));
		Select s = new Select(Location);
		s.selectByValue("London");
		
		
		
		WebElement Hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(Hotel);
		s1.selectByValue("Hotel Sunshine");
		
		
		WebElement room = driver.findElement(By.id("room_type"));		
		Select s2 = new Select(room);
		s2.selectByIndex(3);
		
		
		WebElement guests = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(guests);
		s3.selectByVisibleText("3 - Three");
		
		
		WebElement fromDate = driver.findElement(By.className("date_pick"));
		fromDate.sendKeys("18/11/2022");
		
		WebElement toDate = driver.findElement(By.id("datepick_out"));
		toDate.sendKeys("22/11/2022");
		
		
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adultRoom);
		s4.selectByIndex(1);
	
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select s5 = new Select(child);
		s5.selectByIndex(0);
		
		driver.findElement(By.id("Submit")).click();
		
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		
		
		
		
		
			

	}

}
