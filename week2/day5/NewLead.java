package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();	
				
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Contacts")).click();
	    driver.findElement(By.linkText("Create Contact")).click();
	    driver.findElement(By.id("firstNameField")).sendKeys("Swetha");
	    driver.findElement(By.id("lastNameField")).sendKeys("K");
	    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Swetha");
	    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("K");
	    driver.findElement(By.id("createContactForm_departmentName")).sendKeys("xxx");
	    driver.findElement(By.name("description")).sendKeys("yyyy");
	    driver.findElement(By.className("inputBox")).sendKeys("swethairis31@gmail.com");
	    
	    WebElement state=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
        Select obj=new Select(state);
        obj.selectByVisibleText("New York"); 
        
        driver.findElement(By.name("submitButton")).click();
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.name("description")).clear();
        driver.findElement(By.name("description")).sendKeys("this is important");
        
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
        String title=driver.getTitle();
	    System.out.println(title);
			      
	    
			    

	}

}
