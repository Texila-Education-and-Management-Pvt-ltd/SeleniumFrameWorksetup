package Tatva;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Calendar {
	
		public static void main(String[] args) throws Exception
		{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://texila.tatvadesk.com/#/");
		WebElement element=null;
		element=driver.findElement(By.id("username"));
		element.sendKeys("INC1821");
		element=driver.findElement(By.id("password"));
		element.sendKeys("Texila@123");
		driver.findElement(By.xpath("/html/body/auth-root/app-login/div/div/div/form/div/div/mat-card-actions/button/span")).click();
        Thread.sleep(1000);
        
        
		driver.findElement(By.xpath("//*[@id=\"navbar-mobile\"]/ul[2]/li[3]/a/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/people-root/common-header/div[1]/div[3]/ul[2]/li[3]/div/div/div/div[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/calendar-root/div/div/app-index/full-calendar/div[2]/div/table/tbody/tr/td/div/div/div[4]/div[2]/table/thead/tr/td[5]/span")).click();
		
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("document.getElementByclassName('fc-day-top fc-thu fc-today').value='2020-02-27'");

		}
}

