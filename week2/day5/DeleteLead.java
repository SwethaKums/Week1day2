package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();	
				
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Find Leads")).click();
	    
	   // driver.findElement(By.linkText("L")).click();
	    
	    driver.findElement(By.linkText("Phone")).click();
	    driver.findElement(By.name("phoneNumber")).sendKeys("9092992231");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    Thread.sleep(5000);
	    
	    driver.findElement(By.linkText("10626")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
	    driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.name("id")).sendKeys("10626");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    
	    
	}

}
