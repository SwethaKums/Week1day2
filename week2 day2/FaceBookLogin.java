package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLogin {

	public static void main(String[] args) {
		
		//to open the browser and launch the url
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		
		//to login the Application
		
		driver.findElement(By.id("email")).sendKeys("rahul.rasher.14@facebook.com ");
		driver.findElement(By.id("pass")).sendKeys("xxxxxxx");
		driver.findElement(By.name("login")).click();
	}

}
