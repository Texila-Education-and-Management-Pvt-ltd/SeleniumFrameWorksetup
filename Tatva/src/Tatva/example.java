package Tatva;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class example {


    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
       WebDriver driver= new ChromeDriver();
       
       String baseurl = "https://texila.tatvadesk.com/#/";
       String expectedtitle="Tatva Desk";
       String actualtitle = "";
       driver.get(baseurl);
       
       actualtitle= driver.getTitle();
       
       if(actualtitle.contentEquals(expectedtitle)) {
    	   System.out.println("Pass");
       }
       else {
    	   System.out.println("fail");
       }
    }
       
       
    }

