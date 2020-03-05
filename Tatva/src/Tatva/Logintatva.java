package Tatva;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Logintatva {
	
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
		Thread.sleep(3000);
		driver.findElement(By.t")).click();
        
}
}