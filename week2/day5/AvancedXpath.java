package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AvancedXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();	
				
	driver.findElement(By.xpath("//p[@class='top']/input[@id='username']")).sendKeys("Demosalesmanager");
	driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//label[text()='Password']//following::input[2]")).click();
	driver.findElement(By.xpath("//div[@id='label']/a[contains(text(),'CRM/SFA')]")).click();
	

	}

}
