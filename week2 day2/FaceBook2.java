package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");	
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Swetha");
		driver.findElement(By.name("lastname")).sendKeys("K");
		driver.findElement(By.name("reg_email__")).sendKeys("9092992231");
		driver.findElement(By.id("password_step_input")).sendKeys("Logeswari@19");
		
		//for selecting the date
		WebElement eledropdown1=driver.findElement(By.id("day"));
		Select obj1=new Select(eledropdown1);
        obj1.selectByValue("31");
                                          
        //for selecting the month
        WebElement eledropdown2=driver.findElement(By.id("month"));
		Select obj2=new Select(eledropdown2);
		obj2.selectByValue("5");
		
		//for selecting the year
		WebElement eledropdown3=driver.findElement(By.id("year"));
		Select obj3=new Select(eledropdown3);
		obj3.selectByValue("2000");
		
	    // for selecting the Gender
	    //for selecting female
		
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
		// for closing the application
		//driver.close();
	
	}
}
