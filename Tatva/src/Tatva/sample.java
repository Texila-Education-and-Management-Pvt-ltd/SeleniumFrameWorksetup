package Tatva;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class sample {

    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
    	WebDriver driver =new ChromeDriver();
    	driver.manage().window().maximize();
    //    String alertMessage = "";
        driver.get("http://jsbin.com/usidix/1");
      //  driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
//        alertMessage = driver.switchTo().alert().getText();
  //      driver.switchTo().alert().accept();
        driver.getCurrentUrl();
        driver.getClass();
        
    //    System.out.println(alertMessage);
        //driver.quit();
       
    }
}